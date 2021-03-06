package com.projectratt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projectratt.model.Admin;
import com.projectratt.service.RegisterService;



/**
 * Servlet implementation class RegisterServlet
 */
//@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		response.setContentType("text/html;charset=UTF-8");
		 PrintWriter out = response.getWriter();
		 String firstName = request.getParameter("firstName");
		 
		 String lastName = request.getParameter("lastName");
		 String email = request.getParameter("email");
		 String password = request.getParameter("password");
		
		Admin user = new Admin(email,password,firstName,lastName,email);
				
		 try {	
			 RegisterService registerService = new RegisterService();
			 boolean result = registerService.register(user);		
			 out.println("<html>");
			 out.println("<head>");		
			 out.println("<title>Registration Successful</title>");		
			 out.println("</head>");
			 out.println("<body>");
			 out.println("<center>");
			 if(result){
				 out.println("<h1>Thanks for Registering with us :</h1>");
				 out.println("To login with new UserId and Password<a href=Login2.jsp>Click here</a>");
			 }else{
				 out.println("<h1>Registration Failed</h1>");
				 out.println("To try again<a href=Register2.jsp>Click here</a>");
			 }
			 out.println("</center>");
			 out.println("</body>");
			 out.println("</html>");
		 } finally {		
			 out.close();
		 }
	}

}
