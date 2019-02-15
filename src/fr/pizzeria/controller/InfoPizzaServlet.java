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
 * Servlet implementation class InfoPizzaServlet
 */
@WebServlet("/pizza-infos")
public class InfoPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzaBuisness pb = new PizzaBuisness();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		String idString = request.getParameter("id"); 
		int id = Integer.parseInt(idString); 
		
	PizzaBean pizza = pb.findOne(id);//j'appelle l'objet créé plus haut à partir du buisness
		
		request.setAttribute("pizza", pizza);
		
	
		
		PizzaBean index= pb.findOne(id);
		
		
		
		request.setAttribute("pizza", index);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/pizza-infos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
