package com.news.java.dao.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;
/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-12-31 
 */

@Setter
@Getter
@ToString
public class NewsArticle  implements Serializable {

	private static final long serialVersionUID =  3389056878842042477L;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 新闻标识
	 */
	private String aid;

	/**
	 * 新闻标题
	 */
	private String title;

	/**
	 * 新闻内容
	 */
	private String content;

	/**
	 * 所属分类
	 */
	private String channelId;

	/**
	 * 日期
	 */
	private Date pubDate;

	/**
	 * 来源
	 */
	private String source;

	/**
	 * 图片
	 */
	private String imageurls;

}
