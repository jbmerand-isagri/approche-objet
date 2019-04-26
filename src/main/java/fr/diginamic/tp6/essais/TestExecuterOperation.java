package fr.diginamic.tp6.essais;

import fr.diginamic.tp6.entites.Addition;
import fr.diginamic.tp6.entites.ExecuterOperation;
import fr.diginamic.tp6.entites.Multiplication;

/**
 * Test de ExecuterOperation
 * 
 * @author Jean-Baptiste
 *
 */
public class TestExecuterOperation {

	public static void main(String[] args) {
		ExecuterOperation executerOperation = new ExecuterOperation();
		Addition addition = new Addition();
		Multiplication multiplication = new Multiplication();
		System.out.println("2 + 4 = " + executerOperation.execute(addition, 2, 4));
		System.out.println("3 * 7 = " + executerOperation.execute(multiplication, 3, 7));

	}

}
