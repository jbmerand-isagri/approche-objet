package fr.diginamic.tp10.tri.essais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import fr.diginamic.tp10.tri.entites.ComparatorHabitant;
import fr.diginamic.tp10.tri.entites.ComparatorPibHabitant;
import fr.diginamic.tp10.tri.entites.Pays;

/**
 * Classe de tests pour les exercices 1, 2 et 3
 * 
 * @author Jean-Baptiste
 *
 */
public class TestMapPays {

	public static void main(String[] args) {

		Pays usa = new Pays("USA", 327167434, 55805);
		Pays france = new Pays("France", 67795000, 38476);
		Pays allemagne = new Pays("Allemagne", 82979100, 47589);
		Pays uk = new Pays("UK", 65105246, 43770);
		Pays italie = new Pays("Italie", 60483973, 29866);
		Pays japon = new Pays("Japon", 126330302, 39058);
		Pays chine = new Pays("Chine", 1417913092, 7989);
		Pays russie = new Pays("Russie", 146780700, 11099);
		Pays inde = new Pays("Inde", 1296834042, 1626);

		List<Pays> listeDePays = new ArrayList<>();
		listeDePays.addAll(Arrays.asList(usa, france, allemagne, uk, italie, japon, chine, russie, inde));

		Collections.sort(listeDePays);

		// EXERCICE 1
		// System.out.println("Liste triée selon le nom : ");
		// for (Pays pays : listeDePays) {
		// System.out.println(pays.getNom());
		// }

		// EXERCICE 2
		System.out.println("Liste triée selon le PIB/hab : ");
		for (Pays pays : listeDePays) {
			System.out.println(pays.getNom() + " : " + pays.getPibParHab() + " PIB/hab.");
		}

		// EXERCICE 3
		List<Pays> listeDePays2 = new ArrayList<>();
		listeDePays2.addAll(Arrays.asList(usa, france, allemagne, uk, italie, japon, chine, russie, inde));

		listeDePays2.sort(new ComparatorHabitant());
		System.out.println("Liste triée selon le nombre d'habitants (avec comparator) : ");
		for (Pays pays : listeDePays2) {
			System.out.println(pays.getNom() + " : " + pays.getNbHabitants() + " hab.");
		}

		listeDePays2.sort(new ComparatorPibHabitant());
		System.out.println("Liste triée selon le PIB/hab (avec comparator) : ");
		for (Pays pays : listeDePays2) {
			System.out.println(pays.getNom() + " : " + pays.getPibParHab() + " PIB/hab");
		}

	}

}
