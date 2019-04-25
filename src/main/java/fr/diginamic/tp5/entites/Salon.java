package fr.diginamic.tp5.entites;

/**
 * Salon de la maison
 * 
 * @author Jean-Baptiste
 *
 */
public class Salon extends Piece {

	/**
	 * Constructor
	 * 
	 * @param etage
	 * @param superficie
	 */
	public Salon(int etage, double superficie) {
		super(etage, superficie);
		type = "salon";
	}

}
