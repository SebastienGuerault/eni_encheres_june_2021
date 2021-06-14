package fr.eni.encheres.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/pageAccueil")
public class PageAccueilConnecteServlet extends HttpServlet {

	/**
	* Méthode chargée de renvoyer le formulaire de connexion défini dans une page JSP.
	*/
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/pageAccueil.jsp");
		dispatcher.forward(req, resp);
		
		
	}
	
	/**
	* Méthode en charge d'afficher la page d'accueil à l'arrivée sur le site
	*/
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);

		
	}
	

}
