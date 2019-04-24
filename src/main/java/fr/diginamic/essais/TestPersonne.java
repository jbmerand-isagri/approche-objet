package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Personne;

/**
 * @author Jean-Baptiste
 *
 */
public class TestPersonne {

	public static void main(String[] args) {

		Personne personne1 = new Personne();
		personne1.setNom("Dupuis");
		personne1.setPrenom("Harry");

		personne1.setAdresse(new AdressePostale(5, "rue des Roses", 58970, "Liutgre"));
		// personne1.adresse.numeroDeRue = 5;
		// personne1.adresse.libelleRue = "rue des Roses";
		// personne1.adresse.codePostal = 58970;
		// personne1.adresse.ville = "Liutgre";

		Personne personne2 = new Personne();
		personne2.setNom("Juyte");
		personne2.setPrenom("Luis");

		personne2.setAdresse(new AdressePostale(15, "Avenue Monarque", 59740, "Troie"));
		// personne2.adresse.numeroDeRue = 15;
		// personne2.adresse.libelleRue = "Avenue Monarque";
		// personne2.adresse.codePostal = 59740;
		// personne2.adresse.ville = "Troie";

		System.out.println(personne1.toString());
		System.out.println(personne2.toString());
	}

}
