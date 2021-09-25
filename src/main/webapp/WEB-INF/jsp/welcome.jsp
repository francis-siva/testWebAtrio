<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Page de Bienvenue</title>
		 <meta charset="UTF-8">
	</head>
	
	<body>
		<h1>Bienvenue</h1>
		
		<h3>Saisissez vos informations: </h3>
		<form action="/register">
		  <label for="prenom">Prénom:</label><br>
		  <input type="text" id="prenom" name="prenom" value="John"><br>
		  <label for="nom">Last name:</label><br>
		  <input type="text" id="nom" name="nom" value="Doe"><br><br>
		  <input type="submit" value="Envoyer">
		</form> 
	</body>

</html> 