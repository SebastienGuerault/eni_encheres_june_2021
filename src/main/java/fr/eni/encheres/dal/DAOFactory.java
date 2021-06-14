package fr.eni.encheres.dal;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.jdbc.UtilisateurDAOJdbcImpl;

public class DAOFactory implements UtilisateurDAO {

	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOJdbcImpl();
	}


	public boolean existByEmailAndPassword(String email, String password) {
		return false;
	}


	public String getPseudoFromEmail(String email) throws DALException {
		return null;
	}


	public void insert(Utilisateur user) throws DALException {
		
	}


	public Utilisateur selectByEmail(String email) throws DALException {
		return null;
	}
}


