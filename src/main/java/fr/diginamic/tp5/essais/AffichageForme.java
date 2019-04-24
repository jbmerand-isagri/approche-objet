package fr.diginamic.tp5.essais;

import fr.diginamic.tp5.entites.Forme;

/**
 * Classe contenant méthodes pour afficher informations sur les formes
 * 
 * @author Jean-Baptiste
 *
 */
public class AffichageForme {

	/**
	 * Affiche le périmètre et l'aire de la forme.
	 * 
	 * @param forme
	 */
	public static void afficher(Forme forme) {
		System.out.println("Périmètre : " + forme.calculerPerimetre());
		System.out.println("Surface : " + forme.calculerSurface());
	}

}
