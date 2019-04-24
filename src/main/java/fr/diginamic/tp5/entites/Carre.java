package fr.diginamic.tp5.entites;

/**
 * Classe Carre qui hérite de Rectangle
 * 
 * @author Jean-Baptiste
 *
 */
public class Carre extends Rectangle {
	/**
	 * Constructeur
	 * 
	 * @param longueur
	 */
	public Carre(double longueur) {
		super(longueur, longueur); // constructeur parent, ses deux paramètres
	}

}
