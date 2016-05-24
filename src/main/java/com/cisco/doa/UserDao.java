package com.cisco.doa;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.cisco.webapp.Users;
import com.cisco.webapp.HibernateUtil;

public class UserDao {


	public Users getUser( Integer id) {
		System.out.println("Checking for user: " + id + "\n");
//		Session ses = HibernateUtil.currentSession();
//		try {
//			Criteria crit =  ses.createCriteria(Users.class);
//			crit.add(Restrictions.idEq(id));
//			Users u = (Users)crit.uniqueResult();
//			return u;
//		} finally {
//			HibernateUtil.closeSession();
//		}
		return null;
	}

	public List<Users> getUsers() {
		System.out.println("get list of users");
//		Session ses = HibernateUtil.currentSession();
//		try {
//			return ses.createCriteria(Users.class).list();
//		} finally {
//			HibernateUtil.closeSession();
//		}
		return null;
	}
	
	
}


