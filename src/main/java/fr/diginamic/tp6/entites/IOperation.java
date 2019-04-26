package fr.diginamic.tp6.entites;

/**
 * Impose une signature à toute classe souhaitant effectuer une opération sur 2
 * entiers
 * 
 * @author Jean-Baptiste
 *
 */
public interface IOperation {

	/**
	 * Effectue un calcul sur 2 entiers et retourne un résultat.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int calcul(int a, int b);
}
