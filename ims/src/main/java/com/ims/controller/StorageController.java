package com.ims.controller;

import com.ims.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Storage)表控制层
 *
 * @author Steven
 */
@RestController
@RequestMapping("storage")
@Slf4j // 日志
@CrossOrigin
public class StorageController {

    /**
     * 服务对象
     */
    @Autowired
    private StorageService service;

}