package com.ims.service.impl;

import com.ims.dao.StorageDao;
import com.ims.entity.Storage;
import com.ims.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (Storage)表服务实现类
 *
 * @author Steven
 */
@SuppressWarnings("ALL")
@Service
@Transactional
public class StorageServiceImpl extends BaseServiceImpl<Storage> implements StorageService {

    @Autowired
    private StorageDao dao;


}