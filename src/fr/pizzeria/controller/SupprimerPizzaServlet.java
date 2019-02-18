package fr.pizzeria.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.pizzeria.buisness.impl.PizzaBuisness;

/**
 * Servlet implementation class SupprimerPizzaServlet
 */
@WebServlet("/supprimer")
public class SupprimerPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzaBuisness pb = new PizzaBuisness();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		pb.supprimerPizza(id);
		
		response.sendRedirect("accueil");//nom de la 1ere servlet, on redirige vers une autre servlet
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
