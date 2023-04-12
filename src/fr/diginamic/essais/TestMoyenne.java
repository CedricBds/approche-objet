package fr.diginamic.essais;

import java.util.ArrayList;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne  {

	
	

	public static void main(String[] args) {
	      double tab[] = {10.0, 20.0};
	    		  
		CalculMoyenne calculMoyenne = new CalculMoyenne(tab); 
	
	
		
		
		System.out.println(calculMoyenne.calcul());

	}
	

}
