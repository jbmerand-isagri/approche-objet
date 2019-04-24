package fr.diginamic.tp5.essais;

import fr.diginamic.tp5.entites.Pigiste;
import fr.diginamic.tp5.entites.Salarie;

/**
 * Tests pour vérifier les classes 'Intervenant'
 * 
 * @author Jean-Baptiste
 *
 */
public class TestIntervenant {

	public static void main(String[] args) {
		// test Salarie étape 1
		Salarie salarie = new Salarie(1500, "Stark", "Edouard");
		System.out.println("Salaire mensuel du salarié = " + salarie.getSalaire());
		// test Pigiste étape 2
		Pigiste pigiste = new Pigiste(20, 100, "Doe", "Jane");
		System.out.println("Salaire mensuel du pigiste = " + pigiste.getSalaire());

		// test Salarie étape 2

	}

}
