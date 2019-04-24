package fr.diginamic.entites;

/**
 * @author Jean-Baptiste
 *
 */
public class Client {
	private int numeroCompte;
	private String nom;
	private String prenom;
	private AdressePostale adresse;

	/**
	 * @param numeroCompte
	 * @param nom
	 * @param prenom
	 */
	public Client(int numeroCompte, String nom, String prenom) {
		System.out.println("Nouvelle instance créée");
		this.numeroCompte = numeroCompte;
		this.nom = nom;
		this.prenom = prenom;
		System.out.println("Informations qui ont valorisé les variables d'instance : ");
		System.out.println(numeroCompte + ", " + nom + ", " + prenom);
	}

	/**
	 * @param numeroCompte
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Client(int numeroCompte, String nom, String prenom, AdressePostale adresse) {
		this(numeroCompte, nom, prenom);
		this.adresse = adresse;
		System.out.println("Informations qui ont valorisé les variables d'instance : ");
		System.out.println(numeroCompte + ", " + nom + ", " + prenom + ", " + adresse);
	}

	public void displayNomEtPrenom() {
		System.out.println(this.nom.toUpperCase() + ", " + this.prenom);
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public String getNom() {
		return this.nom;
	}

	public int getNumeroCompte() {
		return this.numeroCompte;
	}

	public AdressePostale getAdresse() {
		return adresse;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}

}
