package com.news.java.dao.entity;


import java.io.Serializable;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
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

	private String username;

	/**
	 * 密码
	 */

	private String password;


}
