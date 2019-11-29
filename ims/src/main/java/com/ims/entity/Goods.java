package com.ims.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (Goods)商品实体类
 *
 * @author Steven
 */
@Data
@Table(name = "goods")
public class Goods {

    // 主键
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    // 名称
    private String name;

    // 货号
    private String art_num;

    // 采购价
    private Double cost;

    // 批发价
    private Double wholesale_price;

    // 零售价
    private Double retail_price;

    // 颜色
    private String color;

    // 尺寸
    private String size;

    // 图片
    private String pictures;

    // 库存数量
    private Integer quantity;

    // 商品条码
    private String barcode;

    // 备注
    private String note;

    // 品牌
    private String brand;

    // 分类
    private String category;

    // 单位
    private String unit;

    // 性别
    private String sex;

    // 材质
    private String material;

    // 款式
    private String style;

    // 季节
    private String season;

    // 年份
    private String year;

    // 启用状态
    private String status;

}
