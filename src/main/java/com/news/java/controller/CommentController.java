package com.news.java.controller;

import com.news.java.Service.CommentService;
import com.news.java.common.api.CommonPage;
import com.news.java.common.api.CommonResult;
import com.news.java.dao.entity.NewsComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/{aid}")
    public CommonResult<CommonPage<NewsComment>> getNewsComment(@PathVariable String aid){
        return CommonResult.success(CommonPage.restPage(commentService.getNewsComment(aid)));
    }
    @PostMapping("/{aid}")
    public CommonResult<String> addComment(@PathVariable String aid,@RequestBody NewsComment newsComment){
       newsComment.setCreatetime(new Date());
        Boolean b= commentService.addComment(newsComment);
        return CommonResult.success("评论成功");
    }

}
