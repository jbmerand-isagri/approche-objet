package fr.diginamic.tp7.listes.essais;

import java.util.ArrayList;
import java.util.Arrays;

import fr.diginamic.tp7.listes.entites.Ville;

/**
 * Essais de l'exercice 3
 * 
 * @author Jean-Baptiste
 *
 */
public class TestVilles {

	public static void main(String[] args) {

		Ville ville1 = new Ville("Nice", 343_000);
		Ville ville2 = new Ville("Carcassonne", 47_800);
		Ville ville3 = new Ville("Narbonne", 53_400);
		Ville ville4 = new Ville("Lyon", 484_000);
		Ville ville5 = new Ville("Foix", 9_700);
		Ville ville6 = new Ville("Pau", 77200);
		Ville ville7 = new Ville("Marseille", 850_700);
		Ville ville8 = new Ville("Tarbes", 40_600);

		ArrayList<Ville> listeDeVilles = new ArrayList<>();
		listeDeVilles.addAll(Arrays.asList(ville1, ville2, ville3, ville4, ville5, ville6, ville7, ville8));

		String villeLaPlusPeuplee = "";
		int nbHabitantsMax = Integer.MIN_VALUE;
		for (int i = 0; i < listeDeVilles.size(); i++) {
			if (listeDeVilles.get(i).getNbHabitants() > nbHabitantsMax) {
				villeLaPlusPeuplee = listeDeVilles.get(i).getNom();
				nbHabitantsMax = listeDeVilles.get(i).getNbHabitants();
			}
		}
		System.out.println("Ville la plus peuplée = " + villeLaPlusPeuplee);

		// suppression ville la moins peuplée
		int nbHabitantsMin = Integer.MAX_VALUE;
		int indexDeLaMoinsPeuplee = 0;
		for (int i = 0; i < listeDeVilles.size(); i++) {
			if (listeDeVilles.get(i).getNbHabitants() < nbHabitantsMin) {
				nbHabitantsMin = listeDeVilles.get(i).getNbHabitants();
				indexDeLaMoinsPeuplee = i;
			}
		}
		listeDeVilles.remove(indexDeLaMoinsPeuplee);

		// modification des villes de plus de 10k habitants
		for (int i = 0; i < listeDeVilles.size(); i++) {
			if (listeDeVilles.get(i).getNbHabitants() > 100_000) {
				listeDeVilles.get(i).setNom(listeDeVilles.get(i).getNom().toUpperCase());
			}
		}

		System.out.println(listeDeVilles);

	}

}
