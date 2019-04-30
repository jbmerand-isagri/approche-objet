package fr.diginamic.tp10.tri.entites;

import java.util.Comparator;

/**
 * Compare le PIB/hab de deux Pays
 * 
 * @author Jean-Baptiste
 *
 */
public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		if (o1.getPibParHab() > o2.getPibParHab())
			return 1;
		if (o1.getPibParHab() < o2.getPibParHab())
			return -1;
		return 0;
	}

}
