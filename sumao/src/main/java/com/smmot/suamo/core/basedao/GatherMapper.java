package com.smmot.suamo.core.basedao;


import java.util.List;

public interface GatherMapper <T> {

    /**
     * 添加信息
     * @param t
     * @return
     */
    Integer insert(T t);

    /**
     * 根据id逻辑删除信息（更改delstatus字段）
     * @param t
     * @return
     */
    Integer logicalDeletion(T t);


    /**
     * 修改信息
     * @param t
     * @return
     */
    Integer update(T t);


    /**
     * 根据条件查询一条信息
     * @param t
     * @return
     */
    T selectOne(T t);

    /**
     * 根据条件查询所有信息
     * @return
     */
    List<T> selectList(T t);

    /**
     * 根据条件查询所有信息
     * @return
     */
    List<T> selectList();
}
