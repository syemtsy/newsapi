package com.news.java.Service;

import com.news.java.dao.entity.UserLogin;

public interface UserService {
    public String getToken(UserLogin userLogin);

    boolean login(String username,String password);

    UserLogin findUserByUId(Long uId);

    UserLogin findUserByUsername(String username);

    boolean register(UserLogin userLogin);
}
