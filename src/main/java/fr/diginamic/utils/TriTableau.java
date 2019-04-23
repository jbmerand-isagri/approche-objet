package fr.diginamic.utils;

/**
 * @author Jean-Baptiste
 *
 */
public class TriTableau {

	/**
	 * Effectue un tri à bulles sur le tableau et le retourne.
	 * 
	 * @param tableau
	 *            (double)
	 * @return tableau trié (double)
	 */
	public static double[] trier(double[] tableau) {
		double minValue = Double.MAX_VALUE;
		int indexOfMinValue = 0;

		for (int j = 0; j < tableau.length; j++) {
			for (int i = j; i < tableau.length; i++) {
				if (tableau[i] < minValue) {
					minValue = tableau[i];
					indexOfMinValue = i;
				}
			}
			// échange des valeurs
			tableau[indexOfMinValue] = tableau[j];
			tableau[j] = minValue;
			minValue = Integer.MAX_VALUE;
		}

		return tableau;
	}
}
