package com.ims.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * (Staff)登录用户实体类
 *
 * @author Steven
 */
@Table(name = "staff")
@Data
public class Staff implements Serializable {
    private static final long serialVersionUID = -70125505630591889L;

    // 主键
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    // 姓名
    private String name;

    // 账号
    private String account;

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

    // 启用状态
    private String status;

    // 所属门店
    private String shop;

    // 所属角色
    private String role;
}