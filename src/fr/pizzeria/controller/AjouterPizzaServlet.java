package fr.pizzeria.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.pizzeria.buisness.impl.PizzaBuisness;

/**
 * Servlet implementation class AjouterPizzaServlet
 */
@WebServlet("/pizza-ajouter")
public class AjouterPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzaBuisness pb = new PizzaBuisness();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/pizza-ajouter.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String numeroString = request.getParameter("numero");
		
		int numero = 0;
		//le numero générant une exception ( car si on met autre chose que des nombres ca va planter) donc on le met dans un try catch
		try {
			numero = Integer.parseInt(numeroString);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("pizza-ajouter");
			return;
		}
		String libelle= request.getParameter("libelle");

		String reference = request.getParameter("reference");
	
		String prixString = request.getParameter("prix");
		
		int prix=0;
		
		try {
			prix = Integer.parseInt(prixString);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("pizza-ajouter");
			return;
		}
		
		String stockString = request.getParameter("stock");
		
int stock=0;
		
		try {
			stock = Integer.parseInt(stockString);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("pizza-ajouter");
			return;
		}
		
		String description = request.getParameter("description");
		String urlImg = request.getParameter("urlImg");
		
		if(libelle.equals("") || reference.contentEquals("") ||description.equals("") ||urlImg.equals("")) {
			response.sendRedirect("pizza-ajouter");
			return;//on arrete le doPost avec un return. tout ce qui viens après , ça ne l'exécute plus et il n'appelle pas le buisness et donc il n'enregistre pas dans la bdd l'pizza qu n'a rien saisi
			//methode finie
		}
		
		//deleguer à mon buisness la creation de l'pizza, on va lui demander d'insérer ces données
		
	
		boolean ok = pb.ajouterPizza( numero, libelle, reference, prix, stock, description, urlImg);
		
		if( ok){
	response.sendRedirect("accueil");
		}else {
			response.sendRedirect("pizza-ajouter");
		}
		
	}

}
