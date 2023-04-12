package fr.diginamic.chaines;
import entites.Salarie;

import java.util.Arrays;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		char firstChar = chaine.charAt(0);
		
		//first letters
		System.out.println(firstChar);
		
		//char length
		System.out.println("Longueur de chaine " + chaine.length());
		
		//Use of indexof
		System.out.println(chaine.indexOf(";"));
		
		//extract lastname
		String lastname = chaine.substring(0, chaine.indexOf(";"));

		// Show uppercase
		System.out.println(lastname.toUpperCase());
		
		// show lowercase
		System.out.println(lastname.toLowerCase());
		
		//split
		System.out.println(Arrays.toString(chaine.split(";"))); 
		
		// Use the 3 parts of the string
		Salarie employee = new Salarie(chaine.split(";")[0], chaine.split(";")[1], Double.parseDouble(chaine.split(";")[2].replace(" ", "")));
		

	}

}
