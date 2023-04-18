package sets;
import java.util.*;


public class CreationMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> mapEmployee = new HashMap<>();
		mapEmployee.put("Paul", 1750);
		mapEmployee.put("Hicham", 1825);
		mapEmployee.put("Yu", 2250);
		mapEmployee.put("Ingrid", 2015);
		mapEmployee.put("Chantal", 2418);

		System.out.println(mapEmployee.size());
	}
}
