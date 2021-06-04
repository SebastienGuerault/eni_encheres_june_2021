/**
 * 
 */
package fr.eni.encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.eni.encheres.dal.JdbcTools;

/**
 * Classe en charge
 * @author Vente
 * @version Encheres - v1.0
 * @date 4 juin 2021 - 20:14:55
 */
public class UtilisateurDAOJdbcImpl {

	private Connection con;
	private PreparedStatement prestmt;
	private static final String SELECT_EMAIL_MDP_EXIST = "SELECT COUNT (*) AS nb FROM Utilisateurs WHERE LOWER(email)=? AND password=?";

	public boolean existByEmailAndPassword(String email, String password) {
		ResultSet rs = null;
		Boolean valeurPresent = false;
		try {
			//connection a la BDD eni_encheres avec une cle generee
			con = JdbcTools.getConnexion();

			prestmt = con.prepareStatement(SELECT_EMAIL_MDP_EXIST, Statement.RETURN_GENERATED_KEYS);
			prestmt.setString(1, email.toLowerCase());
			prestmt.setString(2, password);

			//calcul de le nombre de la ligne la table UTILISATEUR
			rs = prestmt.executeQuery();
			rs.next();
			//Astuce : Selectionner ligne + onglet(refactor) + extract local variable
			int int1 = rs.getInt("nb");

			//tester l'integer, renvoyer true si >= 1 ou false dans le cas contraire
			if (int1 >=1) {
				valeurPresent = true;
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return valeurPresent;


	}
}
