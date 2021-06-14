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
@WebServlet(urlPatterns = "/inscription")
public class PageInscriptionServlet extends HttpServlet {

	/**
	* Méthode chargée d'afficher le formulaire d'inscription défini dans une page JSP.
	*/
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/inscription.jsp");
		dispatcher.forward(req, resp);
		

		
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  String pseudo = req.getParameter("pseudonyme").trim();
		  String nom = req.getParameter("nom").trim();
		  String prenom = req.getParameter("prenom").trim();
		  String email = req.getParameter("email").trim();
		  String tel = req.getParameter("telephone").trim();
		  String rue = req.getParameter("rue").trim();
		  String codePostal = req.getParameter("codePostal").trim();
		  String ville = req.getParameter("ville").trim();		  
		  String password = req.getParameter("motdepasse").trim();
		  int credit = 100;
		  Boolean admin = false;		  

		  UtilisateurManager utilisateurManager = new UtilisateurManager();
		  
		  Utilisateur utilisateurInscrit = new Utilisateur(pseudo,nom,prenom,email,tel,rue,codePostal,ville,password,credit,admin);
		  
		  utilisateurManager.addUser(utilisateurInscrit);
		  
		  resp.sendRedirect(req.getContextPath() + "/login");
		  
		  
			/*
			 * RequestDispatcher dispatcher =
			 * req.getRequestDispatcher("/WEB-INF/jsp/inscription.jsp");
			 * dispatcher.forward(req, resp);
			 */
		  
	}
	

}
