package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
	
	public static void main(String args[]) {
		
		Compte account = new Compte(5555, (float)150.0);
		
		Operation[] operationArray = new Operation[4];
		
		operationArray[0] = new Debit("11/04", (float) 10.0);
		operationArray[1] = new Credit("12/04", (float) 50.0);
		operationArray[2] = new Debit("13/04", (float) 20.0);
		operationArray[3] = new Credit("20/04", (float) 70.0);


		for(Operation operation : operationArray) {
			
			switch (operation.getClass().getSimpleName()) {
			case "Debit":
				account.sold -= operation.amount;
				break;
			case "Credit":
				account.sold += operation.amount;
				break;
			}
			
			
			System.out.println(operation.getClass().getSimpleName() + "= Date d'opération: " + operation.date + " Montant d'opération: " + operation.amount + " Solde: " + account.sold);

		}
	}

}
