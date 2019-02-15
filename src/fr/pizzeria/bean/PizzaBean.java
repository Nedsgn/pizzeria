package fr.pizzeria.bean;

public class PizzaBean {
	private int id;
private int numero;
private String libelle;
private String reference;
private int prix;
private int stock;
private String description;
private String urlImg;
public PizzaBean() {
	super();
	// TODO Auto-generated constructor stub
}
public PizzaBean(int id, int numero, String libelle, String reference, int prix, int stock, String description,
		String urlImg) {
	super();
	this.id = id;
	this.numero = numero;
	this.libelle = libelle;
	this.reference = reference;
	this.prix = prix;
	this.stock = stock;
	this.description = description;
	this.urlImg = urlImg;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public String getReference() {
	return reference;
}
public void setReference(String reference) {
	this.reference = reference;
}
public int getPrix() {
	return prix;
}
public void setPrix(int prix) {
	this.prix = prix;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getUrlImg() {
	return urlImg;
}
public void setUrlImg(String urlImg) {
	this.urlImg = urlImg;
}


}
