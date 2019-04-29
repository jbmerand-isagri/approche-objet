package fr.diginamic.tp8.sets.essais;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Tests de l'exercice 2
 * 
 * @author Jean-Baptiste
 *
 */
public class TestSetString {

	public static void main(String[] args) {
		Set<String> setPays = new HashSet<>();
		setPays.addAll(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
		Iterator<String> iteratorPays = setPays.iterator();
		int tailleMotPaysPlusLong = Integer.MIN_VALUE;
		String paysMotPlusLong = "";
		while (iteratorPays.hasNext()) {
			String pays = iteratorPays.next();
			if (pays.length() > tailleMotPaysPlusLong) {
				tailleMotPaysPlusLong = pays.length();
				paysMotPlusLong = pays;
			}
		}
		System.out.println("Pays dont le nom est le plus long : " + paysMotPlusLong);
		System.out.println(setPays);

	}

}
