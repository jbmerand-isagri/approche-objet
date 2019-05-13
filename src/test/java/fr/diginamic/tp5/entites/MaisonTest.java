/**
 * 
 */
package fr.diginamic.tp5.entites;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Classe de test de Maison
 */
public class MaisonTest {

	Chambre chambre1 = new Chambre(1, 10);
	Chambre chambre2 = new Chambre(0, 15);
	Chambre chambre3 = new Chambre(1, 11);
	Salon salon1 = new Salon(0, 30);
	Cuisine cuisine1 = new Cuisine(0, 13);
	SalleDeBain salleDeBain1 = new SalleDeBain(1, 7);
	SalleDeBain salleDeBain2 = new SalleDeBain(0, 23);
	WC wc1 = new WC(1, 5);
	// création de la maison
	// Maison maison = new Maison();
	// maison.ajouterPiece(wc1).ajouterPiece(salleDeBain2).ajouterPiece(salleDeBain1).ajouterPiece(cuisine1)
	// .ajouterPiece(salon1).ajouterPiece(chambre3).ajouterPiece(chambre2).ajouterPiece(chambre1);

	@Test
	public void testAjouterPieceWithNull() {
		Maison maison = new Maison();
		Maison obtenu = maison.ajouterPiece(null);
		assertEquals(maison, obtenu);
	}

	@Test
	public void testCalulerSurfaceWith2DifferentTypeRooms() {
		Maison maison = new Maison();
		maison.ajouterPiece(chambre1);
		maison.ajouterPiece(cuisine1);
		assertEquals(23, maison.calculerSurface(), 0);
	}

	@Test
	public void testCalulerSurfaceWithSameTypeRooms() {
		Maison maison = new Maison();
		maison.ajouterPiece(salleDeBain1);
		maison.ajouterPiece(salleDeBain2);
		assertEquals(30, maison.calculerSurface(), 0);
	}

	@Test
	public void testGetSuperficieParEtageWithRDC() {
		Maison maison = new Maison();
		maison.ajouterPiece(wc1).ajouterPiece(salleDeBain2).ajouterPiece(salleDeBain1).ajouterPiece(cuisine1);
		assertEquals(36, maison.getSuperficieParEtage(0), 0);
	}

	@Test
	public void testGetSuperficieParEtageWithVoidMaison() {
		Maison maison = new Maison();
		assertEquals(0, maison.getSuperficieParEtage(0), 0);
	}

	@Test
	public void testGetSuperficieParTypePieceWith2Pieces() {
		Maison maison = new Maison();
		maison.ajouterPiece(salleDeBain1).ajouterPiece(salleDeBain2).ajouterPiece(chambre1).ajouterPiece(cuisine1)
				.ajouterPiece(chambre3);
		assertEquals(30, maison.getSuperficieParTypePiece("salleDeBain"), 0);
	}

	@Test
	public void testGetSuperficieParTypePieceWith0Piece() {
		Maison maison = new Maison();
		assertEquals(0, maison.getSuperficieParTypePiece("salleDeBain"), 0);
	}

	@Test
	public void testGetNbPiecesParTypePieceWith2Pieces() {
		Maison maison = new Maison();
		maison.ajouterPiece(salleDeBain1).ajouterPiece(salleDeBain2).ajouterPiece(chambre1).ajouterPiece(cuisine1)
				.ajouterPiece(chambre3);
		assertEquals(2, maison.getNbPiecesParTypePiece("salleDeBain"), 0);
	}

	@Test
	public void testGetNbPiecesParTypePieceWith0Piece() {
		Maison maison = new Maison();
		assertEquals(0, maison.getNbPiecesParTypePiece("salleDeBain"), 0);
	}

	@Test
	public void testGetNbPiecesParTypePieceWithWrongParam() {
		Maison maison = new Maison();
		maison.ajouterPiece(salleDeBain1).ajouterPiece(salleDeBain2).ajouterPiece(chambre1).ajouterPiece(cuisine1)
				.ajouterPiece(chambre3);
		assertEquals(0, maison.getNbPiecesParTypePiece("sallOJDFKJFHK"), 0);
	}
}
