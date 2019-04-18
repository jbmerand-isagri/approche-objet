package fr.diginamic.essais;

import fr.diginamic.entites.Personne;
import fr.diginamic.entites.AdressePostale;

/**
 * @author Jean-Baptiste
 *
 */
public class TestPersonne {

	public static void main(String[] args) {
		
		Personne personne1 = new Personne();
		personne1.nom = "Dupuis";
		personne1.prenom = "Harry";
		
		personne1.adresse = new AdressePostale();
		personne1.adresse.numeroDeRue = 5;
		personne1.adresse.libelleRue = "rue des Roses";
		personne1.adresse.codePostal = 58970;
		personne1.adresse.ville = "Liutgre";
		
		Personne personne2 = new Personne();
		personne2.nom = "Juyte";
		personne2.prenom = "Luis";
		
		personne2.adresse = new AdressePostale();
		personne2.adresse.numeroDeRue = 15;
		personne2.adresse.libelleRue = "Avenue Monarque";
		personne2.adresse.codePostal = 59740;
		personne2.adresse.ville = "Troie";

		System.out.println(personne1);
		System.out.println(personne2);
	}

}
