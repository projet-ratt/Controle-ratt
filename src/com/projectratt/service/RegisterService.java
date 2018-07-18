package com.projectratt.service;

import javax.persistence.EntityManager;

import com.projectratt.hibernate.util.HibernateUtil;
import com.projectratt.model.Admin;


public class RegisterService {
	public boolean register(Admin user) {
		EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
		if (isUserExists(user))
			return false;
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return true;
	}

	public boolean isUserExists(Admin user) {
		EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
		boolean result = false;
		try {
			Admin u = em.find(Admin.class, user);
			if (u != null)
				result = true;
		} catch (Exception ex) {
		} finally {
			em.close();
		}
		return result;
	}

}
