package fr.diginamic.banque.entites;

public abstract class Operation {
	public String date;
	public float amount;
	
	public Operation(String date, float amount) {
		this.date = date;
		this.amount = amount;
	}
	
	
}
