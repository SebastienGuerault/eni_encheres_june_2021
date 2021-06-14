package fr.eni.encheres.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//recuperation de la session
		HttpSession session = req.getSession();

		//deconnexion de la session
		session.invalidate();

		//forward vers accueil
		resp.sendRedirect(req.getContextPath() + "/pageAccueil");
		
		
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		


		
	}
	

	

}
