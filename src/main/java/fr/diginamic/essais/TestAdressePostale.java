package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;;

/**
 * @author Jean-Baptiste
 *
 */
public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale(14, "rue des Acacias", 89350, "Trojhan");

		AdressePostale adresse2 = new AdressePostale(2, "avenue des Lotus", 15230, "Ghorin");

		System.out.println(adresse1);
		System.out.println(adresse2);
	}

}
