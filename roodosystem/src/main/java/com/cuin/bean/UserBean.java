package com.cuin.bean;

import java.io.Serializable;

public class UserBean implements Serializable{

	private Integer userId;
	private String userName;
	private String loginname;
	private Integer del;
	
	public UserBean() {
		super();
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public Integer getDel() {
		return del;
	}
	public void setDel(Integer del) {
		this.del = del;
	}
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName + ", loginname=" + loginname + ", del=" + del
				+ "]";
	}
	
}
