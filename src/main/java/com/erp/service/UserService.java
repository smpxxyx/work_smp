package com.erp.service;

import com.erp.pojo.User;

public interface UserService {
    User login(String username, String password);
}
