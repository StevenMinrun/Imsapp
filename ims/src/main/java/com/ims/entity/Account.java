package com.ims.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (Account)账户实体类
 *
 * @author Steven
 */
@Data
@Table(name = "account")
public class Account {

    // 主键
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    // 账户名字
    private String name;

    // 账号
    private String account_num;

    // 开户人
    private String holder;

    // 账户类型
    private String type;

    // 账户余额
    private Double balance;

    // 期初金额
    private Double initial_money;

    // 备注
    private String note;

    // 启用状态
    private String status;

}
