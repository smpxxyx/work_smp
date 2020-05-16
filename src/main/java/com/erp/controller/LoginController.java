package com.erp.controller;

import com.erp.pojo.User;
import com.erp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    @ResponseBody
    public boolean login(String username,String password,HttpSession session){
        User user= userService.login(username,password);
        if(user!=null){
            session.setAttribute("user",user);
            return true;
        }else{
            //登录失败--绑定转发给login.html
            return false;
        }

    }

}
