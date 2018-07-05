package com.smmot.suamo.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class HttpAspect {

    private  static final Logger logger= LoggerFactory.getLogger(HttpAspect.class);


    @Pointcut("execution(public * com.smmot.suamo.controller.*.*(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        logger.info("方法开始执行！！！");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=attributes.getRequest();
        //url
        logger.info("url={}",request.getRequestURL());
        //method
        logger.info("请求方式："+"method={}",request.getMethod());
        //ip
        logger.info("IP地址"+"ip={}",request.getRemoteAddr());
        //类方法
        logger.info("请求的类方法："+"class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //参数
        logger.info("参数："+"args={}",joinPoint.getArgs());
    }

    //获取返回的内容
    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        logger.info("返回的内容："+"response={}",object+"\n"+"------------------------------------------------------------------------");
    }

    @After("log()")
    public void doAfter(){
        logger.info("方法执行结束！！！");
    }
}
