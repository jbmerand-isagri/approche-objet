package fr.diginamic.tp7.listes.entites;

import java.util.ArrayList;

/**
 * Classe principale de l'exercice, Maison, avec ArrayList
 * 
 * @author Jean-Baptiste
 *
 */
public class Maison implements ISurface {
	// private Piece[] pieces = new Piece[0];

	private ArrayList<Piece> pieces = new ArrayList<>();

	/**
	 * Ajoute une pièce à la maison (liste)
	 * 
	 * @param piece
	 * @return
	 */
	public Maison ajouterPiece(Piece piece) {
		pieces.add(piece);
		System.out.println("pièce ajoutée");
		return this;
	}

	/**
	 * Calcule la superficie totale de la maison.
	 * 
	 * @return double superficie
	 */
	@Override
	public double calculerSurface() {
		double superficieTotale = 0;
		for (Piece piece : pieces) {
			superficieTotale += piece.getSuperficie();
		}
		return superficieTotale;
	}

	/**
	 * Calcule la superficie de l'étage renseigné.
	 * 
	 * @param etage
	 * @return double superficie
	 */
	public double getSuperficieParEtage(int etage) {
		double superficieEtage = 0;
		for (Piece piece : pieces) {
			if (piece.getEtage() == etage) {
				superficieEtage += piece.getSuperficie();
			}
		}
		return superficieEtage;
	}

	/**
	 * Calcule la superficie occupée par l'ensemble des pièces du type renseigné.
	 * 
	 * @param type
	 * @return
	 */
	public double getSuperficieParTypePiece(String type) {
		double superficieTypePieces = 0;
		for (Piece piece : pieces) {
			if (piece.getType().equalsIgnoreCase(type)) {
				superficieTypePieces += piece.getSuperficie();
			}
		}
		return superficieTypePieces;
	}

	/**
	 * Calcule le nombre de pièces du type renseigné.
	 * 
	 * @param type
	 *            (pas d'espaces entre les mots)
	 * @return
	 */
	public int getNbPiecesParTypePiece(String type) {
		int nbPiecesParType = 0;
		for (Piece piece : pieces) {
			if (piece.getType().equalsIgnoreCase(type)) {
				nbPiecesParType++;
			}
		}
		return nbPiecesParType;
	}
}
