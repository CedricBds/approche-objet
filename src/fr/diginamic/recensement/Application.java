package fr.diginamic.recensement;
import java.util.*;

public class Application extends Recensement{

	public Application(int stateCode, String stateName, int departmentCode, int communalCode, String communalName,
			int totalPopulation) {
		super(stateCode, stateName, departmentCode, communalCode, communalName, totalPopulation);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recensement.initCities();
		System.out.println("Choisissez une option: \n"
				+ "1: Population d'une ville donnée \n"+
				"2: Population d'un dpt donné \n" +
				"3: Population d'une région donnée \n"+
				"4: Afficher les 10 régions les plus peuplés \n"+
				"5: Afficher les 10 dpt les plus peuplés \n"+
				"6: Afficher les 10 villes les plus peuplés d'un dpt \n"+
				"7: Afficher les 10 villes les plus peuplés d'une région \n"+
				"8: Afficher les 10 villes les plus peuplés de France \n"+
				"9: Quitter");
		Scanner app = new Scanner(System.in);

		int choice = app.nextInt();
		
		System.out.println(choice);
		
		
		switch (choice) {
		
		case 1:
			
		
		}
		

		}

}
