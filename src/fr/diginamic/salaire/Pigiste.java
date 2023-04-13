package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	int monthDaysWorking;
	double dayCost;
	
	
	public Pigiste(double dayCost) {
		this.dayCost = dayCost;
	}
	
	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return dayCost;
	}

	
}
