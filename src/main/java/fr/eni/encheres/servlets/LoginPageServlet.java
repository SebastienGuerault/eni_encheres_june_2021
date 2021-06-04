package fr.eni.encheres.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/login")
public class LoginPageServlet extends HttpServlet {

	/**
	* Méthode chargée de renvoyer le formulaire de connexion défini dans une page JSP.
	*/
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/login.jsp");
		dispatcher.forward(req, resp);
		
		
	}
	
	/**
	* Méthode en charge de gérer la création de la session une fois que l'utilisateur aura rempli ses
	* informations de connexion.
	*/
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email").trim();
		String motDePasse = req.getParameter("motdepasse").trim();
		
		System.out.println("email : " + email);
		System.out.println("mot de passe : " + motDePasse);
		
		
		// vérifier si l'utilisateur existe et si le mot de passe est valide
		
		if (email.equalsIgnoreCase("guillaumeBalas@email.com") && motDePasse.equals("motdepasse")) {
			
				System.out.println("Identifiants ok, redirection vers la page d'accueil");
				
				req.getSession().setAttribute("email", email);
				
				resp.sendRedirect(req.getContextPath() + "/pageAccueil");
				
		} else {
			
			System.out.println("Les identifiants ne sont pas valides");
			req.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);
			//System.err.println("Email ou mot de passe invalides");
			
		}

		
	}
	

}
