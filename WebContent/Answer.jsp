

<%@page import="com.projectratt.model.Sondage"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.String"%>
<%@page import="com.projectratt.service.SondageService"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Choisir un sondage </title>
<style type="text/css">
h3{font-family: Calibri;  font-style: normal;  color:SlateBlue;
 text-decoration: underline }
</style>
</head>




<form action="AnswerServlet" method="POST">
<table>
			 <thead>
				 <tr>
					 <th>Titre du sondage </th>
									
				 </tr>
			 </thead>
			 <tbody>
				 <%
				 SondageService sondageService = new SondageService();
				 List<Sondage> sondages = new ArrayList<Sondage>(0);
				 sondages = sondageService.getAllSondages();
				 	 
				 for (Sondage s : (List<Sondage>) sondages) {
				 %>
				 

					 <tr>
				  <% int id_sond = ((Sondage)s).getId_sondage(); 
				  
					 %>
					 <input type="hidden" name="id_sondage" value="${id_sondage}">
    				
					 </td>
					 
					 
					  		<%
					  			String titre = new String(); 
					  		titre =	((Sondage)s).getTitre_sondage();
					  		   %>
					  		   <input type="hidden" name="titre_sondage" value="${titre_sondage}">
					  		<td> 
					  		<a href="AnswerForm.jsp?id_sondage=<%=((Sondage)s).getId_sondage()%>"> 
					  			<%=titre %>
					  		</a>
					
					  </td>
					 <hr>
					 <td> <!--  input type = "hidden"  name="id_sondage" value ="${id}" /> --></td>
					 <hr>
					 </p>
					 <td>
					<tr>
					
					 </tr>
					 </td>
					 
					
					 
					
					 
					 
					 
					 
					 
					 
					 
					 
				 </tr>
				 <%}%>
			 <tbody>
		 </table>		

</html>