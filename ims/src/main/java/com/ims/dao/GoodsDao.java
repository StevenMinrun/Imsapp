package com.ims.dao;

import com.ims.entity.Goods;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * (Goods)表数据库访问层
 *
 * @author Steven
 */
public interface GoodsDao extends Mapper<Goods> {

    /**
     * 关键词查询货品信息
     *
     * @param keyword 用户输入的关键词
     * @return 有关此关键字的货品集合
     */
    @Select("select * from goods " +
            "where " +
            "name like concat('%',#{0},'%') " +
            "or " +
            "art_num like concat('%',#{0},'%') " +
            "or " +
            "color like concat('%',#{0},'%') " +
            "or " +
            "size like concat('%',#{0},'%') " +
            "or " +
            "barcode like concat('%',#{0},'%') " +
            "or " +
            "brand like concat('%',#{0},'%') " +
            "or " +
            "category like concat('%',#{0},'%') " +
            "or " +
            "sex like concat('%',#{0},'%') " +
            "or " +
            "style like concat('%',#{0},'%') " +
            "or " +
            "season like concat('%',#{0},'%') " +
            "or " +
            "year like concat('%',#{0},'%') " +
            "or " +
            "material like concat('%',#{0},'%') ")
    public List<Goods> selectGoodsByKeyword(String keyword);
}