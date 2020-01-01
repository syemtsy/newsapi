package com.news.java.Service;

import com.news.java.dao.entity.UserLogin;

public interface UserService {
    public String getToken(UserLogin userLogin);

    UserLogin findUserById(String userId);
    boolean login(String username,String password);
}
