package com.projectratt.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.projectratt.hibernate.util.HibernateUtil;
import com.projectratt.model.Admin;
import com.projectratt.model.Sondage;
import com.projectratt.model.Theme;





public class SondageService {
	
	public boolean register(Sondage sondage) {
		EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
		try{
			
		
			  em.getTransaction().begin();
				if (isThemeExists(sondage.getTheme()));
				else{
					em.persist(sondage.getTheme());
				
				}
					
			
			
			Admin admin = em.find(Admin .class, sondage.getAdmin().getId_admin());
			sondage.setAdmin(admin);
			em.persist(sondage);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return true;
			
			
		
	
	}
	public List<Sondage> getAllSondages(){
		EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
		List<Sondage> sondages = new ArrayList<Sondage>(0);
		sondages = em.createQuery("SELECT s FROM Sondage s").getResultList();
		System.out.println("[LOG] Récupération des themes , nbre :"+ sondages.size() );
		return sondages;
	}
	
	public Sondage isSondageExists(int id_sondage) {
		EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
		Sondage result = new Sondage();
		Sondage sondage = new Sondage();
		try {
			sondage = em.find(Sondage .class, id_sondage);
			if (sondage != null)
				result = sondage;
				
		} catch (Exception ex) {
		} finally {
			em.close();
		}
		return result;
	}
	public boolean isThemeExists(Theme theme) {
		EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
		boolean result = false;
		try {
			Theme u = em.find(Theme. class, theme.getNom_theme());
			if (u != null)
				result = true;
		} catch (Exception ex) {
		} finally {
			em.close();
		}
		return result;}

}
