package com.news.java.dao.entity;


import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description  
 * @Author  System
 * @Date 2019-12-31 
 */

@Setter
@Getter
@ToString

public class NewsComment  implements Serializable {

	private static final long serialVersionUID =  5916423522106914867L;

	/**
	 * 主键
	 */

	private Long id;

	/**
	 * 评论标识
	 */
	private Long cid;

	/**
	 * 用户标识
	 */
	private Long uid;

	/**
	 * 该评论回复的id,没有为0
	 */
	private Long replyid;

	/**
	 * 改评论所在的父级评论id,没有则为0
	 */
	private Long pid;

	/**
	 * 所属文章标识
	 */
	private String aid;

	/**
	 * 评论内容
	 */
	private String content;

	/**
	 * 评论时间
	 */
	private Date createtime;

}
