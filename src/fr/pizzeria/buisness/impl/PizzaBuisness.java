package fr.pizzeria.buisness.impl;

import java.util.ArrayList;


import fr.pizzeria.bean.PizzaBean;
import fr.pizzeria.buisness.IPizzaBuisness;
import fr.pizzeria.repository.impl.PizzaRepositoryImpl;

public class PizzaBuisness implements IPizzaBuisness{
	PizzaRepositoryImpl pr = new PizzaRepositoryImpl();
	@Override
	public ArrayList<PizzaBean> findAll() {
		ArrayList<PizzaBean> liste = pr.findAll();
		return liste;
	}

	@Override
	public PizzaBean findOne(int id) {
		PizzaBean index = pr.findOne(id);
		return index;
	}

	@Override
	public void supprimerPizza(int id) {
		pr.supprimerPizza(id);
		
	}



	@Override
	public boolean ajouterPizza(int numero, String libelle, String reference, int prix, int stock, String description,
			String urlImg) {
		boolean up = pr.ajouterPizza(numero, libelle ,reference, prix,stock,description, urlImg);
		return up;
	}

	@Override
	public boolean update(int id, int numero, String libelle, String reference, int prix, int stock,
			String description, String urlImg) {
		boolean add = pr.update(id,numero, libelle ,reference, prix,stock,description, urlImg);
		return add;
		
	}



}
