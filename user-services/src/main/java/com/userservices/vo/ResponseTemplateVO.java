package com.userservices.vo;


import com.userservices.entity.UserInfo;

public class ResponseTemplateVO {

	private UserInfo user;
	private Department department;

	public UserInfo getUser() {
		return user;
	}

	public void setUserInfo(UserInfo user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
