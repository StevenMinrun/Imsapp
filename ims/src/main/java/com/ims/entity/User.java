package com.ims.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * (User)登录用户实体类
 *
 * @author Steven
 */
@Table(name = "user")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -70125505630591889L;

    // 主键
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    // 姓名
    private String name;

    // 电话
    private String tel;

    // 密码
    private String password;

    // 性别
    private String gender;

    // 邮箱
    private String email;

    // 备注
    private String note;

    // 头像
    private String icon_img;

    // 公司名称
    private String company_name;

    // 公司地址
    private String company_address;

    // 公司电话
    private String company_tel;

}