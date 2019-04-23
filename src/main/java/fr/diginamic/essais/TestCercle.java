package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

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

	}

}
