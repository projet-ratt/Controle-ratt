<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sondage</title>

<link href="css/style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
h2{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:SlateBlue;
text-align: center; text-decoration: underline }
table{font-family: Calibri; color:white; font-size: 11pt; font-style: normal;width: 50%;
text-align:; background-color: SlateBlue; border-collapse: collapse; border: 2px solid navy}
table.inner{border: 0px}

</style>
</head>

<h1> Créer votre premier sondage </h1>

<body>
<h2>Générer votre Sondage en remplissant ce formulaire</h2>
</head>

<form action="SondageServlet" method="POST">
<jsp:useBean id="admin" class="com.projectratt.model.Admin" scope="session" />


 
<form class="form-horizontal company" role="form" id="comp">
                    <div class="form-group">
                    <p> Sondage généré par : </p>
                    
 					<jsp:getProperty name="admin" property="first_name" />
 					
 					<jsp:getProperty name="admin" property="last_name" />
 					
 
                    	<br/>
                        <label for="titre_sondage" class="col-sm-2 control-label">Titre pour ce sondage </label>
                        <div class="col-sm-10">
                            <input name = "titre_sondage" type="text" class="form-control" id="name" placeholder="Titre">
                        </div>
                        <br/>
                    </div>
                    
                     <div class="form-group">
                      <br/>
                        <label for="theme" class="col-sm-2 control-label">Theme</label>
                        <div class="col-sm-10">
                            <input name = "nom_theme"type="text" class="form-control" id="nom_theme" placeholder="Theme">
                        </div>
                         <br/>
                    </div>
                    <div class="form-group">
                    
             <br/>
                        <label for="question_1" class="col-sm-2 control-label">Question 1</label>
                        <div class="col-sm-10">
                            <input name = "question_1"type="text" class="form-control" id="question_1"  placeholder="Question_1">
                        </div>
                         <br/>
                    </div>
                      <div class="form-group">
                       <br/>
                        <label for="question_2" class="col-sm-2 control-label">Question 2</label>
                        <div class="col-sm-10">
                            <input name = "question_2"type="text" class="form-control" id="question_2"  placeholder="Question_2">
                        </div>
                         <br/>
                    </div>
                      <div class="form-group">
                       <br/>
                        <label for="question_3" class="col-sm-2 control-label">Question 3</label>
                        <div class="col-sm-10">
                            <input name = "question_3"type="text" class="form-control" id="question_3" placeholder="Question_3">
                        </div>
                         <br/>
                    </div>
                    <div class="form-group">
                     <br/>
                        <label for="question_4" class="col-sm-2 control-label">Question 4</label>
                        <div class="col-sm-10">
                            <input name = "question_4"type="text" class="form-control" id="question_4" placeholder="Question_4">
                        </div>
                         <br/>
                    </div>
                    <div class="form-group">
                     <br/>
                        <label for="question_5" class="col-sm-2 control-label">Question 5</label>
                        <div class="col-sm-10">
                            <input name = "question_5"type="text" class="form-control" id="question_5" placeholder="Question_5">
                        </div>
                         <br/>
             
                    </div>
               <input type="submit" value="Submit">
<input type="reset" value="Reset">
            	
                    
                    

</form>
<body>



</body>
</html>