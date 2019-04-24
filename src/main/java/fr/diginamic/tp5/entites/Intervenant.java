package fr.diginamic.tp5.entites;

/**
 * @author Jean-Baptiste
 *
 */
public abstract class Intervenant {
	protected String nom;
	protected String prenom;

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Retourne salaire au mois
	 * 
	 * @return
	 */
	public abstract double getSalaire();

	/**
	 * Affiche les informations à propos de l'intervenant
	 */
	public void afficherDonnees() {
		System.out.println(nom + " " + prenom);
	}

}
