package com.ims.service.impl;

import com.ims.dao.SupplierDao;
import com.ims.entity.Supplier;
import com.ims.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (Supplier)表服务实现类
 *
 * @author Steven
 */
@SuppressWarnings("ALL")
@Service
@Transactional
public class SupplierServiceImpl extends BaseServiceImpl<Supplier> implements SupplierService {

    @Autowired
    private SupplierDao dao;


}