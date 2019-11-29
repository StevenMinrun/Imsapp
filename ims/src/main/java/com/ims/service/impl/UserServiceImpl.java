package com.ims.service.impl;


import com.ims.dao.UserDao;
import com.ims.entity.User;
import com.ims.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (User)表服务实现类
 *
 * @author Steven
 */
@SuppressWarnings("ALL")
@Service
@Transactional
@Slf4j
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserDao dao;


}