package fr.diginamic.operations;

/**
 * @author Jean-Baptiste
 *
 */
public class CalculMoyenne {
	private double[] valeurs;
	private int index;

	/**
	 * Initialise la longueur du tableau de valeurs.
	 * 
	 * @param longueurDuTableau
	 *            (1 minimum)
	 */
	public CalculMoyenne(int longueurDuTableau) {
		System.out.println("Initialisation de la taille du tableau de valeurs...");
		if (longueurDuTableau < 1) {
			System.out.println("IMPOSSIBLE (valeur < 1)");
		} else {
			valeurs = new double[longueurDuTableau];
			System.out.println("OK");
		}
	}

	/**
	 * Ajoute une valeur au tableau.
	 * 
	 * @param valeur
	 *            (double)
	 */
	public void ajout(double valeur) {
		if (index < valeurs.length) {
			valeurs[index] = valeur;
			index++;
			System.out.println(valeur + " a été ajouté");
		} else {
			System.out.println(valeur + " N'A PAS été ajouté. Il n'y avait plus de place dans le tableau.");
		}
	}

	/**
	 * Calcule la moyenne des valeurs enregistrées.
	 * 
	 * @return (double) moyenne du tableau de valeurs
	 */
	public double calcul() {
		System.out.println("Execution du calcul de la moyenne.");
		double somme = 0;
		for (int i = 0; i < valeurs.length; i++) {
			somme += valeurs[i];
		}
		return somme / valeurs.length;
	}
}
