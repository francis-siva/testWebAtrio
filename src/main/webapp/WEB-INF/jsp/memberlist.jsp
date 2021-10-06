<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList,com.codestudio.corp.model.Personne" %>
<%
ArrayList<Personne> listPers = (ArrayList<Personne>) request.getAttribute("listperson");
System.out.println("DebUG!!!");
System.out.println(listPers);%>
<!DOCTYPE html>
<html>
	<head>
		<title>Page du Groupe</title>
	 	<meta charset="UTF-8" />
	 	<link rel="stylesheet" href="/style.css" />
	</head>
	
	<body>
		<h1>Liste des utlisateurs</h1>
		
		<table>
			<thead>
				<tr>
					<th>#</th>
					<th>Prénom</th>
					<th>Nom</th>					
					<th>Âge actuel</th>
				</tr>				
			</thead>
			<tbody>
				<%
				if(listPers.size() == 0) {
				%>	
					<tr><td colspan="4">En attente d'inscription des utilisateurs...</td></tr>
				<%
				}
				else {
					for(Personne personne : listPers) {%>
					<tr>
						<td><%= personne.getId() %></td>
						<td><%= personne.getPrenom() %></td>
						<td><%= personne.getNom() %></td>
						<td><%= personne.getNaissance() %></td>
					</tr>
					<%
					}
				}
				%>
			</tbody>
		</table>
	</body>