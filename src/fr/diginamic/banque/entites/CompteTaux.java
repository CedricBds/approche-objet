package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	float rate;

public CompteTaux(int accountNumber, float sold, float rate) {
		super(accountNumber, sold);
		this.rate = rate;
	}

public String toString() {
	return "Compte numéro: "+ accountNumber + " | Solde: " + sold +"| Taux: " + rate;
}


}
