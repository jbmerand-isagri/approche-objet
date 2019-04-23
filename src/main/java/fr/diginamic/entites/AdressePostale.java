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
	
	public AdressePostale(int numeroDeRue, String libelleRue, int codePostal, String ville) {
		this.numeroDeRue = numeroDeRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
		
	}
}
