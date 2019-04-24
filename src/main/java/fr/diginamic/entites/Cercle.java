package fr.diginamic.entites;

/**
 * @author Jean-Baptiste
 *
 */
public class Cercle {
	private double rayon;

	/**
	 * Constructeur
	 * 
	 * @param rayon
	 *            (double)
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double retournePerimetre() {
		return 2 * Math.PI * this.rayon;
	}

	public double retourneSurface() {
		return this.rayon * this.rayon * Math.PI;
	}

	public double getRayon() {
		return this.rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
