package com.news.java.dao.entity;


import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Description  
 * @Author  System
 * @Date 2019-12-31 
 */

@Setter
@Getter
@ToString
public class UserLogin  implements Serializable {

	private static final long serialVersionUID =  7536514210777998992L;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 用户唯一标识
	 */
	private Long uId;

	/**
	 * 用户名
	 */
	@Size(min=6,max = 20,message = "用户名长度应为8-20位")
	private String username;

	/**
	 * 密码
	 */
	@Size(min = 8,max=20,message = "密码长度应为8-20位")
	private String password;


}
