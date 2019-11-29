package com.ims.service.impl;

import com.ims.dao.OrderDao;
import com.ims.entity.Order;
import com.ims.service.OrderService;
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
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService {

    @Autowired
    private OrderDao dao;

}