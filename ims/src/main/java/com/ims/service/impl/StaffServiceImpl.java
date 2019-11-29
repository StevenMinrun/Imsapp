package com.ims.service.impl;

import com.ims.dao.StaffDao;
import com.ims.entity.Staff;
import com.ims.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (Staff)表服务实现类
 *
 * @author Steven
 */
@SuppressWarnings("ALL")
@Service
@Transactional
public class StaffServiceImpl extends BaseServiceImpl<Staff> implements StaffService {

    @Autowired
    private StaffDao dao;


}