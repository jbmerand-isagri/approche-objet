package fr.diginamic.tp7.listes.essais;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Tests sur la liste d'Integer
 * 
 * @author Jean-Baptiste
 *
 */
public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		// list.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

		// AFFICHER LES ELEMENTS
		for (Integer integer : list) {
			System.out.println(integer);
		}
		// RECHERCHER PLUS GRAND ELEMENT
		Integer maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > maxValue) {
				maxValue = list.get(i);
			}
		}
		System.out.println("Plus grand élément de la liste = " + maxValue);
		// SUPPRIMER PLUS PETIT ELEMENT
		Integer minValue = Integer.MAX_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < minValue) {
				minValue = list.get(i);
			}
		}
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer integer = it.next();
			if (integer.equals(minValue)) {
				it.remove();
			}
		}
		// Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils
		// deviennent positifs.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 0) {
				list.set(i, list.get(i) * -1);
			}
		}
		// Affichez enfin la liste résultante
		System.out.println("Nouvelle liste :");
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
