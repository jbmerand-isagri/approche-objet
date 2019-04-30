package fr.diginamic.tp10.tri.entites;

import java.util.Comparator;

/**
 * Compare le nombre total d'habitants de deux Pays
 * 
 * @author Jean-Baptiste
 *
 */
public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		if (o1.getNbHabitants() > o2.getNbHabitants())
			return 1;
		if (o1.getNbHabitants() < o2.getNbHabitants())
			return -1;
		return 0;
	}

}
