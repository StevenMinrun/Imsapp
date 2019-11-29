package com.ims.dao;

import com.ims.entity.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author Steven
 */
public interface UserDao extends Mapper<User> {

    /**
     * 通过手机号和密码登录
     *
     * @param tel 用户手机号
     * @param password 用户密码
     * @return 是否存在此用户
     */
    @Select("select * from user where tel = #{tel} and password = #{password}")
    public User selectUserByTelAndPwd(String tel, String password);

    /**
     * 按手机号码查找用户
     *
     * @param tel 用户手机号
     * @return
     */
    @Select("select * from user where tel = #{tel}")
    public User selectByTel(String tel);


    /**
     * 关键词查询用户信息
     *
     * @param keyword 用户输入的关键词
     * @return 有关此关键字的用户集合
     */
    @Select("select * from user " +
            "where " +
            "name like concat('%',#{0},'%') " +
            "or " +
            "account like concat('%',#{0},'%') " +
            "or " +
            "tel like concat('%',#{0},'%') " +
            "or " +
            "password like concat('%',#{0},'%') " +
            "or " +
            "gender like concat('%',#{0},'%') " +
            "or " +
            "email like concat('%',#{0},'%') " +
            "or " +
            "company_name like concat('%',#{0},'%') " +
            "or " +
            "company_address like concat('%',#{0},'%') " +
            "or " +
            "company_tel like concat('%',#{0},'%') ")
    public List<User> selectUsersByKeyword(String keyword);
}