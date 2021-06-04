/**
 * 
 */
package fr.eni.encheres.bo;

/**
 * Classe en charge
 * @author Vente
 * @version Encheres - v1.0
 * @date 4 juin 2021 - 19:57:28
 */
public class Categorie {

	private int noCategorie;
	private String libelle;
	
	public Categorie() {
		
	}

	public Categorie(int noCategorie, String libelle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}
	
	public int getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}
	
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + "]";
	}
}
