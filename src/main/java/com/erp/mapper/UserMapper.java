package com.erp.mapper;

import com.erp.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User login(@Param("username") String username,@Param("password") String password);
}
