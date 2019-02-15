<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pizza modifier</title>
<link rel="stylesheet" href="ressources/css/pizza-ajouter.css" />

</head>

<body>
<img class="logo" alt="webpizza" src="https://www-pizza.fr/img/logo_justeat/web-pizza-villeneuve59650-villeneuve-d-ascq.png">
<c:import url="menu.jsp"></c:import>


	<div class="container">
		<img alt=""
			src="https://cdn0.iconfinder.com/data/icons/restaurant-53/64/Food-junk-pizza-fast_food-512.png">
		
		<form action="pizza-modifier" method="post">
			<fieldset>
				<legend>Modifier une pizza</legend>
				<p>
					<input type="text" id="id"
						name="id" value="${pizza.id }" hidden />
				</p>
				<p>
					<label for="numero">Numéro :</label> <input type="text" id="numero"
						name="numero" value="${pizza.numero }" />
				</p>
				<p>
					<label for="libelle">Libelle :</label> <input type="text"
						id="libelle" name="libelle" value="${pizza.libelle }" />
				</p>
				<p>
					<label for="libelle">Référence :</label> <input type="text"
						id="reference" name="reference" value="${pizza.reference }" />
				</p>
				<p>
					<label for="prix">Prix :</label> <input type="text" id="prix"
						name="prix" value="${pizza.prix }" />
				</p>
				<p>
					<label for="description">Description :</label> <input type="text"
						id="description" name="description"
						value="${pizza.description }" />
				</p>
				<p>
					<label for="stock">Stock :</label> <input type="text" id="stock"
						name="stock" value="${pizza.stock }" />
				</p>
				<p>
					<label for="photo">Url de la photo :</label> <input type="text" id="urlImg"
						name="urlImg" value="${pizza.urlImg }" />
				</p>

			</fieldset>
			<p class="button">
				<input type="reset"> <input type="submit">
			</p>
		</form>


<a href="accueil">Retour</a>
	</div>
	
</body>
</html>