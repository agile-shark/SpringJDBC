package com.shxt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shxt.dao.IGroupDao;
import com.shxt.dao.IUserDao;
import com.shxt.domain.Group;
import com.shxt.domain.User;

public class MyTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		
		IUserDao userDao = ac.getBean("userDao", IUserDao.class);
		
		IGroupDao groupDao = ac.getBean("groupDao", IGroupDao.class);
		
		/*Group group = new Group("实训部");
		
		groupDao.add(group);
		

		User u = new User("super", "超级管理员", "super");
		u.setGroup(group);
		
		userDao.addUser(u);*/
		
		
		String sql = "select t.*,r.group_name from TH11_SPRING_USER t , th11_spring_group r where t.group_id=r.group_id";
		
		System.out.println(sql);
		
		List<User> userList = userDao.listSQL(sql, null);
		
		System.out.println(userList);
		for(User u : userList){
			System.out.println("----"+u.getNickname()+"---"+u.getGroup().getGroupName());
		}
		
	}

}
