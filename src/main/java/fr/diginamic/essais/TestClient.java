package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Client;;

/**
 * @author Jean-Baptiste
 *
 */
public class TestClient {

	public static void main(String[] args) {
		AdressePostale adresseC1 = new AdressePostale(35, "rue Charles De Gaulle", 44890, "Saint-Guillaume");
		AdressePostale adresseC2 = new AdressePostale(15, "rue Bonnamy", 99500, "Saint-Kévin");

		Client client1 = new Client(25, "Doe", "John", adresseC1);
		Client client2 = new Client(12, "Stark", "Arya", adresseC2);
	}
}
