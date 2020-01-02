package com.news.java.controller;

import com.news.java.Service.UserService;
import com.news.java.common.api.CommonResult;
import com.news.java.common.api.PassToken;
import com.news.java.dao.entity.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class UserController  {
    @Autowired
    private UserService userService;

    @PassToken
    @RequestMapping(value = "login",method = RequestMethod.POST)
    private CommonResult<String> login(@RequestParam String username,@RequestParam String password){
        if(userService.login(username,password))
        {
            return CommonResult.success(userService.getToken(userService.findUserByUsername(username)),"登录成功");
        }
        return CommonResult.success("登录失败");
    }

    @PassToken
    @RequestMapping(value = "register",method = RequestMethod.POST)
    private CommonResult<String> register(@Validated UserLogin userLogin){
        if(userService.findUserByUsername(userLogin.getUsername())==null){
            //注册
           boolean bool= userService.register(userLogin);
           if(bool==true){
               return CommonResult.success(userService.getToken(userService.findUserByUsername(userLogin.getUsername())),"register success");
           }
        }
        return CommonResult.success("register failed");

    }
}
