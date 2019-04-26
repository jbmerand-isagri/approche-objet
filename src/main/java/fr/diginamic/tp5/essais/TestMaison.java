package fr.diginamic.tp5.essais;

import fr.diginamic.tp5.entites.Chambre;
import fr.diginamic.tp5.entites.Cuisine;
import fr.diginamic.tp5.entites.Maison;
import fr.diginamic.tp5.entites.SalleDeBain;
import fr.diginamic.tp5.entites.Salon;
import fr.diginamic.tp5.entites.WC;

/**
 * Classe pour tester les classes liées à la maison.
 * 
 * @author Jean-Baptiste
 *
 */
public class TestMaison {

	public static void main(String[] args) {
		// ajout des pièces dans la maison (0 pour RDC)
		Chambre chambre1 = new Chambre(1, 10);
		Chambre chambre2 = new Chambre(0, 15);
		Chambre chambre3 = new Chambre(1, 11);
		Salon salon1 = new Salon(0, 30);
		Cuisine cuisine1 = new Cuisine(0, 13);
		SalleDeBain salleDeBain1 = new SalleDeBain(1, 7);
		SalleDeBain salleDeBain2 = new SalleDeBain(0, 23);
		WC wc1 = new WC(1, 5);
		// création de la maison
		Maison maison = new Maison();
		maison.ajouterPiece(wc1).ajouterPiece(salleDeBain2).ajouterPiece(salleDeBain1).ajouterPiece(cuisine1)
				.ajouterPiece(salon1).ajouterPiece(chambre3).ajouterPiece(chambre2).ajouterPiece(chambre1);
		// test des méthodes de la maison
		System.out.println("Superficie totale de la maison = " + maison.calculerSurface());
		System.out.println("Superficie du RDC = " + maison.getSuperficieParEtage(0));
		System.out.println("Superficie 1er étage = " + maison.getSuperficieParEtage(1));
		System.out.println("Superficie totale des chambres = " + maison.getSuperficieParTypePiece("chambre"));
		System.out.println("Superficie totale des salles de bain = " + maison.getSuperficieParTypePiece("salledebain"));
		System.out.println("Superficie totale des cuisines = " + maison.getSuperficieParTypePiece("cuisine"));
		System.out.println("Nombre de chambres = " + maison.getNbPiecesParTypePiece("chambre"));
		System.out.println("Nombre de salles de bain = " + maison.getNbPiecesParTypePiece("salledebain"));
		System.out.println("Nombre de salons = " + maison.getNbPiecesParTypePiece("salon"));
	}

}
