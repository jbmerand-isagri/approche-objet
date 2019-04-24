package fr.diginamic.tp5.essais;

import fr.diginamic.tp5.entites.Carre;
import fr.diginamic.tp5.entites.Cercle;
import fr.diginamic.tp5.entites.Rectangle;

/**
 * Tests avec différentes formes
 * 
 * @author Jean-Baptiste
 *
 */
public class TestForme {

	public static void main(String[] args) {
		// tests carré
		System.out.println("Tests avec un carré de côté 5 :");
		Carre carre = new Carre(5);
		AffichageForme.afficher(carre);
		// tests rectangle
		System.out.println("Tests avec un rectangle de longueur 3 cm et de largeur 2 cm :");
		Rectangle rectangle = new Rectangle(3, 2);
		AffichageForme.afficher(rectangle);
		// tests cercle
		System.out.println("Tests avec un cercle de rayon 9 :");
		Cercle cercle = new Cercle(9);
		AffichageForme.afficher(cercle);

	}

}
