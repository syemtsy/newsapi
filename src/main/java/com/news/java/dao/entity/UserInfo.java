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
public class UserInfo  implements Serializable {

	private static final long serialVersionUID =  6700119129657828318L;

	private Long id;

	/**
	 * 用户唯一标识
	 */
	private Long uid;

	/**
	 * 昵称
	 */
	private String nickname;

	/**
	 * 头像
	 */
	private String avatar;

	/**
	 * 状态
	 */
	private Long status;

}
