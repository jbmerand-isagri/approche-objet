package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;;

/**
 * @author Jean-Baptiste
 *
 */
public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adresse = new AdressePostale();
		adresse.numeroDeRue = 14;
		adresse.libelleRue = "rue des Acacias";
		adresse.codePostal = 89350;
		adresse.ville = "Trojhan";
				
		AdressePostale adresse2 = new AdressePostale();
		adresse2.numeroDeRue = 2;
		adresse2.libelleRue = "avenue des Lotus";
		adresse2.codePostal = 15230;
		adresse2.ville = "Ghorin";
	
		System.out.println(adresse);
		System.out.println(adresse2);
	}

}
