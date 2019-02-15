package fr.pizzeria.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.pizzeria.bean.PizzaBean;
import fr.pizzeria.repository.IPizzaRepository;

public class PizzaRepositoryImpl implements IPizzaRepository{

	@Override
	public ArrayList<PizzaBean> findAll() {
		ArrayList<PizzaBean> listePizzas = new ArrayList<>();//on fais un tableau pour récuperer tous les Pizzas
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = 
					DriverManager.getConnection
					("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			
			Statement st = cnx.createStatement();
			
			ResultSet resultat = st.executeQuery
					("SELECT id, numero, libelle, reference, prix, stock, description, urlImg FROM pizza");
			
			while (resultat.next()) {
				int id = resultat.getInt("id");
				int numero = resultat.getInt("numero");	
				String libelle = resultat.getString("libelle");
				String reference = resultat.getString("reference");
				int prix = resultat.getInt("prix");
				int stock = resultat.getInt("stock");
				String description = resultat.getString("description");
				String urlImg = resultat.getString("urlImg");
				
				
				PizzaBean u = new PizzaBean( id, numero, libelle, reference, prix, stock, description, urlImg);
				
				listePizzas.add(u);//on ajoute les données stockées dans l'objet u au tableau listePizzas
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listePizzas;
	}

	@Override
	public PizzaBean findOne(int id) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			Connection nx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			
			Statement st = nx.createStatement();
			
			ResultSet resultat = st.executeQuery
					("SELECT id, numero, libelle, reference, prix, stock, description, urlImg FROM pizza WHERE id=" + id);
			
			while (resultat.next()) {
				int id1 = resultat.getInt("id");
				int numero = resultat.getInt("numero");	
				String libelle = resultat.getString("libelle");
				String reference = resultat.getString("reference");
				int prix = resultat.getInt("prix");
				int stock = resultat.getInt("stock");
				String description = resultat.getString("description");
				String urlImg = resultat.getString("urlImg");
				
				PizzaBean idd = new PizzaBean(
						id1,numero, libelle, reference, prix, stock, description, urlImg);
				
				return idd;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
		
	}

	@Override
	public void supprimerPizza(int id) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			Connection nx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			
			Statement st = nx.createStatement();
			
		st.executeQuery(
					
	"	DELETE FROM pizza WHERE id = " + id);
			
			//pas besoin de boucle while car on a besoin de rien récvuperer on veut juste supprimer
				
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean update(int id, int numero, String libelle, String reference, int prix, int stock, String description,
			String urlImg) {
		try {
				Class.forName("org.mariadb.jdbc.Driver");
			
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			PreparedStatement ps = cnx.prepareStatement("UPDATE Pizza SET  numero = ?,libelle = ?,reference = ? ,prix = ?,stock= ?,description = ?,urlImg = ? WHERE id = ?");


			
			
			ps.setInt(1, numero);
			ps.setString(2, libelle);
			ps.setString(3, reference);
			ps.setInt(4, prix);
			ps.setInt(5, stock);
			ps.setString(6, description);
			ps.setString(7, urlImg);
			ps.setInt(8, id);	
			ps.executeUpdate();
		
			return true;
		
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean ajouterPizza(int numero, String libelle, String reference, int prix, int stock, String description,
			String urlImg) {
		try {Class.forName("org.mariadb.jdbc.Driver");
		
		Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
		//il va préparer des paramètres
		PreparedStatement ps = cnx.prepareStatement("INSERT INTO pizza (numero,libelle,reference,prix,stock,description,urlImg) VALUES (?,?,?,?,?,?,?) ");

			ps.setInt(1, numero);
			ps.setString(2, libelle);
			ps.setString(3, reference);
			ps.setInt(4, prix);
			ps.setInt(5, stock);
			ps.setString(6, description);
			ps.setString(7, urlImg);
				
				ps.executeUpdate();
				
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}		return false;
			}

}
