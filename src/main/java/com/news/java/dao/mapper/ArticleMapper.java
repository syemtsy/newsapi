package com.news.java.dao.mapper;

import com.news.java.dao.entity.NewsArticle;
import com.news.java.dao.entity.NewsListQuery;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ArticleMapper {
    List<NewsArticle> findArticleByNewsListQuery(NewsListQuery newsListQuery);

    Integer save(NewsArticle newsArticle);
}
