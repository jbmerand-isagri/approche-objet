package fr.diginamic.entites;

/**
 * @author Jean-Baptiste
 *
 */
public class AdressePostale {
	public int numeroDeRue;
	public String libelleRue;
	public int codePostal;
	public String ville;
	static public int nbDepartements = 102;

	/**
	 * constructeur vide pour précédents tests
	 * 
	 */
	public AdressePostale() {

	}

	/**
	 * @param numeroDeRue
	 * @param libelleRue
	 * @param codePostal
	 * @param ville
	 */
	public AdressePostale(int numeroDeRue, String libelleRue, int codePostal, String ville) {
		this.numeroDeRue = numeroDeRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;

	}

}
