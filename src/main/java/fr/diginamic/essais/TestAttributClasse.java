package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

/**
 * @author Jean-Baptiste
 *
 */
public class TestAttributClasse {

	public static void main(String[] args) {
		AdressePostale a = new AdressePostale(35, "rue des Aloiu", 44890, "Juyt");
		AdressePostale b = new AdressePostale(48, "rue des Apportuiyt", 44789, "Arkiuyt");
		a.nbDepartements = 103;
		System.out.println(a.nbDepartements);
		System.out.println(b.nbDepartements);
		System.out.println(AdressePostale.nbDepartements);
	}

}
