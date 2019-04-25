package fr.diginamic.tp5.entites;

/**
 * WC de la maison
 * 
 * @author Jean-Baptiste
 *
 */
public class WC extends Piece {

	/**
	 * Constructor
	 * 
	 * @param etage
	 * @param superficie
	 */
	public WC(int etage, double superficie) {
		super(etage, superficie);
		type = "wc";
	}

}
