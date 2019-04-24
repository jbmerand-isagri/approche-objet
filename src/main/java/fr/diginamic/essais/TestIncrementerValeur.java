package fr.diginamic.essais;

import fr.diginamic.utils.IncrementerValeur;

/**
 * @author Jean-Baptiste
 *
 */
public class TestIncrementerValeur {

	public static void main(String[] args) {
		int param = 0;
		IncrementerValeur valeur = new IncrementerValeur();
		valeur.inc(param);

		System.out.println("Valeur de param = " + param);
	}

}
