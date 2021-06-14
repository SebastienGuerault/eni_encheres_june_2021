package fr.eni.encheres.bll;


import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.DALException;
import fr.eni.encheres.dal.DAOFactory;
import fr.eni.encheres.dal.UtilisateurDAO;

//TODO vérifier les catch block
public class UtilisateurManager {

	private UtilisateurDAO utilisateurDAO;

	/**
	 * constructeur de UtilisateurManager
	 */
	 public UtilisateurManager() {
		this.utilisateurDAO=DAOFactory.getUtilisateurDAO();
	}

	/**
	 * retourne l'objet utilisateur par son pseudo
	 * @param email
	 * @return pseudo
	 */
	 public String getPseudoFromEmail(String email) {
		String pseudo_name = null;
		try {
			pseudo_name=utilisateurDAO.getPseudoFromEmail(email);
		} catch (DALException e) {
			e.printStackTrace();
		}
		return pseudo_name;
	}


	 public boolean existByEmailAndPassword(String email, String password) {
		Boolean utilisateurExist = false;
		try {
			utilisateurExist=utilisateurDAO.existByEmailAndPassword(email, password);
		} catch (DALException e) {
			e.printStackTrace();
		}
		return utilisateurExist;
	}
	 
	 
	 public void addUser(Utilisateur user) {
		
		try {
			utilisateurDAO.insert(user);
		} catch (DALException e) {
			e.printStackTrace();
		}
	 }
	 
	 /**
	 * retourne l'objet utilisateur par son email
	 * @param email
	 * @return Utilisateur
	 */
	 public Utilisateur getByEmail(String
	 pseudo) {

	 Utilisateur utilisateur=null;

	 try {
	 utilisateur=utilisateurDAO.selectByEmail(pseudo);
	 } catch (DALException e) {
	 e.printStackTrace();
	 }

	 return utilisateur;


	 }


}