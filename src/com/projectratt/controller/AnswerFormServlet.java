package com.projectratt.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.projectratt.model.Reponse;
import com.projectratt.model.Sondage;
import com.projectratt.service.AnswerFormService;
import com.projectratt.service.SondageService;

/**
 * Servlet implementation class AnswerFormServlet
 */

public class AnswerFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnswerFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true); 
		session.setMaxInactiveInterval(20*60);
		doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
		 PrintWriter out = response.getWriter();

		 String titre_sondage = request.getParameter("titre_sondage");
		 
		String id_sondage = request.getParameter("id");
		SondageService sondageService = new SondageService();
		Sondage sondage = new Sondage();
		
		int id = Integer.parseInt(id_sondage);
		
		
		sondage = sondageService.isSondageExists(id);
		 
		 
		 String reponse_1= request.getParameter("reponse_1");
		 String reponse_2= request.getParameter("reponse_2");
		 String reponse_3= request.getParameter("reponse_3");
		 String reponse_4= request.getParameter("reponse_4");
		 String reponse_5= request.getParameter("reponse_5");
		 
		 
		 
		 //Sondage sondage = (Sondage) request.getAttribute("sondage");
		 
		//Sondage sondage = (Sondage) request.getAttribute("sondage");
		out.println(sondage.getId_sondage());
		 	//int id_sondage = sondage.getId_sondage();
		 
Reponse reponse  = new Reponse (reponse_1,reponse_2,reponse_3,reponse_4,reponse_5,sondage);
		 try {	
			 AnswerFormService answerFormService = new AnswerFormService();
			
			 boolean result = answerFormService.register(reponse);	
			 if(result){
			 out.println("<html>");
			 out.println("<head>");		
			 out.println("<title>Vous avez répondu à ce sondage</title>");	
			 out.println("Revenir à la page d'accueil <a href=Home.jsp>Click here</a>");
			 out.println(sondage.getTitre_sondage());
			 out.println("</head>");
			 out.println("<body>");
			 out.println("<center>");
			
				 out.println("<h1>Merci </h1>");
				 
			 }else{
				 out.println("<h1>Réponse  Failed</h1>");
				 
				 out.println("To try again<a href=AnswerForm.jsp>Click here</a>");
			 }
			 out.println("</center>");
			 out.println("</body>");
			 out.println("</html>");
		 } finally {		
			 out.close();
		 }
		 
		
		
	}

}
