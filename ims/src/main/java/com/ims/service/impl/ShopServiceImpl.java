package com.ims.service.impl;

import com.ims.dao.ShopDao;
import com.ims.entity.Shop;
import com.ims.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * (Shop)表服务实现类
 *
 * @author Steven
 */
@SuppressWarnings("ALL")
@Service
@Transactional
public class ShopServiceImpl extends BaseServiceImpl<Shop> implements ShopService {

    @Autowired
    private ShopDao dao;


}