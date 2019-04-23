package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

/**
 * @author Jean-Baptiste
 *
 */
public class CercleFactory {

	/**
	 * Retourne objet Cercle
	 * 
	 * @param rayon
	 * @return
	 */
	public static Cercle creerCercle(double rayon) {
		return new Cercle(rayon);
	}

}
