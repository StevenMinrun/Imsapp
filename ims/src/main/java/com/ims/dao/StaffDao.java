package com.ims.dao;

import com.ims.entity.Staff;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * (Staff)表数据库访问层
 *
 * @author Steven
 */
public interface StaffDao extends Mapper<Staff> {

    /**
     * 关键词查询员工信息
     *
     * @param keyword 用户输入的关键词
     * @return 有关此关键字的员工集合
     */
    @Select("select * from staff " +
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
            "role like concat('%',#{0},'%') " +
            "or " +
            "shop like concat('%',#{0},'%') ")
    public List<Staff> selectStaffByKeyword(String keyword);
}