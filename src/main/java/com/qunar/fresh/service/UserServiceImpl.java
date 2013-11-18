package com.qunar.fresh.service;

import com.quanr.fresh.dao.IUserDao;
import com.qunar.fresh.domain.User;
import com.qunar.fresh.exception.THException;

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
