package fr.eni.encheres.servlets;

import java.io.IOException;

import fr.eni.encheres.bll.UtilisateurManager;
import fr.eni.encheres.bo.Utilisateur;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/profil")
public class ProfilServlet extends HttpServlet {


	
	  @Override protected void doGet(HttpServletRequest req, HttpServletResponse
	  resp) throws ServletException, IOException {
	  
			/*
			 * UtilisateurManager utilisateurManager = new UtilisateurManager(); Utilisateur
			 * user; String emailSession = req.getSession().getAttribute(email);
			 * 
			 * 
			 * 
			 * user = utilisateurManager.getByEmail(email);
			 * req.setAttribute("utilisateurAAfficher", user);
			 */

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/profil.jsp");
		dispatcher.forward(req, resp);

		
		
	}
	
	/**
	* Méthode en charge d'afficher la page d'accueil à l'arrivée sur le site
	*/
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		
	}
	

}
