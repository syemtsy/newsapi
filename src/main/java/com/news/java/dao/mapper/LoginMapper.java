package com.news.java.dao.mapper;

import com.news.java.dao.entity.UserLogin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {
    List<UserLogin> findAll();
    void Save(UserLogin userLogin);
}
