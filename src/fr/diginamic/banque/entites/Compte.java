package fr.diginamic.banque.entites;

public class Compte {
public int accountNumber;
public float sold;

public Compte(int accountNumber, float sold) {
	this.accountNumber = accountNumber;
	this.sold = sold;
}

public String toString() {
	return "Compte numéro: "+ accountNumber + " | Solde: " + sold;
}


}
