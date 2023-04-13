package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	double salaire;

	
	public Salarie(double salaire) {
		this.salaire = salaire;
	}
	
	
	@Override
	public double getSalaire() {
		return this.salaire;
	}

}
