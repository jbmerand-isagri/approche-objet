package fr.diginamic.tp5.entites;

/**
 * Salarié du journal
 * 
 * @author Jean-Baptiste
 *
 */
public class Salarie extends Intervenant {
	private double montantSalaireMensuel;

	/**
	 * Constructor
	 * 
	 * @param montantSalaireMensuel
	 * @param nom
	 * @param prenom
	 */
	public Salarie(double montantSalaireMensuel, String nom, String prenom) {
		super(nom, prenom);
		this.montantSalaireMensuel = montantSalaireMensuel;
	}

	@Override
	public double getSalaire() {
		return montantSalaireMensuel;
	}

	@Override
	public void afficherDonnees() {
		super.afficherDonnees();
		System.out.println(", salaire = " + this.getSalaire() + " Statut : salarié");
	}

	/**
	 * @return the montantSalaireMensuel
	 */
	public double getMontantSalaireMensuel() {
		return montantSalaireMensuel;
	}

	/**
	 * @param montantSalaireMensuel
	 *            the montantSalaireMensuel to set
	 */
	public void setMontantSalaireMensuel(double montantSalaireMensuel) {
		this.montantSalaireMensuel = montantSalaireMensuel;
	}

}
