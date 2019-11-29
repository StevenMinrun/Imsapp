package com.ims.controller;

import com.ims.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Goods)表控制层
 *
 * @author Steven
 */
@RestController
@RequestMapping("goods")
@Slf4j // 日志
@CrossOrigin
public class GoodsController {

    /**
     * 服务对象
     */
    @Autowired
    private GoodsService service;


}