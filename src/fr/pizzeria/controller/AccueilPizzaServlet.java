package fr.pizzeria.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.pizzeria.bean.PizzaBean;
import fr.pizzeria.buisness.impl.PizzaBuisness;


/**
 * Servlet implementation class AccueilPizzaServlet
 */
@WebServlet("/accueil")
public class AccueilPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzaBuisness pb = new PizzaBuisness();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ArrayList<PizzaBean> liste = pb.findAll();//j'appelle l'objet créé plus haut à partir du buisness
		
		request.setAttribute("pizza", liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/accueil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
