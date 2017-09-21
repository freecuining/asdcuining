package com.cuin.dao;

import org.springframework.stereotype.Repository;

import com.cuin.bean.UserBean;

@Repository//在dao层添加了一个注解
public interface UserDao {

	public UserBean getUserById(Integer userId);
}
