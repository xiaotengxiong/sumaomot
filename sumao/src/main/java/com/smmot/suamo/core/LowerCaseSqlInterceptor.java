package com.smmot.suamo.core;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

/**
 * Created by adams on 2017/4/11.
 */
@Intercepts({
        @Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class }),
        @Signature(type = Executor.class, method = "update", args = { MappedStatement.class, Object.class }) })
public class LowerCaseSqlInterceptor implements Interceptor {
    private static Logger logger	= LoggerFactory.getLogger( LowerCaseSqlInterceptor.class );

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object returnValue = null;
        String method = invocation.getMethod().getName();
        MappedStatement ms = (MappedStatement) invocation.getArgs()[ 0 ];
        String sqlId = ms.getId();
        Configuration configuration = ms.getConfiguration();
        BoundSql originBoundSql = ms.getSqlSource().getBoundSql( invocation.getArgs()[ 1 ] );
        long start = System.currentTimeMillis();
        returnValue = invocation.proceed();
        long end = System.currentTimeMillis();
        long time = (end - start);
        String sql = getSql( configuration, originBoundSql, sqlId, time );
        logger.info( "method type : {}, source sql : {}", method, sql );
        return returnValue;
    }

    @Override
    public Object plugin(Object target) {
        if (target instanceof Executor) {
            return Plugin.wrap( target, this );
        } else {
            return target;
        }
    }

    @Override
    public void setProperties(Properties properties) {

    }

    public static String getSql(Configuration configuration, BoundSql boundSql, String sqlId, long time) {
        String sql = showSql( configuration, boundSql );
        StringBuilder str = new StringBuilder( 100 );
        str.append( sqlId );
        str.append( ":" );
        str.append( sql );
        str.append( "\nrun time is :" );
        str.append( time );
        str.append( "ms" );
        return str.toString();
    }

    private static String getParameterValue(Object obj) {
        String value = null;
        if (obj instanceof String) {
            value = "'" + obj.toString() + "'";
        } else if (obj instanceof Date) {
            DateFormat formatter = DateFormat.getDateTimeInstance( DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.CHINA );
            value = "'" + formatter.format( new Date() ) + "'";
        } else {
            if (obj != null) {
                value = obj.toString();
            } else {
                value = "";
            }
        }
        return value;
    }

    public static String showSql(Configuration configuration, BoundSql boundSql) {
        Object parameterObject = boundSql.getParameterObject();
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
        String sql = boundSql.getSql().replaceAll( "[\\s]+", " " );
        if (parameterMappings.size() > 0 && parameterObject != null) {
            TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
            if (typeHandlerRegistry.hasTypeHandler( parameterObject.getClass() )) {
                sql = sql.replaceFirst( "\\?", getParameterValue( parameterObject ) );
            } else {
                MetaObject metaObject = configuration.newMetaObject( parameterObject );
                for (ParameterMapping parameterMapping : parameterMappings) {
                    String propertyName = parameterMapping.getProperty();
                    if (metaObject.hasGetter( propertyName )) {
                        Object obj = metaObject.getValue( propertyName );
                        sql = sql.replaceFirst( "\\?", getParameterValue( obj ) );
                    } else if (boundSql.hasAdditionalParameter( propertyName )) {
                        Object obj = boundSql.getAdditionalParameter( propertyName );
                        sql = sql.replaceFirst( "\\?", getParameterValue( obj ) );
                    }
                }
            }
        }
        return sql;
    }
}