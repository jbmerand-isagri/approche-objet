package fr.diginamic.tp5.entites;

/**
 * Classe Rectangle héritant de Forme
 * 
 * @author Jean-Baptiste
 *
 */
public class Rectangle extends Forme {
	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		return longueur * largeur;
	}

	@Override
	public double calculerPerimetre() {
		return 2 * (longueur + largeur);
	}

	/**
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur
	 *            the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur
	 *            the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
}
