package fr.diginamic.tp8.sets.entites;

/**
 * Exercice 3
 * 
 * @author Jean-Baptiste
 *
 */
public class Pays {
	private String nom;
	private int nbHabitants;
	private double pibParHab;

	public Pays(String nom, int nbHabitants, double pibParHab) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHab = pibParHab;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * @param nbHabitants
	 *            the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * @return the pibParHab
	 */
	public double getPibParHab() {
		return pibParHab;
	}

	/**
	 * @param pibParHab
	 *            the pibParHab to set
	 */
	public void setPibParHab(double pibParHab) {
		this.pibParHab = pibParHab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pays other = (Pays) obj;
		if (nbHabitants != other.nbHabitants)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (Double.doubleToLongBits(pibParHab) != Double.doubleToLongBits(other.pibParHab))
			return false;
		return true;
	}

}
