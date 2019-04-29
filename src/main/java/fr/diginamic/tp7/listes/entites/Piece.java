package fr.diginamic.tp7.listes.entites;

/**
 * Classe abstraite Piece pour modéliser une maison
 * 
 * @author Jean-Baptiste
 *
 */
public abstract class Piece {
	private int etage;
	private double superficie;
	protected String type;

	/**
	 * Constructor
	 * 
	 * @param etage
	 * @param superficie
	 */
	public Piece(int etage, double superficie) {
		this.etage = etage;
		this.superficie = superficie;
	}

	/**
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}

	/**
	 * @param etage
	 *            the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}

	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie
	 *            the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
