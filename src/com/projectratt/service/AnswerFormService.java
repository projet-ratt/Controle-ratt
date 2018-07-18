package com.projectratt.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.projectratt.hibernate.util.HibernateUtil;
import com.projectratt.model.Admin;
import com.projectratt.model.Reponse;
import com.projectratt.model.Sondage;

public class AnswerFormService {
	
	public boolean register(Reponse reponse) {
		EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
		try{
			
			em.getTransaction().begin();
			Sondage sondage = em.find(Sondage. class, reponse.getSondage().getId_sondage());
			reponse.setSondage(sondage);
			//em.merge(reponse.getSondage());
			 em.persist(reponse);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return true;

}
	public List<Reponse> getAllReponses(){
		EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
		List<Reponse> reponses = new ArrayList<Reponse>(0);
		//em.find(Admin .class, admin);
		
		//reponses = em.createQuery("SELECT r.id_reponse, r.reponse_1, r.reponse_2, r.reponse_3, r.reponse_4, r.reponse_5, s.id_sondage, s.question_1, s.question_2, s.question_3, s.question_4, s.question_5, s.titre_sondage, s.admin_id_admin, t.id_theme, t.titre_theme,  FROM Reponse r, Sondage s, Theme t where r.sondage_id_sondage = s.id_sondage and s.theme_id_theme = t.id_theme and s.admin_id_admin = "+admin.getId_admin()).getResultList();
		//reponses = em.createQuery("SELECT r from Reponse r INNER JOIN Sondage s on r.sondage.id_sondage = s.id_sondage INNER JOIN Admin a on s.admin_id_admin = a.id_admin where a.id_admin = "+admin.getId_admin()).getResultList();
		reponses = em.createQuery("Select r from Reponse r").getResultList();
		System.out.println("[LOG] Récupération des themes , nbre :"+ reponses.size() );
		return reponses;
	}
	
}
