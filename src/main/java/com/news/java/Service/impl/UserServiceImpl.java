package com.news.java.Service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.news.java.Service.UserService;
import com.news.java.Util.JwtUtil;
import com.news.java.dao.entity.UserLogin;
import com.news.java.dao.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private LoginMapper loginMapper;
    private long tokenTime=1000*60*60;

    @Override
    public String getToken(UserLogin userLogin) {
        String token="";
        token= JwtUtil.createJWT(tokenTime,userLogin);
        return token;
    }

    @Override
    public UserLogin findUserByUId(Long uId) {
        return loginMapper.findUserLoginByUid(uId);
    }

    @Override
    public UserLogin findUserByUsername(String username) {
        return  loginMapper.findUserLoginByusername(username);
    }

    @Override
    public boolean register(UserLogin userLogin) {
        loginMapper.Save(userLogin);
        UserLogin userLogin1=loginMapper.findUserLoginByusername(userLogin.getUsername());
       Integer row= loginMapper.updateByUId(userLogin1.getId());
       if(row==1){
           return true;
       }
       return false;
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
