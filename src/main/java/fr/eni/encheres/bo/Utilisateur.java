/**
 * 
 */
package fr.eni.encheres.bo;

/**
 * Classe en charge
 * @author Vente
 * @version Encheres - v1.0
 * @date 4 juin 2021 - 20:00:47
 */
import java.io.Serializable;

public abstract class Utilisateur implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	private int noUtilisateur;
	private String nom;
	private String prenom;
	private String adresseMail;
	private String motDePasse;
	private String adresse;
	private int codePostal;
	private String ville;
	private int telephone;
	private int credit;
	private Boolean administrateur;
	
	public Utilisateur() {
	}

	public Utilisateur(int noUtilisateur, String nom, String prenom, String adresseMail, String motDePasse, String adresse, int codePostal, String ville, int telephone, int credit, Boolean administrateur) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
		this.motDePasse = motDePasse;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.credit = credit;
		this.administrateur = administrateur;
	}
	
	public Utilisateur(String adresse, int codePostal2, String ville2) {
	}

	public int getNoUtilisateur() {
		return noUtilisateur;
	}

	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	
	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public Boolean getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Boolean administrateur) {
		this.administrateur = administrateur;
	}

	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", nom=" + nom + ", prenom=" + prenom + ", adresseMail="
				+ adresseMail + ", motDePasse=" + motDePasse + ", adresse=" + adresse + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", telephone=" + telephone + ", credit=" + credit + ", administrateur="
				+ administrateur + "]";
	}
}