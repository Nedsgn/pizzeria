package fr.pizzeria.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.pizzeria.bean.PizzaBean;
import fr.pizzeria.buisness.impl.PizzaBuisness;

/**
 * Servlet implementation class ModifierPizzaServlet
 */
@WebServlet("/pizza-modifier")
public class ModifierPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzaBuisness pb = new PizzaBuisness();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		int id =Integer.parseInt(idString);
		
		PizzaBean pizza = pb.findOne(id);
		
		request.setAttribute("pizza", pizza);
		
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/pizza-modifier.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		
		String numeroString = request.getParameter("numero");
		
		int numero = 0;
		//le numero générant une exception ( car si on met autre chose que des nombres ca va planter) donc on le met dans un try catch
		try {
			numero = Integer.parseInt(numeroString);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("pizza-modifier");
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
			response.sendRedirect("pizza-modifier");
			return;
		}
		
		String stockString = request.getParameter("stock");
		
int stock=0;
		
		try {
			stock = Integer.parseInt(stockString);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("pizza-modifier");
			return;
		}
		
		String description = request.getParameter("description");
		String urlImg = request.getParameter("urlImg");
		
		if(libelle.equals("") || reference.contentEquals("") ||description.equals("") ||urlImg.equals("")) {
			response.sendRedirect("pizza-modifier");
			return;//on arrete le doPost avec un return. tout ce qui viens après , ça ne l'exécute plus et il n'appelle pas le buisness et donc il n'enregistre pas dans la bdd l'pizza qu n'a rien saisi
			//methode finie
		}
		
		//deleguer à mon buisness la creation de l'pizza, on va lui demander d'insérer ces données
		
	
		boolean ok = pb.update(id, numero, libelle, reference, prix, stock, description, urlImg);
		
		if( ok){
	response.sendRedirect("pizza-infos?id=" + id);
		}else {
			response.sendRedirect("pizza-modifier?id=" + id);
		}
	}

}
