package com.news.java.dao.entity;

import lombok.Data;

@Data
public class NewsListQuery {
    private String channelId;       //新闻频道id，必须精确匹配

    private String channelName;//新闻频道名称，可模糊匹配

    private Integer maxResult;//每页最大请求数,默认是20

    private String needAllList;//是否需要返回所有的图片及段落属行allList。

    private String needContent;//是否需要返回正文，1为需要，其他为不需要

    private String needHtml;//是否需要返回正文的html格式，1为需要，其他为不需要

    private Integer page;//页数，默认1。每页最多20条记录。

    private String title;//标题名称，可模糊匹配


}
