package com.quanr.fresh.dao;

import java.util.List;

import com.qunar.fresh.domain.User;

public interface IUserDao {
	public void addUser(User user);
	public void update(User user);
	public void del(int id);
	public User load(int id);
	public List<User> list(String hql , Object[] args);
	
	public List<User> listSQL(String sql , Object[] args);
	
}
