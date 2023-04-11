package fr.diginamic.banque;
import fr.diginamic.banque.entites.*;

public class TestBanque {
	
	public static void main(String[] args) {
		
		Compte account = new Compte(5458, (float) 128.5);
		System.out.println(account.toString());
		
		Compte[] accountArray = new Compte [2];
		accountArray[0] = new Compte(5458, (float) 128.5);
		accountArray[1] = (Compte) new CompteTaux(5458, (float) 128.5, (float)5.5);
		
		for (Compte compte : accountArray) {
			System.out.println(compte);
		}
	}
}
