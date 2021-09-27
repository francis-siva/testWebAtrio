<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Page de Bienvenue</title>
	 	<meta charset="UTF-8" />
	</head>
	
	<body>
		<h1>Bienvenue</h1>
		
		<h3>Saisissez vos informations:</h3>
		<div align="center">
			<form name="register" action="/register" method="post">
			  <label for="prenom">Prénom:</label>
			  <input type="text" id="prenom" name="prenom" value="John">
			  <br />
			  
			  <label for="nom">Last name:</label>
			  <input type="text" id="nom" name="nom" value="Doe">
			  <br />
			  
			  <label for="birth">Date de naissance:</label>
			  <input type="date" id="birth" name="birth" value="2021-09-25">
	   		  <br />
			  <input type="submit" value="Envoyer">
			</form>
		</div>
	</body>

</html> 