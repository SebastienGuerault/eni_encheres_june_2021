/**
 *
 */
package fr.eni.encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.eni.encheres.dal.DALException;
import fr.eni.encheres.dal.UtilisateurDAO;
import fr.eni.encheres.bll.UtilisateurManager;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.ConnectionProvider;

/**
 * Classe en charge de communiquer avec la bdd
 * @version Eni_Encheres_Projet1 - v1.0
 * @date 3 juin 2021 - 11:35:08
 */
public class UtilisateurDAOJdbcImpl  implements UtilisateurDAO {

	@SuppressWarnings("unused")
	private Connection con;
	private PreparedStatement prestmt;
	@SuppressWarnings("unused")
	private Statement stmt;
	private ResultSet rs;

	private static final String SELECT_UTILISATEUR_EXIST = "SELECT COUNT (*) AS nb FROM UTILISATEURS WHERE LOWER(email)=? AND mot_de_passe=?";
	private static final String SELECT_PSEUDO = "SELECT pseudo from UTILISATEURS where LOWER(email)=?";
	private static final String INSERT_UTILISATEUR = "INSERT into UTILISATEURS values (?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_USERS_BY_EMAIL = "SELECT * FROM UTILISATEURS WHERE email = ?";



	public boolean existByEmailAndPassword(String email, String password) throws DALException {
		rs = null;
		Boolean valeurPresent = false;
		//connection a la BDD "eni_encheres"
		try (Connection con = ConnectionProvider.getConnection()) {
			prestmt = con.prepareStatement(SELECT_UTILISATEUR_EXIST);
			prestmt.setString(1, email.toLowerCase());
			prestmt.setString(2, password);

			//calcul de le nombre de la ligne dans la table UTILISATEURS
			rs = prestmt.executeQuery();
			rs.next();
			//Astuce : Selectionner ligne + onglet(refactor) + extract local variable
			int int1 = rs.getInt("nb");
			//tester l'integer, renvoyer true si >= 1 ou false dans le cas contraire
			if (int1 >= 1) {
				valeurPresent = true;
			}


		} catch (SQLException e) {
			throw new DALException("Le select du nombre de ligne dans la table UTILISATEURS de la BDD concernant l'utlisateur " + email + " a echoue" );
		}
		return valeurPresent;

	}

	/**
	* Trouve le pseudo a partir de l'email ds la DB eni_enchere
	* @string email : email de l'utilisateur de login page
	*/
	public String getPseudoFromEmail(String email) throws DALException {
		rs = null;
		String pseudo_name = null;
		try (Connection con = ConnectionProvider.getConnection()) {
			prestmt = con.prepareStatement(SELECT_PSEUDO);
			prestmt.setString(1, email.toLowerCase());
			//Affiche le pseudo de l'utlisateur
			rs = prestmt.executeQuery();
			rs.next();
			pseudo_name = rs.getString("pseudo");
		} catch (SQLException e) {
			throw new DALException("Le select qui retourne le pseudo de l'utlisateur " + email + " a echoue" );
		}
		return pseudo_name;

	}

	/**
	* Méthode en charge d'ajouter un nouvel utilisateur dans la bdd
	* @Utilisateur user : utilisateur à ajouter
	*/
	
	public void insert(Utilisateur user) throws DALException {
		
		rs = null;
		prestmt = null;

		try (Connection con = ConnectionProvider.getConnection()) {
			prestmt = con.prepareStatement(INSERT_UTILISATEUR);
			prestmt.setString(1, user.getPseudo());
			prestmt.setString(2, user.getNom());
			prestmt.setString(3, user.getPrenom());
			prestmt.setString(4, user.getAdresseMail());
			prestmt.setString(5, user.getTelephone());
			prestmt.setString(6, user.getRue());
			prestmt.setString(7, user.getCodePostal());
			prestmt.setString(8, user.getVille());
			prestmt.setString(9, user.getMotDePasse());
			prestmt.setInt(10, user.getCredit());
			prestmt.setByte(11, (byte) (user.getAdministrateur()==false?0:1));
			
			int nbRows = prestmt.executeUpdate();
			
			if(nbRows == 1) {
				rs = prestmt.getGeneratedKeys();
			}
			if(rs.next()) {
				user.setNoUtilisateur(rs.getInt(1));
			}  
		} catch (SQLException e) {
			throw new DALException("L'insert de l'utilisateur inscrit a échoué");			
			}

	}
	
	public Utilisateur selectByEmail(String email) throws DALException {
		
		rs = null;
		prestmt = null;
		Utilisateur user = new Utilisateur();

		try (Connection con = ConnectionProvider.getConnection()) {
			prestmt = con.prepareStatement(SELECT_USERS_BY_EMAIL);
			prestmt.setString(1, email);
		
		rs = prestmt.executeQuery();
		if (rs.next()){
		user = new Utilisateur(
		rs.getInt("no_utilisateur"),
		rs.getString("pseudo"),
		rs.getString("nom"),
		rs.getString("prenom"),
		rs.getString("email"),
		rs.getString("telephone"),
		rs.getString("rue"),
		rs.getString("code_postal"),
		rs.getString("ville"),
		rs.getString("mot_de_passe"),
		rs.getInt("credit"),
		rs.getByte("administrateur")==(byte)0?false:true
		);
		}
		} catch (SQLException e) {
		e.printStackTrace();
		} finally {
		try {
		if (rs != null){
		rs.close();
		}
		if (prestmt != null){
		prestmt.close();
		}
		if(con!=null){
		con.close();
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		return user;
	
		}
}

