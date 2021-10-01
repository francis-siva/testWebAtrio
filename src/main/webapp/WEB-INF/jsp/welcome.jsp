<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Page de Bienvenue</title>
	 	<meta charset="UTF-8" />
	 	<link rel="stylesheet" href="/style.css" />
	</head>
	
	<body>
		<h1>Bienvenue</h1>
		
		<h3>Inscrivez-vous</h3>
		<div align="center">
			<form name="register" action="/register" method="post">
			  <div>
				  <label for="nom">Nom:</label><br />
				  <input class="form-field" type="text" id="nom" name="nom" value="Doe">
			  </div>			  
			  
			  <div>
				  <label for="prenom">Prénom:</label><br />
				  <input class="form-field" type="text" id="prenom" name="prenom" value="John">
			  </div>		  
			  
			  <div>
				  <label for="birth">Date de naissance:</label><br />
				  <input class="form-field" type="date" id="birth" name="birth" value="2021-09-25">
			  </div>
	   		  
	   		  <div>
			  	<input class="input-submit" type="submit" value="Valider">
			  </div>
			</form>
		</div>
	</body>

</html> 