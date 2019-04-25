package fr.diginamic.tp5.entites;

/**
 * Cuisine de la maison
 * 
 * @author Jean-Baptiste
 *
 */
public class Cuisine extends Piece {

	/**
	 * Constructor
	 * 
	 * @param etage
	 * @param superficie
	 */
	public Cuisine(int etage, double superficie) {
		super(etage, superficie);
		type = "cuisine";
	}

}
