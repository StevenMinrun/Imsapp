package com.ims.dao;

import com.ims.entity.Supplier;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * (Supplier)表数据库访问层
 *
 * @author Steven
 */
public interface SupplierDao extends Mapper<Supplier> {

    /**
     * 关键词查询供应商信息
     *
     * @param keyword 用户输入的关键词
     * @return 有关此关键字的供应商集合
     */
    @Select("select * from supplier " +
            "where " +
            "name like concat('%',#{0},'%') " +
            "or " +
            "contact like concat('%',#{0},'%') " +
            "or " +
            "tel like concat('%',#{0},'%') " +
            "or " +
            "category like concat('%',#{0},'%') " +
            "or " +
            "email like concat('%',#{0},'%') " +
            "or " +
            "fax like concat('%',#{0},'%') " +
            "or " +
            "gender like concat('%',#{0},'%') " +
            "or " +
            "address like concat('%',#{0},'%') ")
    public List<Supplier> selectSupplierByKeyword(String keyword);
}