package com.smmot.suamo.core.baseservice;

import java.util.List;

public interface BaseService<T> {

    /**
     * 添加
     * @param t
     * @return
     */
    public Integer insert(T t);

    /**
     * 根据条件逻辑删除信息（更改delstatus字段）
     * @param t
     * @return
     */
    public Integer logicalDeletion(T t);

    /**
     * 修改
     * @param t
     * @return
     */
    public Integer update(T t);

    /**
     * 根据条件查询所有信息
     * @return
     */
    List<T> selectList();

    /**
     * 根据条件查询所有
     * @return
     */
    public List<T> selectList(T t);

    /**
     * 根据条件查询一条记录
     * @param t
     * @return
     */
    public T selectOne(T t);





}
