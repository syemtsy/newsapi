package com.news.java.controller;

import com.news.java.Service.NewsService;
import com.news.java.common.api.CommonPage;
import com.news.java.common.api.CommonResult;
import com.news.java.dao.entity.NewsArticle;
import com.news.java.dao.entity.NewsListQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(value = "/news")
public class NewsController {
    @Autowired
    private NewsService newsService;
    @PostMapping("/list")
    public CommonResult<CommonPage<NewsArticle>> getNewsList(@RequestBody NewsListQuery newsListQuery){
        return CommonResult.success(CommonPage.restPage(newsService.getNewsList(newsListQuery)));
    }
}
