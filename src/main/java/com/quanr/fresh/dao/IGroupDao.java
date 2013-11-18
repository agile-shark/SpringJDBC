package com.quanr.fresh.dao;

import java.util.List;

import com.qunar.fresh.domain.Group;

public interface IGroupDao {
	public void add(Group group)throws Exception ;
	public void update(Group group);
	public void del(int id);
	public Group load(int id);
	public List<Group> list(String hql , Object[] args);
	
}
