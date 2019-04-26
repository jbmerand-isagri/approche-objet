package fr.diginamic.tp6.entites;

/**
 * Implémente l'interface pour faire une multiplication.
 * 
 * @author Jean-Baptiste
 *
 */
public class Multiplication implements IOperation {

	@Override
	public int calcul(int a, int b) {
		return a * b;
	}

}
