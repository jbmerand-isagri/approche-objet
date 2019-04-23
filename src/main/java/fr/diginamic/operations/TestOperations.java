package fr.diginamic.operations;

/**
 * Tests with a = 10 and b = 5
 * 
 * @author Jean-Baptiste
 *
 */
public class TestOperations {

	public static void main(String[] args) {
		System.out.println("Addition : " + Operations.calcul(10, 5, '+'));
		System.out.println("Soustraction : " + Operations.calcul(10, 5, '-'));
		System.out.println("Multiplication : " + Operations.calcul(10, 5, '*'));
		System.out.println("Division : " + Operations.calcul(10, 5, '/'));

	}
}
