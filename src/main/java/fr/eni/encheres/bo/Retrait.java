/**
 * 
 */
package fr.eni.encheres.bo;

/**
 * Classe en charge
 * @author Vente
 * @version Encheres - v1.0
 * @date 4 juin 2021 - 19:59:17
 */
public class Retrait extends Utilisateur {

	private static final long serialVersionUID = 1L;

	public Retrait() {
		super();
	}

	public Retrait(String adresse, int codePostal, String ville) {
		super(adresse, codePostal, ville);
	}
	
}
