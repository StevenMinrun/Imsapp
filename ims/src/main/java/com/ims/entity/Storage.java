package com.ims.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (Storage)仓库实体类
 *
 * @author Steven
 */
@Data
@Table(name = "storage")
public class Storage {

    // 主键
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    // 仓库名字
    private String name;

    // 负责人
    private String manager;

    // 启用状态
    private String status;

    // 地址
    private String address;

    // 备注
    private String note;

}
