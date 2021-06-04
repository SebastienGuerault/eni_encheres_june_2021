<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Page d'accueil</title>
	</head>
	
	<body>
	
		<h1>Bienvenue ${sessionScope.email} sur le site ENI Enchères</h1>
		
		<a href="${pageContext.request.contextPath}/logout">Logout</a>
	
	</body>
</html>