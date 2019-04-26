package fr.diginamic.tp6.essais;

import fr.diginamic.tp5.entites.Chambre;
import fr.diginamic.tp5.entites.Cuisine;
import fr.diginamic.tp5.entites.Maison;
import fr.diginamic.tp5.entites.Rectangle;
import fr.diginamic.tp5.entites.SalleDeBain;
import fr.diginamic.tp5.entites.Salon;
import fr.diginamic.tp5.entites.WC;
import fr.diginamic.tp6.entites.AffichageSurface;

/**
 * @author Jean-Baptiste
 *
 */
public class TestAffichageSurface {

	public static void main(String[] args) {
		AffichageSurface affichageSurface = new AffichageSurface();

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
		// TEST MAISON
		affichageSurface.afficher(maison);

		// TEST AVEC FORME
		Rectangle rectangle = new Rectangle(3, 2);
		affichageSurface.afficher(rectangle);
	}

}
