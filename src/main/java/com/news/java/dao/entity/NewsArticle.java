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
	private Long aid;

	/**
	 * 新闻内容
	 */
	private String content;

	/**
	 * 所属分类
	 */
	private String navigation;

	private Date creatteime;

}
