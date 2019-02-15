<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pizza ajouter</title>
<link rel="stylesheet" href="ressources/css/pizza-ajouter.css" />

</head>

<body>
<c:import url="menu.jsp"></c:import>

	<h1>Ajouter une pizza</h1>

	<div class="container">
		<img alt=""
			src="https://cdn0.iconfinder.com/data/icons/restaurant-53/64/Food-junk-pizza-fast_food-512.png">
		
		<form action="pizza-ajouter" method="post">
			<fieldset>
				<legend>Ajout d'une nouvelle pizza</legend>
				<p>
					<label for="numero">Numéro :</label> <input type="text" id="numero"
						name="numero" placeholder="Votre numero" />
				</p>
				<p>
					<label for="libelle">Libelle :</label> <input type="text"
						id="libelle" name="libelle" placeholder="Votre libelle" />
				</p>
				<p>
					<label for="libelle">Référence :</label> <input type="text"
						id="reference" name="reference" />
				</p>
				<p>
					<label for="prix">Prix :</label> <input type="text" id="prix"
						name="prix" placeholder="prix de la pizza" />
				</p>
				<p>
					<label for="description">Description</label> <input type="text"
						id="description" name="description"
						placeholder="Votre description" />
				</p>
				<p>
					<label for="stock">Stock</label> <input type="text" id="stock"
						name="stock" placeholder="stock de la pizza" />
				</p>
				<p>
					<label for="photo">Photo</label> <input type="text" id="urlImg"
						name="urlImg" placeholder="Votre url image" /> <input type="file"
						id="photo" name="photo" accept="image/png, image/jpeg">
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