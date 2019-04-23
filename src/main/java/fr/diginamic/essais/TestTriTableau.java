package fr.diginamic.essais;

import fr.diginamic.utils.TriTableau;

public class TestTriTableau {

	public static void main(String[] args) {
		double[] tableau1 = { 1, 29, -2, 47, 2.3, 199.002, 14, 59, 0.2 };
		double[] tableau2 = { 59, 23.02, -8, -3.2 };

		TriTableau.trier(tableau1);
		TriTableau.trier(tableau2);

		System.out.println("**** AFFICHAGE tableau1 ****");
		for (double d : tableau1) {
			System.out.println(d);
		}

		System.out.println("**** AFFICHAGE tableau2 ****");
		for (double d : tableau2) {
			System.out.println(d);
		}
	}

}
