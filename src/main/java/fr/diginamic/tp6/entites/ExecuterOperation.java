package fr.diginamic.tp6.entites;

/**
 * Exécute opérations des classes implémentées.
 * 
 * @author Jean-Baptiste
 *
 */
public class ExecuterOperation {

	/**
	 * Applique méthode calcul des IOperation
	 * 
	 * @param ioperation
	 * @param a
	 * @param b
	 * @return
	 */
	public int execute(IOperation ioperation, int a, int b) {
		return ioperation.calcul(a, b);
	}

}
