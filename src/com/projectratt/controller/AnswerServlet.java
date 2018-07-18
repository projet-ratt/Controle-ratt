package com.projectratt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.projectratt.model.Sondage;
import com.projectratt.model.Theme;
import com.projectratt.service.SondageService;

/**
 * Servlet implementation class AnswerServlet
 */

public class AnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnswerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doGet(request, response);
		HttpSession session = request.getSession(true); 
		PrintWriter out = response.getWriter();
		String id_sondage = request.getParameter("id_sondage");
		int id = Integer.parseInt(id_sondage);

			try{
				SondageService sondageService = new SondageService();
				Sondage sondage = new Sondage();
				sondage = sondageService.isSondageExists(id);
				Theme theme = new Theme();
				theme = sondage.getTheme();
				
				//Récupération du sondage 
				if(sondage != null){
					request.setAttribute( "sondage", sondage );
					request.setAttribute("theme", theme);
						
					session.setAttribute("sondage",sondage);
					session.setAttribute("theme",theme);
					 //this.getServletContext().getRequestDispatcher( "Home.jsp" ).forward( request, response );
					 request.getRequestDispatcher("AnswerForm.jsp").forward(request, response);;
				 }
				 else{
					 response.sendRedirect("error.jsp");
				 }
				
				
				
				
			}finally {		
				 out.close();
			 }
		
		
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		HttpSession session = request.getSession(true); 
		PrintWriter out = response.getWriter();
		String id_sondage = request.getParameter("id_sondage");
		int id = Integer.parseInt(id_sondage);

			try{
				SondageService sondageService = new SondageService();
				Sondage sondage = new Sondage();
				sondage = sondageService.isSondageExists(id);
				Theme theme = new Theme();
				theme = sondage.getTheme();
				
				//Récupération du sondage 
				if(sondage != null){
					request.setAttribute( "sondage", sondage );
					request.setAttribute("theme", theme);
						
					session.setAttribute("sondage",sondage);
					session.setAttribute("theme",theme);
					 //this.getServletContext().getRequestDispatcher( "Home.jsp" ).forward( request, response );
					 request.getRequestDispatcher("AnswerForm.jsp").forward(request, response);
				 }
				 else{
					 response.sendRedirect("error.jsp");
				 }
				
				
				
				
			}finally {		
				 out.close();
			 }
		
		
	}

}
