package fr.diginamic.entites;

/**
 * @author Jean-Baptiste
 *
 */
public class AdressePostale {
	private int numeroDeRue;
	private String libelleRue;
	private int codePostal;
	private String ville;
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

	public int getNumeroDeRue() {
		return this.numeroDeRue;
	}

	public void setNumeroDeRue(int numeroDeRue) {
		this.numeroDeRue = numeroDeRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
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

}
