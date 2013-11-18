package com.qunar.fresh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.qunar.fresh.domain.User;
import com.qunar.fresh.service.IUserService;

public class UserAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user;
	
	private IUserService userService;
	
	public String add(){
		try {
			userService.add(user);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return "exception";
		}
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
