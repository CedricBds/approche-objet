package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations extends Operations {

	public static void main(String[] args) {
		
	 String[] operators = {"+", "-", "/", "*"};
	 for (String operator : operators) {
		System.out.println(Operations.calcul(Math.random(), Math.random(), operator));
	 }
	 
	}

}
