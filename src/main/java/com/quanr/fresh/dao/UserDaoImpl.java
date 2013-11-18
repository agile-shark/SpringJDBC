package com.quanr.fresh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.springframework.jdbc.core.RowMapper;

import com.qunar.fresh.domain.Group;
import com.qunar.fresh.domain.User;

public class UserDaoImpl extends BaseDao implements IUserDao {

	public void del(int id) {
		User user = this.load(id);
		this.getHibernateTemplate().delete(user);
	}

	public List<User> list(String hql, Object[] args) {
		// 创建Query接口
		Query query = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		if (args != null) {
			for (int i = 0; i < args.length; i++) {
				query.setParameter(i, args[i]);
			}
		}

		return query.list();
	}

	public User load(int id) {
		return (User) this.getHibernateTemplate().load(User.class, id);
	}

	public void update(User user) {
		this.getHibernateTemplate().update(user);
	}

	public void addUser(User user) {
		this.getHibernateTemplate().save(user);
		
	}

	public List<User> listSQL(String sql, Object[] args) {
		
			return	this.jdbcTemplate.query(sql,new RowMapper<User>(){
				public User mapRow(ResultSet rs, int rownum)
						throws SQLException {
					Group g  = new Group();
					g.setId(rs.getInt("group_id"));
					g.setGroupName(rs.getString("group_name"));
					User user = new User();
					user.setNickname(rs.getString("nick_name"));
					user.setUsername(rs.getString("user_name"));
					user.setPassword(rs.getString("password"));
					user.setId(rs.getInt("USER_ID"));
					user.setGroup(g);
						
					return user;
				}
				
			});
		
		
	}

}
