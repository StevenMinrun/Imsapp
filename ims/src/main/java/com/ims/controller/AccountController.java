package com.ims.controller;

import com.ims.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Account)表控制层
 *
 * @author Steven
 */
@RestController
@RequestMapping("account")
@Slf4j // 日志
@CrossOrigin
public class AccountController {

    /**
     * 服务对象
     */
    @Autowired
    private AccountService service;


}