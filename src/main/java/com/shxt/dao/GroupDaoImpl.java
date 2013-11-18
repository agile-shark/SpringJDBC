package com.shxt.dao;

import java.util.List;

import org.hibernate.Query;

import com.shxt.domain.Group;

public class GroupDaoImpl extends BaseDao implements IGroupDao {

	

	public void add(Group group) throws Exception {
		this.getHibernateTemplate().save(group);
	}

	public void del(int id) {
		Group group = this.getHibernateTemplate().load(Group.class, id);
		this.getHibernateTemplate().delete(group);
	}

	public List<Group> list(String hql, Object[] args) {
		
		Query query = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		
		if(args!=null){
			for(int i= 0 ;i<args.length;i++){
				query.setParameter(i, args[i]);
			}
		}
		
		return query.list();
	}

	public Group load(int id) {
		return  this.getHibernateTemplate().load(Group.class, id);
	}

	public void update(Group group) {
		this.getHibernateTemplate().update(group);
	}

}
