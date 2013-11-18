package com.shxt.dao;

import java.util.List;

import com.shxt.domain.User;

public interface IUserDao {
	public void addUser(User user);
	public void update(User user);
	public void del(int id);
	public User load(int id);
	public List<User> list(String hql , Object[] args);
	
	public List<User> listSQL(String sql , Object[] args);
	
}
