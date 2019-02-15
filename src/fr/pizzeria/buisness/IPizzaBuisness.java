package fr.pizzeria.buisness;

import java.util.ArrayList;

import fr.pizzeria.bean.PizzaBean;


public interface IPizzaBuisness {
public ArrayList<PizzaBean> findAll();
public PizzaBean findOne(int id);

public void supprimerPizza(int id);
public boolean update(int id, int numero, String libelle, String reference, int prix, int stock, String description, String urlImg);
public boolean ajouterPizza(int numero, String libelle, String reference, int prix, int stock, String description, String urlImg);
}
