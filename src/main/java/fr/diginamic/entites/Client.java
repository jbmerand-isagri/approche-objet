package fr.diginamic.entites;

/**
 * @author Jean-Baptiste
 *
 */
public class Client {
	int numeroCompte;
	String nom;
	String prenom;
	AdressePostale adresse;

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
}
