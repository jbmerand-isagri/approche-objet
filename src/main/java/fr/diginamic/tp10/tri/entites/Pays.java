package fr.diginamic.tp10.tri.entites;

/**
 * Exercice 1
 * 
 * @author Jean-Baptiste
 *
 */
public class Pays implements Comparable<Pays> {
	private String nom;
	private int nbHabitants;
	private double pibParHab;

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param nbHabitants
	 * @param pibParHab
	 */
	public Pays(String nom, int nbHabitants, double pibParHab) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHab = pibParHab;
	}

	// EXERCICE 1
	// @Override
	// public int compareTo(Pays pays) {
	// return this.getNom().compareTo(pays.getNom());
	// }

	@Override
	public int compareTo(Pays pays) {
		if (this.getPibParHab() > pays.getPibParHab())
			return 1;
		if (this.getPibParHab() < pays.getPibParHab())
			return -1;
		return 0;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitants=" + nbHabitants + ", pibParHab=" + pibParHab + "]";
	}

}
