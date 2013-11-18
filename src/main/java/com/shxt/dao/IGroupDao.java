package com.shxt.dao;

import java.util.List;

import com.shxt.domain.Group;
import com.shxt.domain.User;

public interface IGroupDao {
	public void add(Group group)throws Exception ;
	public void update(Group group);
	public void del(int id);
	public Group load(int id);
	public List<Group> list(String hql , Object[] args);
	
}
