package com.news.java.Service;

import com.news.java.dao.entity.NewsComment;

import java.util.List;

public interface CommentService {
    List<NewsComment> getNewsComment(String aid);

    Boolean addComment(NewsComment newsComment);

}
