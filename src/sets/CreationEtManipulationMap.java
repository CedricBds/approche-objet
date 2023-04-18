package sets;
import java.util.*;

public class CreationEtManipulationMap {

	public static void main(String[] args) {

		 HashMap<Integer, String> mapVilles = new HashMap<>();
		 
		 mapVilles.put(13, "Marseille");
		 mapVilles.put(34, "Montpellier");
		 mapVilles.put(44, "Nantes");
		 mapVilles.put(75, "Paris");
		 mapVilles.put(31, "Toulouse");
		 
		 // c'est pas les bon dpt
		 mapVilles.put(11, "Lille");
		 mapVilles.put(48, "Lyon");
		 mapVilles.put(30, "Bordeaux");
		 
		 //affichage des clefs disponibles
		 for (Integer ville : mapVilles.keySet()) {
			 System.out.println(ville);
		 }
		 
		 //affichage des valeurs
		 for (String ville : mapVilles.values()) {
			 System.out.println(ville);
		 }
		 
		 System.out.println(mapVilles.size());
		 

		 
	}

}
