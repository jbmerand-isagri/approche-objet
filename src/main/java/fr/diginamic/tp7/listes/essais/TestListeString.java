package fr.diginamic.tp7.listes.essais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Tests sur les listes de String
 * 
 * @author Jean-Baptiste
 *
 */
public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<>();
		stringList
				.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

		int numberOfLetter = Integer.MIN_VALUE;
		String cityWithLongerName = "";
		for (int i = 0; i < stringList.size(); i++) {
			if (stringList.get(i).length() > numberOfLetter) {
				numberOfLetter = stringList.get(i).length();
				cityWithLongerName = stringList.get(i);
			}
			stringList.set(i, stringList.get(i).toUpperCase());
		}

		Iterator<String> iterator = stringList.iterator();
		while (iterator.hasNext()) {
			String city = iterator.next();
			if (city.charAt(0) == 'N') {
				iterator.remove();
			}

		}

		System.out.println("La ville qui a le nom le plus grand est : " + cityWithLongerName);
		System.out.println("Liste après les différentes manipulations : " + stringList);
	}

}
