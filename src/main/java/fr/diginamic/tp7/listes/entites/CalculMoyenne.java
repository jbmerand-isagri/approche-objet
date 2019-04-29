package fr.diginamic.tp7.listes.entites;

import java.util.ArrayList;

/**
 * Classe en version ArrayList
 * 
 * @author Jean-Baptiste
 *
 */
public class CalculMoyenne {
	private ArrayList<Double> valeurs;

	public CalculMoyenne() {
		this.valeurs = new ArrayList<>();
	}

	/**
	 * Ajoute valeur renseignée à la liste
	 * 
	 * @param valeur
	 */
	public void ajout(double valeur) {
		valeurs.add(valeur);
		System.out.println(valeur + " a été ajouté");
	}

	/**
	 * Calcule la moyenne des valeurs de la liste
	 * 
	 * @return
	 */
	public double calcul() {
		System.out.println("Execution du calcul de la moyenne.");
		double somme = 0d;
		for (int i = 0; i < valeurs.size(); i++) {
			somme += valeurs.get(i);
		}
		return somme / valeurs.size();
	}
}
