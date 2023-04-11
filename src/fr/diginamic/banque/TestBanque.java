package fr.diginamic.banque;
import fr.diginamic.banque.entites.*;
public class TestBanque {
	public static void main(String[] args) {
		Compte account = new Compte(5458, (float) 128.5);
		System.out.println("Compte numéro: "+account.accountNumber + "| Solde: " + account.sold);
	}
}
