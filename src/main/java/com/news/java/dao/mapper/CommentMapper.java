package com.news.java.dao.mapper;

import com.news.java.dao.entity.NewsComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    List<NewsComment> findCommentByAid(String aid);
   Integer save(NewsComment newsComment);
}
