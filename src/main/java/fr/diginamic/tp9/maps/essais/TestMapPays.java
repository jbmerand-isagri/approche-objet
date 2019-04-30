package fr.diginamic.tp9.maps.essais;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import fr.diginamic.tp9.maps.entites.Pays;

/**
 * Exercice 1
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

		Map<String, Pays> mapPays = new HashMap<>();
		mapPays.put("usa", usa);
		mapPays.put("france", france);
		mapPays.put("allemagne", allemagne);
		mapPays.put("uk", uk);
		mapPays.put("italie", italie);
		mapPays.put("japon", japon);
		mapPays.put("chine", chine);
		mapPays.put("russie", russie);
		mapPays.put("inde", inde);

		System.out.println("Les différentes clés de la map :");
		// mapPays.forEach((key, value) -> System.out.println(key));
		System.out.println(mapPays.keySet());

		System.out.println("Les différentes valeurs de la map :");
		System.out.println(mapPays.values());

		// suppression pays avec le moins d'habitants
		int minHab = Integer.MAX_VALUE;
		String paysMinHab = "";

		for (Iterator<String> iterator = mapPays.keySet().iterator(); iterator.hasNext();) {
			String clePays = iterator.next();
			int nbHabitants = mapPays.get(clePays).getNbHabitants();
			if (nbHabitants < minHab) {
				minHab = nbHabitants;
				paysMinHab = clePays;
			}
		}
		mapPays.remove(paysMinHab);

		System.out.println(mapPays.keySet());
	}

}
