package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

/**
 * @author Jean-Baptiste
 *
 */
public class CercleService {
	/**
	 * Doubler la longueur du rayon de l'objet cercle en param
	 * 
	 * @param cercle
	 */
	public static void doubler(Cercle cercle) {
		System.out.println("Méthode pour doubler le rayon lancée.");
		cercle.setRayon(2 * cercle.getRayon());
	}
}
