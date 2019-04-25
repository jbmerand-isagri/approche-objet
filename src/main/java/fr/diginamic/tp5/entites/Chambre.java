package fr.diginamic.tp5.entites;

/**
 * Chambre de la maison
 * 
 * @author Jean-Baptiste
 *
 */
public class Chambre extends Piece {

	/**
	 * Constructor
	 * 
	 * @param etage
	 * @param superficie
	 */
	public Chambre(int etage, double superficie) {
		super(etage, superficie);
		type = "chambre";
	}

}
