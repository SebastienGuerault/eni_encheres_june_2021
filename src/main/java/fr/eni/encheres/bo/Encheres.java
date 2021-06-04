/**
 * 
 */
package fr.eni.encheres.bo;

import java.util.Date;

/**
 * Classe en charge
 * @author Vente
 * @version Encheres - v1.0
 * @date 4 juin 2021 - 19:58:26
 */
public class Encheres {

	private Date dateEnchere;
	private int montantEnchere;
	
	public Encheres() {
	
	}

	public Encheres(Date dateEnchere, int montantEnchere) {
		super();
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
	}
	
	public Date getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	
	public int getMontantEnchere() {
		return montantEnchere;
	}

	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}

	@Override
	public String toString() {
		return "Encheres [dateEnchere=" + dateEnchere + ", montantEnchere=" + montantEnchere + "]";
	}
}
