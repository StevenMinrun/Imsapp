package com.ims.dao;

import com.ims.entity.Storage;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * (Storage)表数据库访问层
 *
 * @author Steven
 */
public interface StorageDao extends Mapper<Storage> {

    /**
     * 关键词查询账户信息
     *
     * @param keyword 用户输入的关键词
     * @return 有关此关键字的账户集合
     */
    @Select("select * from storage " +
            "where " +
            "name like concat('%',#{0},'%') " +
            "or " +
            "manager like concat('%',#{0},'%') " +
            "or " +
            "address like concat('%',#{0},'%') ")
    public List<Storage> selectStoragesByKeyword(String keyword);
}