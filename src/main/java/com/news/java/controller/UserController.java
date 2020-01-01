package com.news.java.controller;

import com.news.java.Service.UserService;
import com.news.java.common.api.CommonResult;
import com.news.java.common.api.PassToken;
import com.news.java.common.api.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PassToken
    @RequestMapping(value = "login",method = RequestMethod.POST)
    private CommonResult<String> login(@RequestParam String username,@RequestParam String password){
        if(userService.login(username,password))
        {
            return CommonResult.success(userService.getToken(userService.findUserById(username)),"登录成功");
        }
        return CommonResult.success("登录失败");
    }
}
