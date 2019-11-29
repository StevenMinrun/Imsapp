package com.ims.dao;

import com.ims.entity.Account;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * (Account)表数据库访问层
 *
 * @author Steven
 */
public interface AccountDao extends Mapper<Account> {

    /**
     * 关键词查询账户信息
     *
     * @param keyword 用户输入的关键词
     * @return 有关此关键字的账户集合
     */
    @Select("select * from account " +
            "where " +
            "name like concat('%',#{0},'%') " +
            "or " +
            "account_num like concat('%',#{0},'%') " +
            "or " +
            "holder like concat('%',#{0},'%') " +
            "or " +
            "type like concat('%',#{0},'%') ")
    public List<Account> selectAccountsByKeyword(String keyword);
}