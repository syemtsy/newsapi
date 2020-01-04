package com.news.java.dao.mapper;

import com.news.java.dao.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    Integer save(UserInfo userInfo);
}
