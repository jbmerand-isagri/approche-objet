package fr.diginamic.operations;

/**
 * @author Jean-Baptiste
 *
 */
public class TestMoyenne {
	public static void main(String[] args) {

		System.out.println("***** Instanciations, initialisation des tableaux de valeurs *****");
		CalculMoyenne moyenne0 = new CalculMoyenne(0);
		CalculMoyenne moyenne1 = new CalculMoyenne(3);
		CalculMoyenne moyenne2 = new CalculMoyenne(2);
		CalculMoyenne moyenne3 = new CalculMoyenne(-2);

		System.out.println("*** TESTS METHODES moyenne1 ***");
		moyenne1.ajout(4);
		moyenne1.ajout(5);
		moyenne1.ajout(2);
		moyenne1.ajout(9);
		System.out.println("moyenne1 = " + moyenne1.calcul());

		System.out.println("*** TESTS METHODES moyenne2 ***");
		moyenne2.ajout(-2);
		moyenne2.ajout(4);
		System.out.println("moyenne2 = " + moyenne2.calcul());

	}

}
