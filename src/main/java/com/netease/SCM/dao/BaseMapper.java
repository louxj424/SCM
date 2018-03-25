package com.netease.SCM.dao;

/**
 * Created by louxj424 on 2018/3/24.
 */
public interface BaseMapper<T> {
    //添加单个对象
    int insert(T entity);

    //删除单个对象
    int delete(T entity);

    //修改单个对象
    int update(T entity);

    //查询单个对象
    T select(T entity);
}
