package com.ims.controller;

import com.ims.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Order)表控制层
 *
 * @author Steven
 */
@RestController
@RequestMapping("order")
@Slf4j // 日志
@CrossOrigin
public class OrderController {

    /**
     * 服务对象
     */
    @Autowired
    private OrderService service;

}