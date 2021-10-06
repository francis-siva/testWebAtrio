<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.codestudio.corp.model.Personne" %>
<%
Personne user = (Personne) request.getAttribute("personne");
String errorOnDateFormat = (String) request.getAttribute("ErrorOnDateFormat");
String errorOnDateLimit = (String) request.getAttribute("ErrorOnDateLimit");
System.out.println("Personne in JSP :" + user.toString()); 
boolean isErrorOnDate = (errorOnDateFormat != null || errorOnDateLimit != null);%>

<!DOCTYPE html>
<html>
	<head>
		<title>Page de Connexion</title>
	 	<meta charset="UTF-8" />
	 	<% if(isErrorOnDate) { %>
	 	<meta http-equiv="Refresh" content="5;url=/">
	 	<%} %>
	 	<link rel="stylesheet" href="/style.css" />
	</head>
	
	<body>
		<h1>Bienvenue</h1>
		<h3 class="warning">${ empty ErrorOnDateFormat ? "" : "Saisir une date de naissance au Format JJ/MM/AAAA !" }</h3>
		<h3 class="warning">${ empty ErrorOnDateLimit ? "" : "La personne doit avoir moins de 150 ans pour s'inscrire !" }</h3>
		
		<%
		if(!isErrorOnDate) { %>
			<!--  user.getPrenom() + " " + user.getNom() %> -->
			<h3 class="userName">${ empty personne ? 'Utilisateur' : personne.getPrenom() } ${ empty personne ? '' : personne.getNom() } :</h3>
			<div align="center">
				<p>Heureux de vous compter parmi la communauté !</p>
			</div>
			<%
		}
		else {
		%>
			<div align="center">
				<p>Vous allez être redirigé à la page d'inscription. !</p>
			</div>
		<%
		}
		%>
	</body>

</html> 