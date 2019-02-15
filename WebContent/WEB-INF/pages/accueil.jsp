<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Pizza</title>
<link rel="stylesheet" href="ressources/css/accueil.css" />

</head>
<body>
<c:import url="menu.jsp"></c:import>

<h1>Bienvenue chez Web pizza</h1>
<div class="container">
	<a class="button" href="pizza-ajouter">Ajouter une pizza</a>
	
	<c:forEach items="${pizza}" var="pi">
		<div class="user">
			<p><span>Nom :</span>  ${pi.libelle }<br />
			 <span>Prix :</span>  ${pi.prix} €</p>
			<a href="pizza-infos?id=${pi.id }"><img alt="" src="${pi.urlImg }"></a>
		</div>
		

</c:forEach>
</div>

</body>
</html>