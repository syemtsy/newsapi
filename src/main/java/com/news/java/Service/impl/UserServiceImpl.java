package com.news.java.Service.impl;

import com.news.java.Service.UserService;
import com.news.java.Util.JwtUtil;
import com.news.java.dao.entity.UserInfo;
import com.news.java.dao.entity.UserLogin;
import com.news.java.dao.mapper.LoginMapper;
import com.news.java.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private UserMapper userMapper;
    @Value("#{${token.time}*60*1000}")
    private long tokenTime;

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
        loginMapper.save(userLogin);
        UserLogin userLogin1=loginMapper.findUserLoginByusername(userLogin.getUsername());
       Integer row= loginMapper.updateByUId(userLogin1.getId());

       if(row==1){
          Boolean initStatus= initUserInfo(userLogin);
           return true;
       }
       return false;
    }

    @Override
    public Boolean initUserInfo(UserLogin userLogin) {
        UserInfo userInfo=new UserInfo();
        userInfo.setUid(loginMapper.findUserLoginByusername(userLogin.getUsername()).getUId());
        userInfo.setNickname(userLogin.getUsername());
        userInfo.setAvatar("default");
        userInfo.setStatus((long) 1);
        userInfo.setRegisterTime(new Date());
       Integer status= userMapper.save(userInfo);
       return true;
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
