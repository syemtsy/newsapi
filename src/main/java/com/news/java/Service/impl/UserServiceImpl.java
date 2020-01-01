package com.news.java.Service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.news.java.Service.UserService;
import com.news.java.dao.entity.UserLogin;
import com.news.java.dao.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public String getToken(UserLogin userLogin) {
        String token="";
        token= JWT.create().withAudience(String.valueOf(userLogin.getUsername()))
                .sign(Algorithm.HMAC256(userLogin.getPassword()));
        return token;
    }

    @Override
    public UserLogin findUserById(String userId) {
        return loginMapper.findUserLoginByusername(userId);
    }

    @Override
    public boolean login(String username, String password) {
       UserLogin userLogin= loginMapper.findUserLoginByusernameAndPassword(username,password);
       if(userLogin!=null){
           return true;
       }
        return false;
    }


}
