package com.shxt.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Group implements Serializable {
	private int id;
	private String groupName;
	private Set<User> userSet ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public Set<User> getUserSet() {
		return userSet;
	}
	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}
	public Group() {
		userSet = new HashSet<User>();
	}
	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}
	
	
}
