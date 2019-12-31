package com.news.java.dao.entity;

import java.io.Serializable;
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
public class NewsNavigation  implements Serializable {

	private static final long serialVersionUID =  4657713575349932787L;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 分类
	 */
	private String name;

}
