package fr.diginamic.tp7.listes.entites;

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
