package com.shxt.dao;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.shxt.domain.User;

public class BaseDao extends HibernateDaoSupport {
	
	
	
	protected JdbcTemplate jdbcTemplate;
	
	protected SessionFactory superSessionFactory;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setDataSource(DataSource dataSource) {
		  this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public SessionFactory getSuperSessionFactory() {
		return superSessionFactory;
	}

	public void setSuperSessionFactory(SessionFactory superSessionFactory) {
		super.setSessionFactory(superSessionFactory);
		
	}

	
	
	
	
}
