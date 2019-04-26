package tp7.listes;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Tests sur les listes de String
 * 
 * @author Jean-Baptiste
 *
 */
public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList();
		stringList
				.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

		int numberOfLetter = Integer.MIN_VALUE;
		int indexOfLongerWord = 0;
		for (int i = 0; i < stringList.size(); i++) {
			if (stringList.get(i).length() > numberOfLetter) {
				numberOfLetter = stringList.get(i).length();
				indexOfLongerWord = i;
			}
			stringList.set(i, stringList.get(i).toUpperCase());
		}
		System.out.println("La ville qui a le nom le plus grand est : " + stringList.get(indexOfLongerWord));
		System.out.println(stringList);
		// TODO : EXO2 supprimez de la liste les villes dont le nom commence par la
		// lettre N.
	}

}
