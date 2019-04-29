package fr.diginamic.tp8.sets.essais;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Test de l'exercice 1
 * 
 * @author Jean-Baptiste
 *
 */
public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> setDeDoubles = new HashSet<>();
		setDeDoubles.addAll(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01, 13.3));

		System.out.println(setDeDoubles);
		// alternative
		setDeDoubles.forEach(System.out::println);

		double maxValue = Double.MIN_VALUE;
		for (Double value : setDeDoubles) {
			if (value > maxValue) {
				maxValue = value;
			}
		}
		System.out.println("Elément le plus grand de la collection : " + maxValue);
	}

}
