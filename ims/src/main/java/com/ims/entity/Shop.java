package com.ims.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (Shop)门店实体类
 *
 * @author Steven
 */
@Data
@Table(name = "shop")
public class Shop {

    // 主键
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    // 门店名称
    private String name;

    // 电话
    private String tel;

    // 地址
    private String address;


}
