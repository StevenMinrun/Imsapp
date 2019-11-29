package com.ims.dao;

import com.ims.entity.Customer;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * (Customer)表数据库访问层
 *
 * @author Steven
 */
public interface CustomerDao extends Mapper<Customer> {

    /**
     * 关键词查询客户信息
     *
     * @param keyword 用户输入的关键词
     * @return 有关此关键字的客户集合
     */
    @Select("select * from customer " +
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
    public List<Customer> selectCustomerByKeyword(String keyword);
}