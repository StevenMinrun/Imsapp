package com.ims.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (Customer)客户实体类
 *
 * @author Steven
 */
@Data
@Table(name = "customer")
public class Customer {

    // 主键
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    // 名称
    private String name;

    // 联系人
    private String contact;

    // 应收金额
    private Double get_money;

    // 手机号
    private String tel;

    // 分类
    private String category;

    // 启用状态
    private String status;

    // 折扣
    private Integer discount;

    // 邮箱
    private String email;

    // 传真
    private String fax;

    // 性别
    private String gender;

    // 地址
    private String address;

    // 发货方式
    private String delivery;

}
