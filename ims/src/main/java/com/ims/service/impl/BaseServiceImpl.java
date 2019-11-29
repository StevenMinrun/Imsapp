package com.ims.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ims.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.util.List;

/**
 * 抽取的基础service的实现类
 * 功能：单个添加，按id单个删除，按id批量删除，分页查询，单个修改
 *
 * @param <T> 实体类
 */
@SuppressWarnings("ALL")
@Service
@Transactional
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    protected Mapper<T> mapper;

    /**
     * 单个添加
     *
     * @param entity
     * @return
     */
    public boolean add(T entity) {
        try {
            int i = mapper.insert(entity);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    /**
     * 单个修改
     *
     * @param entity
     * @return
     */
    public boolean modifyInfo(T entity) {
        try {
            int i = mapper.updateByPrimaryKey(entity);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    /**
     * 按id删除
     *
     * @param id
     * @return
     */
    public boolean deleteById(Serializable id) {
        try {
            int i = mapper.deleteByPrimaryKey(id);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    /**
     * 分页查询所有
     *
     * @param pageNum 当前页码
     * @param pageSize 页面显示数量
     * @return
     */
    public PageInfo<T> selectAllByPage(int pageNum, int pageSize) {
        // 1.使用PageHelper类设置起始页和每页显示的条数
        PageHelper.startPage(pageNum, pageSize);
        // 2. 调用查询方法
        List<T> list = mapper.selectAll();
        return new PageInfo<>(list);
    }

    /**
     * 批量删除
     *
     * @param ids 批量删除的id数组
     * @return
     */
    public boolean deleteBatchedById(int[] ids) {
        int count = 0;
        try {
            for (int id : ids) {
                boolean b = deleteById(id);
                if (!b) {
                    count++;
                }
            }
            if (count==0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

}