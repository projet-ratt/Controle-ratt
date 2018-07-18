

<%@page import="com.projectratt.model.Reponse"%>
<%@page import="com.projectratt.model.Sondage"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.projectratt.service.AnswerFormService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reporting</title>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css" />

<style type="text/css">



table,th,td {
    border: 1px solid black;
    border-collapse: collapse;
} 
</style>


</style>



<body>

<jsp:useBean id="admin" class="com.projectratt.model.Admin" scope="session" />


 <table style="width:100%" border-collapse = "collapse";>

 
  <tr 
    border ="1px solid black";
>
    <th>Titre Sondage </th>
    <th>Question 1 : </th>
    <th>Question 2 : </th>
    <th>Question 3 : </th>
    <th>Question 4 : </th>
    <th>Question 5 : </th>
  </tr>
   <%
        AnswerFormService answerFormService = new AnswerFormService();
    	List<Reponse> reponses = new ArrayList<Reponse>(0);
	    reponses = answerFormService.getAllReponses();
	 	
	 for (Reponse r : (List<Reponse>) reponses) {
	 %>
        
                <tr>
                 <%
       
                    { %>
                     <td>
                     <%=  ((Reponse)r).getSondage().getTitre_sondage()%>
                     </td>
                     <td>
                     <%=  ((Reponse)r).getReponse_1()%>
                     </td>
                      <td>
                     <%=  ((Reponse)r).getReponse_2()%>
                 
                     </td>
                      <td>
                     <%=  ((Reponse)r).getReponse_3()%>
                     </td>
                      <td>
                     <%=  ((Reponse)r).getReponse_4()%>
                     </td>
                      <td>
                     <%=  ((Reponse)r).getReponse_5()%>
                     </td>
                     
                <% 
                    }
                %>                   
                </tr>
            <% 
        }
    %>
</table>
  
 
 



   


</body>
</html>