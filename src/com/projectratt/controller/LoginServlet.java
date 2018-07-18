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
import com.projectratt.service.LoginService;



/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String userId = request.getParameter("userId");
		
		 String password = request.getParameter("password");
		 LoginService loginService = new LoginService();
		 boolean result = loginService.authenticateUser(userId, password);
		 Admin user = loginService.getUserByUserId(userId);
		 session.setAttribute("admin", user);
		 if(result == true){
			 request.getSession().setAttribute("admin ", user);		
			 //response.sendRedirect("SondageForm.jsp");
			 response.sendRedirect("Admin.jsp");
			 
			 String someValue = new String("Repport.jsp");
			 String someValue2 = new String ("SondageForm.jsp");
			 
			 request.setAttribute("urlID",someValue);
			 request.setAttribute("urlID2", someValue2);
			 
			 
		 }
		 else{
			 //response.sendRedirect("error.jsp");
			 out.println("<html>");
			 out.println("<head>");		
			 out.println(userId);		
			 out.println("</head>");
			 out.println("<body>");
			 out.println("<center>");
		 }
	}

}
