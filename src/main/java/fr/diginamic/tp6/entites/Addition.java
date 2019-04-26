package fr.diginamic.tp6.entites;

/**
 * Implémente l'interface pour faire une addition.
 * 
 * @author Jean-Baptiste
 *
 */
public class Addition implements IOperation {

	@Override
	public int calcul(int a, int b) {
		return a + b;
	}

}
