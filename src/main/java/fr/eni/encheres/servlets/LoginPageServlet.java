package fr.eni.encheres.servlets;

import java.io.IOException;

import fr.eni.encheres.bll.UtilisateurManager;
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

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		dispatcher.forward(req, resp);


	}

	/**
	* Méthode en charge de gérer la création de la session une fois que l'utilisateur aura rempli ses
	* informations de connexion.
	*/
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String motDePasse = req.getParameter("motdepasse");
		UtilisateurManager utilisateurManager = new UtilisateurManager();

		try {
			String pseudo = utilisateurManager.getPseudoFromEmail(email);
			req.setAttribute("pseudo", pseudo);
			System.out.println(pseudo);


			if (utilisateurManager.existByEmailAndPassword(email, motDePasse)) {

					System.out.println("Identifiants ok, redirection vers la page d'accueil");

					req.getSession().setAttribute("email", email);

					req.getRequestDispatcher("/WEB-INF/jsp/pageAccueil.jsp").forward(req, resp);

			} else {
				req.setAttribute("error_message", "Erreur d'email");
				System.out.println("Les identifiants ne sont pas valides, redirection vers la page de connexion");
				req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
