<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Se connecter </title>

<link href="css/style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
h2{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:SlateBlue;
text-align: center; text-decoration: underline }
table{font-family: Calibri; color:white; font-size: 11pt; font-style: normal;width: 50%;
text-align:; background-color: SlateBlue; border-collapse: collapse; border: 2px solid navy}
table.inner{border: 0px}

</style>
</head>
<body>



<h2>Se connecter </h2>
</head>

<body>

<form method="post" action="LoginServlet">
<div style="padding: 100px 0 0 250px;">





<form>


</br>

</br>
  <div class="form-group">
    <label for="exampleInputEmail1">Email Adresse</label>
    <input name="userId" type ="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Entrer email">
    
  </div>
  </br>
  </br>
  
  </br>
  </br>
  <div class="form-group">
    <label for="exampleInputPassword1">Mot de passe</label>
    <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  </br>
  </br>
  
  <button type="submit" class="btn btn-primary">Se connecter</button>
  </br>
  </br>
  
New User?  <a href="Register.jsp" style="margin-left:30px;">Inscris-toi ici</a>
</br>
</br>
  
</form>


</div>

</form>

</body>
</html>
