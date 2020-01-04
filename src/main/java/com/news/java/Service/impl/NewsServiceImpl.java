package com.news.java.Service.impl;

import com.github.pagehelper.PageHelper;
import com.news.java.Service.NewsService;
import com.news.java.dao.entity.NewsArticle;
import com.news.java.dao.entity.NewsListQuery;
import com.news.java.dao.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<NewsArticle> getNewsList(NewsListQuery newsListQuery) {
        PageHelper.startPage(newsListQuery.getPage(), newsListQuery.getMaxResult());
        return articleMapper.findArticleByNewsListQuery(newsListQuery);
    }

    @Override
    public Integer addNewsArticle(NewsArticle newsArticle) {
       return articleMapper.save(newsArticle);
    }

}
