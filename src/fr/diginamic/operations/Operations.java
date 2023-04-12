package fr.diginamic.operations;

public class Operations {
 public static double calcul(double a, double b, String operator) {
	 switch (operator) {
	 case "+":
		 return a + b;
	 case "-":
		 return a - b;
	 case "/":
		 return a / b;
	 case "*":
		 return a * b;
		 default:
			 System.out.println("0: Cet opérateur n'est pas implémenté");
			 return 0.00;
	 }
 }
}
