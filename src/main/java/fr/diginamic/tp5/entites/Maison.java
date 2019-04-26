package fr.diginamic.tp5.entites;

import fr.diginamic.tp6.entites.ISurface;

/**
 * Classe principale de l'exercice, Maison
 * 
 * @author Jean-Baptiste
 *
 */
public class Maison implements ISurface {
	private Piece[] pieces = new Piece[0];

	/**
	 * Ajout d'une pièce à la maison (méthode fluide)
	 * 
	 * @return true si pièce ajoutée
	 */
	public Maison ajouterPiece(Piece piece) {
		Piece[] piecesTemp = new Piece[pieces.length + 1];
		for (int i = 0; i < pieces.length; i++) {
			piecesTemp[i] = pieces[i];
		}
		piecesTemp[piecesTemp.length - 1] = piece;
		this.pieces = piecesTemp;
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
			// Autre possibilité, ne nécessitant pas les attributs
			// if (piece.getClass().getSimpleName().equals(type)) {
			// superficieTypePieces += piece.getSuperficie();
			// }
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
