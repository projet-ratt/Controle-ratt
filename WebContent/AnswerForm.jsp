<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@page import="com.projectratt.model.Sondage"%>
<%@page import="com.projectratt.model.Theme"%>
<%@page import="com.projectratt.service.SondageService"%>
<%@page import ="javax.servlet.http.HttpSession"%>
<%@page import = "java.lang.*" %>
<%@page import ="java.io.ByteArrayInputStream"%>
<%@page import = "java.io.IOException" %>
<%@pageimport ="java.io.ObjectInputStream" %>
<%@page import ="java.util.Base64" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Répondre </title>
</head>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
h1{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:SlateBlue;
text-align: center; text-decoration: underline }
table{font-family: Calibri; color:white; font-size: 11pt; font-style: normal;width: 50%;
text-align:; background-color: SlateBlue; border-collapse: collapse; border: 2px solid navy}
table.inner{border: 0px}

</style>
</head>
<h1> Répondre à ce sondage </h1>

<body>

<form action="AnswerFormServlet" method="POST">
<form class="form-horizontal company" role="form" id="comp">
<!-- jsp:useBean id="sondage" class="com.projectratt.model.Sondage" scope="session" /> -->

<!--  jsp:useBean id="theme" class="com.projectratt.model.Theme" scope="session" />-->
                    <div class="form-group">
                    <!--String id_sondage = request.getParameter("id_sondage"); 
                    int id = Integer.parseInt(id_sondage); -->
                    	<br/>
                    	 <%
                    	 
                    	 
                		String id_sondage = request.getParameter("id_sondage");
                		SondageService sondageService = new SondageService();
        				Sondage sondage = new Sondage();
        				String id_sond = id_sondage;
        				int id = Integer.parseInt(id_sond);
        				
        				
        				sondage = sondageService.isSondageExists(id);
        				
        				session.setAttribute("sondage",sondage);
        				Theme theme = new Theme();
        				theme = sondage.getTheme();
        				
                        %>
                        <input name ="id" value="<%= Integer.parseInt(id_sond) %>"/>
                    	<h3> Titre de ce sondage :  <h3>
                    	
                    	
                    	<%= sondage.getTitre_sondage() %>
                      <!--  jsp:getProperty name="sondage" property="titre_sondage" />  -->
                       
    
                        <br/>
                    </div>
                    
                     <div class="form-group">
                      <br/>
                        <h4> Theme </h4>
                        
                        <%= theme.getNom_theme() %>
                        
                        <!-- jsp:getProperty name="theme" property="nom_theme" /> -->
                         <br/>
                    </div>
                    <div class="form-group">
                    
             <br/>
                        <label for="question_1" class="col-sm-2 control-label">Question 1</label>
                        <!--  jsp:getProperty name="sondage" property="question_1" />-->
                        <%= sondage.getQuestion_1() %>
                        
                         <br/>
                         
						<tr>
						
						<td><input type="text" name="reponse_1" maxlength="30"/>
						</td>
						</tr>
						
                    </div>
                      <div class="form-group">
                       <br/>
                        <label for="question_2" class="col-sm-2 control-label">Question 2</label>
                        <!-- jsp:getProperty name="sondage" property="question_2" />  -->
                        <%= sondage.getQuestion_2() %>
                         <br/>
                         
						<tr>
						
						<td><input type="text" name="reponse_2" maxlength="30"/>
						
						</td>
						</tr>
						
                    </div>
                      <div class="form-group">
                       <br/>
                        <label for="question_3" class="col-sm-2 control-label">Question 3</label>
                       <!--jsp:getProperty name="sondage" property="question_3" />  -->
                       <%= sondage.getQuestion_3() %>
                         <br/>
                         
						<tr>
						
						<td><input type="text" name="reponse_3" maxlength="30"/>
						</td>
						</tr>
						
                    </div>
                    <div class="form-group">
                     <br/>
                        <label for="question_4" class="col-sm-2 control-label">Question 4</label>
                       <!-- jsp:getProperty name="sondage" property="question_4"/> -->
                       <%= sondage.getQuestion_4() %>
                         <br/>
                         
						<tr>
						
						<td><input type="text" name="reponse_4" maxlength="30"/>
						</td>
						</tr>
						
                    </div>
                    <div class="form-group">
                     <br/>
                        <label for="question_5" class="col-sm-2 control-label">Question 5</label>
                        <!-- jsp:getProperty name="sondage" property="question_5" /> -->
                         <br/>
                         
						<tr>
						
						<td><input type="text" name="reponse_5" maxlength="30"/>
						<%= sondage.getQuestion_5() %>
						</td>
						</tr>
						
						
             
                    </div>
                   
                    
               <input type="submit" value="Submit" >
<input type="reset" value="Reset">
            	
                    
                    

</form>
</body>
<body>

</body>
</html>