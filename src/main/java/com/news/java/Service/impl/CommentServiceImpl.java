package com.news.java.Service.impl;

import com.news.java.Service.CommentService;
import com.news.java.dao.entity.NewsComment;
import com.news.java.dao.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public List<NewsComment> getNewsComment(String aid) {
        return commentMapper.findCommentByAid(aid);
    }

    @Override
    public Boolean addComment(NewsComment newsComment) {
        Integer n=commentMapper.save(newsComment);
        return true;
    }
}
