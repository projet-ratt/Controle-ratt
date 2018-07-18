<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenue à votre session</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
h2{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:SlateBlue;
text-align: center; text-decoration: underline }
table{font-family: Calibri; color:white; font-size: 11pt; font-style: normal;width: 50%;
text-align:; background-color: SlateBlue; border-collapse: collapse; border: 2px solid navy}
table.inner{border: 0px}

<form method="post" action="LoginServlet">
<jsp:useBean id="admin" class="com.projectratt.model.Admin" scope="session" />
</style>
</head>
<body>

<h2> Bienvenue à votre session : </h2>
 
 <jsp:getProperty name="admin" property="first_name" />
 
	
 <jsp:getProperty name="admin" property="last_name" />
 
	


<br>
<p> Vous voulez créer un sondage ? </p>

            <a href="SondageForm.jsp"> Créer un sondage</a>
       <br/>
        <br>   
<p> Vous voulez voir les réponses à votre sondage ? </p>

<a href="Repport.jsp"> Voir réponse</a>
<br/>

</body>
</html>