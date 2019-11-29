package com.ims.service.impl;

import com.ims.dao.GoodsDao;
import com.ims.entity.Goods;
import com.ims.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (Goods)表服务实现类
 *
 * @author Steven
 */
@SuppressWarnings("ALL")
@Service
@Transactional
public class GoodsServiceImpl extends BaseServiceImpl<Goods> implements GoodsService {

    @Autowired
    private GoodsDao dao;


}