package fr.diginamic.tp6.entites;

/**
 * @author Jean-Baptiste
 *
 */
public class AffichageSurface {

	/**
	 * Affiche surface dans console.
	 * 
	 */
	public void afficher(ISurface isurface) {
		System.out.println("Surface = " + isurface.calculerSurface());
	}
}
