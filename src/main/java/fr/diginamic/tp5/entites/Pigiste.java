package fr.diginamic.tp5.entites;

/**
 * Pigiste du journal
 * 
 * @author Jean-Baptiste
 *
 */
public class Pigiste extends Intervenant {
	private int nombreJoursTravailles;
	private double montantJournalier;

	/**
	 * Constructor
	 * 
	 * @param nombreJoursTravailles
	 * @param montantJournalier
	 * @param nom
	 * @param prenom
	 */
	public Pigiste(int nombreJoursTravailles, double montantJournalier, String nom, String prenom) {
		super(nom, prenom);
		this.nombreJoursTravailles = nombreJoursTravailles;
		this.montantJournalier = montantJournalier;
	}

	@Override
	public double getSalaire() {
		return nombreJoursTravailles * montantJournalier;
	}

	@Override
	public void afficherDonnees() {
		super.afficherDonnees();
		System.out.println("salaire = " + this.getSalaire() + " Statut : pigiste");
	}

	/**
	 * @return the nombreJoursTravailles
	 */
	public int getNombreJoursTravailles() {
		return nombreJoursTravailles;
	}

	/**
	 * @param nombreJoursTravailles
	 *            the nombreJoursTravailles to set
	 */
	public void setNombreJoursTravailles(int nombreJoursTravailles) {
		this.nombreJoursTravailles = nombreJoursTravailles;
	}

	/**
	 * @return the montantJournalier
	 */
	public double getMontantJournalier() {
		return montantJournalier;
	}

	/**
	 * @param montantJournalier
	 *            the montantJournalier to set
	 */
	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}

}
