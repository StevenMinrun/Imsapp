package com.ims.service;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;

public interface BaseService<T> {

    /**
     * 单个添加
     *
     * @param entity
     * @return
     */
    public boolean add(T entity) ;

    /**
     * 单个修改
     *
     * @param entity
     * @return
     */
    public boolean modifyInfo(T entity) ;

    /**
     * 按id删除
     *
     * @param id
     * @return
     */
    public boolean deleteById(Serializable id) ;

    /**
     * 分页查询所有
     *
     * @param pageNum 当前页码
     * @param pageSize 页面显示数量
     * @return
     */
    public PageInfo<T> selectAllByPage(int pageNum, int pageSize) ;

    /**
     * 批量删除
     *
     * @param ids 批量删除的id数组
     * @return
     */
    public boolean deleteBatchedById(int[] ids) ;

}
