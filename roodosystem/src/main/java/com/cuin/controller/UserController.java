package com.cuin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cuin.bean.UserBean;
import com.cuin.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/get")
	public String getUserById(Integer userId,Model m){
		UserBean userBean = userService.getUserById(userId);
		System.out.println("hell");
		System.out.println(userBean);
		return "index.jsp";
	}
}
