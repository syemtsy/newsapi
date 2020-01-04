package com.news.java.Service;

import com.news.java.dao.entity.NewsArticle;
import com.news.java.dao.entity.NewsListQuery;
import java.util.List;

public interface NewsService {

   List<NewsArticle> getNewsList(NewsListQuery newsListQuery);

   Integer addNewsArticle(NewsArticle newsArticle);
}
