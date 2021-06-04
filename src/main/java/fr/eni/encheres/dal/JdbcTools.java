/**
 * 
 */
package fr.eni.encheres.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe en charge
 * @author Vente
 * @version Encheres - v1.0
 * @date 4 juin 2021 - 20:03:23
 */
public class JdbcTools {

	private static String url;
	private static String user;
	private static String mdp;
	private static Connection con;
	private static Statement stmt;
	private static PreparedStatement prestmt;

	static {
		url = Settings.getProperty("url");
		user = Settings.getProperty("user");
		mdp = Settings.getProperty("mdp");
	}
	
	public static Connection getConnexion() throws SQLException {
		Connection con = DriverManager.getConnection(url, user, mdp);
		return con;
	}
	
	public static void closeConnection() throws SQLException{
		if (con != null) {
			con.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (prestmt != null) {
			prestmt.close();
		}
	}
	
}
