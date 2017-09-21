package com.cuin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuin.bean.UserBean;
import com.cuin.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public UserBean getUserById(Integer userId) {
		return userDao.getUserById(userId);
	}

}
