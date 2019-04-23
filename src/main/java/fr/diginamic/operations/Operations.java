package fr.diginamic.operations;

/**
 * @author Jean-Baptiste
 *
 */
public class Operations {

	public static double calcul(double a, double b, char operator) {
		if (operator == '-') {
			return a - b;
		} else if (operator == '+') {
			return a + b;
		} else if (operator == '*') {
			return a * b;
		} else if (operator == '/') {
			return a / b;
		} else {
			return 0.0;
		}
	}
}
