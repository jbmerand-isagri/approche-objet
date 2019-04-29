package fr.diginamic.tp7.listes.essais;

import fr.diginamic.tp7.listes.entites.CalculMoyenne;

/**
 * Tests de l'exercice de calcul de moyennes avec ArrayList cette fois-ci
 * 
 * @author Jean-Baptiste
 *
 */
public class TestMoyenne {
	public static void main(String[] args) {

		CalculMoyenne moyenne1 = new CalculMoyenne();
		CalculMoyenne moyenne2 = new CalculMoyenne();

		System.out.println("*** TESTS moyenne1 ***");
		moyenne1.ajout(4.2);
		moyenne1.ajout(5);
		moyenne1.ajout(2.9);
		moyenne1.ajout(9);
		System.out.println("moyenne1 = " + moyenne1.calcul());

		System.out.println("*** TESTS moyenne2 ***");
		moyenne2.ajout(-2.7);
		moyenne2.ajout(4);
		System.out.println("moyenne2 = " + moyenne2.calcul());

	}

}
