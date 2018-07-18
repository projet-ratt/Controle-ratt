package com.projectratt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.projectratt.model.Admin;
import com.projectratt.model.Sondage;
import com.projectratt.model.Theme;
import com.projectratt.service.RegisterService;
import com.projectratt.service.SondageService;

/**
 * Servlet implementation class SondageServlet
 */

public class SondageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SondageServlet() {
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
		doGet(request, response);
		HttpSession session = request.getSession();
		response.setContentType("text/html;charset=UTF-8");
		 PrintWriter out = response.getWriter();
		 String titre_sondage = request.getParameter("titre_sondage");
		 
		 //String id_admin = request.getParameter("id_user");
		 
		 Admin user = (Admin)session.getAttribute("admin");
		 
		 String nom_theme = request.getParameter("nom_theme");
		 String question_1= request.getParameter("question_1");
		 String question_2= request.getParameter("question_2");
		 String question_3= request.getParameter("question_3");
		 String question_4= request.getParameter("question_4");
		 String question_5= request.getParameter("question_5");
		 
		Theme theme = new Theme(nom_theme);
		
		 Sondage sondage = new Sondage(titre_sondage,question_1,question_2,question_3,question_4,question_5,theme,user);
		 
		 try {	
			 SondageService sondageService = new SondageService();
			 boolean result = sondageService.register(sondage);	
			 session.setAttribute("admin", user);
			 
			 if(result==true){
				 out.println("<html>");
				 out.println("<head>");		
				 out.println("<title>Création de ton sondage avec succès</title>");		
				 out.println("</head>");
				 out.println("<body>");
				 out.println("<center>");
				 
				 response.sendRedirect("Home.jsp");
				 
			 }else{
				 out.println("<h1>Sondage Failed</h1>");
				 out.println("To try again<a href=SondageForm.jsp>Click here</a>");
			 }
			 
		 } finally {		
			 out.close();
		 }
		 
		 
		 
	}

}
