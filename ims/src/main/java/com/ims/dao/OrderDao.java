package com.ims.dao;

import com.ims.entity.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * (Order)表数据库访问层
 *
 * @author Steven
 */
public interface OrderDao extends Mapper<Order> {

    /**
     * 关键词查询订单信息
     *
     * @param keyword 用户输入的关键词
     * @return 有关此关键字的订单集合
     */
    @Select("select * from list where order_type = #{order_type} group by order_num " +
            "having " +
            "customer_supplier_name like concat('%',#{keyword},'%') " +
            "or " +
            "operator like concat('%',#{keyword},'%') " +
            "or " +
            "order_num like concat('%',#{keyword},'%') " +
            "or " +
            "date like concat('%',#{keyword},'%') " +
            "or " +
            "storage like concat('%',#{keyword},'%') ")
    public List<Order> selectOrderByKeyword(String keyword, Integer order_type);

    /**
     * 查询所有order_type类型的订单
     *
     * @param order_type 订单类型
     * @return
     */
    @Select("select * from list where order_type = #{order_type} group by order_num")
    public List<Order> selectAllLists(Integer order_type);

    /**
     * 查询单号为order_num的订单详情
     *
     * @param order_num 订单单号
     * @return
     */
    @Select("select * from list where order_num = #{order_num}")
    public List<Order> selectListDetails(String order_num);

    @Delete("delete from list where order_num = #{order_num}")
    public int deleteByOrder_num(String order_num);
}