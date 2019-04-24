package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleService;;

/**
 * @author Jean-Baptiste
 *
 */
public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(4);
		Cercle cercle2 = new Cercle(12);

		System.out.println("Infos sur le cercle 1 : périmètre = " + cercle1.retournePerimetre() + ", aire = "
				+ cercle1.retourneSurface());
		System.out.println("Infos sur le cercle 2 : périmètre = " + cercle2.retournePerimetre() + ", aire = "
				+ cercle2.retourneSurface());

		// TP 3.3 pour PassageParReference
		System.out.println("*** Tests sur le cercle 3 ***");
		Cercle cercle3 = new Cercle(10);
		System.out.println("Ancien rayon du cercle = " + cercle3.getRayon());
		CercleService.doubler(cercle3);
		System.out.println("Nouveau rayon du cercle = " + cercle3.getRayon());
	}

}
