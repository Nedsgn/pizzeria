<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pizza infos</title>
<link rel="stylesheet" href="ressources/css/pizza-infos.css" />

</head>
<body>


<img class="logo" alt="webpizza" src="https://www-pizza.fr/img/logo_justeat/web-pizza-villeneuve59650-villeneuve-d-ascq.png">
<c:import url="menu.jsp"></c:import>

	<div class="container ">
			<h1>La pizza ${pizza.libelle } </h1>
		
	<div class="container1">

		
<div class="caption-style-1">
		<img alt="" src="${pizza.urlImg }">
			<div class="caption">
					<div class="blur"></div>
					<div class="caption-text">
						<h1>${pizza.libelle}</h1>
						<p>Whatever It Is - Always Awesome</p>
					</div>
				</div>
</div>
		<div class="description">
			<ul>

				<li><span class="prix">Prix:</span> ${pizza.prix } €</li>
				<li><span>Numéro ref :</span> ${pizza.numero }</li>
				<li><span >Référence : ${pizza.reference}</span></li>
				<li><span>Description:</span> ${pizza.description }</li>
				
				

			</ul>
			<p>
	<a class="button" href="pizza-modifier?id=${pizza.id }">Modifier</a>
	<a class="button" href="supprimer?id=${pizza.id }">Suprrimer</a>
		
	
			<a class="button" href="accueil">Retour</a>
			</p>
		</div>
		
	</div>
	</div>
	
<footer>
<p> &copy; Web pizza - Tous droits réservés </p>
</footer>

</body>
</html>