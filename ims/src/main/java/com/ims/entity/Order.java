package com.ims.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (Order)商品实体类
 *
 * @author Steven
 */
@Data
@Table(name = "list")
public class Order {

    // 主键
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    // 订单号
    private String order_num;

    // 订单类型
    private Integer order_type;

    // 客户名称/供应商名称
    private String customer_supplier_name;

    // 仓库名称
    private String storage;

    // 商品名称
    private String goods_name;

    // 商品颜色
    private String goods_color;

    // 商品尺码
    private String goods_size;

    // 商品单价
    private Double goods_price;

    // 商品数量
    private Integer goods_count;

    // 合计总数量
    private Integer sum_count;

    // 合计总金额
    private Double sum_price;

    // 抹零金额
    private Double omit_odd;

    // 单据合计
    private Double order_sum;

    // 结算账户
    private String account;

    // 收款/付款金额
    private Double get_pay_money;

    // 客户尚欠款/欠供应商款
    private Double remain_money;

    // 操作员
    private String operator;

    // 业务日期
    private String date;

    // 发货方式
    private String delivery;

    // 备注
    private String note;

}
