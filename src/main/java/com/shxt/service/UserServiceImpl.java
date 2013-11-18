package com.shxt.service;

import com.shxt.dao.IUserDao;
import com.shxt.domain.User;
import com.shxt.exception.THException;

public class UserServiceImpl implements IUserService{
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public void add(User user) throws THException {
		
		for(int i=3;i<=3;i++){
			if(i==3){
				throw new THException("测试回滚");
			}
			userDao.addUser(user);
		}
		
	}
	
}
