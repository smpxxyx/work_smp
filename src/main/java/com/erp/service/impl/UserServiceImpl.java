package com.erp.service.impl;

import com.erp.mapper.UserMapper;
import com.erp.pojo.User;
import com.erp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String username, String password) {
        User user = userMapper.login(username, password);
        return user;
    }
}
