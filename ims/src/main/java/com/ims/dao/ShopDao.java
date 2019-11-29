package com.ims.dao;

import com.ims.entity.Shop;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * (Shop)表数据库访问层
 *
 * @author Steven
 */
public interface ShopDao extends Mapper<Shop> {

    /**
     * 关键词查询门店信息
     *
     * @param keyword 用户输入的关键词
     * @return 有关此关键字的门店集合
     */
    @Select("select * from shop " +
            "where " +
            "name like concat('%',#{0},'%') " +
            "or " +
            "tel like concat('%',#{0},'%') " +
            "or " +
            "address like concat('%',#{0},'%') ")
    public List<Shop> selectShopsByKeyword(String keyword);
}