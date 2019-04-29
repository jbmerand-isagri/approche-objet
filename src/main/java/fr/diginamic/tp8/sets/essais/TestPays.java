package fr.diginamic.tp8.sets.essais;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import fr.diginamic.tp8.sets.entites.Pays;

/**
 * @author Jean-Baptiste
 *
 */
public class TestPays {

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

		Set<Pays> setDePays = new HashSet<>();
		setDePays.addAll(Arrays.asList(usa, france, allemagne, uk, italie, japon, chine, russie, inde));

		double maxPibParHab = 0;
		double maxPibTotal = 0;
		String paysPibParHabMax = "";
		String paysPibTotalMax = "";

		for (Pays pays : setDePays) {
			if (pays.getPibParHab() > maxPibParHab) {
				paysPibParHabMax = pays.getNom();
				maxPibParHab = pays.getPibParHab();
			}
			if (pays.getPibParHab() * pays.getNbHabitants() > maxPibTotal) {
				maxPibTotal = pays.getPibParHab() * pays.getNbHabitants();
				paysPibTotalMax = pays.getNom();
			}
		}
		System.out.println("Pays avec PIB/hab le plus important : " + paysPibParHabMax);
		System.out.println("Pays avec PIB total le plus important : " + paysPibTotalMax);

		Iterator<Pays> iterDePays = setDePays.iterator();

		double pibTotalMin = Double.MAX_VALUE;
		Pays paysPibMin = new Pays("null", 0, 0);

		while (iterDePays.hasNext()) {
			Pays pays = iterDePays.next();
			if (pays.getNbHabitants() * pays.getPibParHab() < pibTotalMin) {
				pibTotalMin = pays.getNbHabitants() * pays.getPibParHab();
				paysPibMin = pays;
			}
		}
		// passage nom pays avec PIB total plus petit en majuscules
		paysPibMin.setNom(paysPibMin.getNom().toUpperCase());

		// suppression du pays dont PIB total le plus petit
		setDePays.remove(paysPibMin);

		// affichage complet des informations
		for (Pays pays : setDePays) {
			System.out.println(pays.getNom() + ": " + pays.getNbHabitants() + " habitants, " + pays.getPibParHab()
					+ " de PIB/hab, " + pays.getNbHabitants() * pays.getPibParHab() + " de PIB total.");
		}
	}

}
