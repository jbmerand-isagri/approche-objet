package fr.diginamic.tp5.entites;

/**
 * Salle de bain de la maison
 * 
 * @author Jean-Baptiste
 *
 */
public class SalleDeBain extends Piece {

	/**
	 * Constructor
	 * 
	 * @param etage
	 * @param superficie
	 */
	public SalleDeBain(int etage, double superficie) {
		super(etage, superficie);
		type = "salledebain";
	}

}
