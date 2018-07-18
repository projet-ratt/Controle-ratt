<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenue ! </title>

<style type="text/css">
h1{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:SlateBlue;
text-align: center; text-decoration: underline }
table{font-family: Calibri; color:white; font-size: 11pt; font-style: normal;width: 50%;
text-align:; background-color: SlateBlue; border-collapse: collapse; border: 2px solid navy}
table.inner{border: 0px}

</style>
</head>
<body>
<h1>Bienvenue à notre plateforme de sondage </h1>


 
            <h2>Comment faire pour générer un sondage ? </h2>
 
            <br/>
               
            <p>Cette plateforme vous permet de générer votre propre plateforme, en se connectant comme administarteur
             ou répondre aux sondages disponible .</p>
             
            <br/>
            <% 
        if(request.getParameter("Register") != null) {
               session.setAttribute("status", "guest");
        }
    %>

    
    <br />
<span class="login-box-options">
<a href="Register2.jsp" style="margin-left:30px;">Inscrit-toi</a>
</span>
<br />
<br />
<span class="login-box-options">
<a href="Answer.jsp" style="margin-left:30px;">Répondre ici</a>
</span>
<br />
<br />
<span class="login-box-options">
<a href="Login2.jsp" style="margin-left:30px;">Se connecter</a>
</span>
<br />
    	
    






</body>
</html>