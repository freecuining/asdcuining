package com.cuin.service;



import com.cuin.bean.UserBean;



public interface UserService {

	
	/**
	 * 根据用户id查询用户个人信息
	 * @param userId
	 * @return
	 */
	public UserBean getUserById(Integer userId);
}
