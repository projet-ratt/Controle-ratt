package com.projectratt.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.projectratt.hibernate.util.HibernateUtil;
import com.projectratt.model.Admin;



public class LoginService {
	
	public boolean authenticateUser(String userId, String password) {
		Admin user = getUserByUserId(userId);
		//if (user != null && user.getId_admin() == Integer.parseInt(userId) && user.getPassword().equals(password)) {
		if (user != null && user.getLogin().equals(userId) && user.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	public Admin getUserByUserId(String userId) {
		EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
		Admin user = null;
		try {
			//find only used for primary key
			//user = (Admin)em.find(Admin.class,userId);
			user = em.createQuery(
					  "SELECT u from Admin u WHERE u.login = :username", Admin .class).
					  setParameter("username", userId).getSingleResult();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return user;
		
		/*EntityManager session = HibernateUtil.getSessionFactory().openSession();
	    
	    session.beginTransaction();
	    Admin user = (Admin) session.get(Admin .class, userId);
	    session.getTransaction().commit();
	    session.close();
	    return Admin;*/
		
	}

	public List<Admin> getListOfUsers() {
		List<Admin> list = new ArrayList<Admin>();
		EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
		try {
			list = em.createQuery("select u from User u").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return list;
	}

}
