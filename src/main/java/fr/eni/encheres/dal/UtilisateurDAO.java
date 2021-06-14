package fr.eni.encheres.dal;

import fr.eni.encheres.bo.Utilisateur;

public interface UtilisateurDAO {
	public boolean existByEmailAndPassword(String email, String password) throws DALException;
	public String getPseudoFromEmail(String email) throws DALException;
	public void insert(Utilisateur user) throws DALException;
	public Utilisateur selectByEmail(String email) throws DALException;
}
