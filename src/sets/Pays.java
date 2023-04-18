package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Pays {
	
	String name;
	int totalHab;
	int pibByHab;
	
	public Pays(String name, int totalHab, int pibByHab) {
		this.name = name;
		this.totalHab = totalHab;
		this.pibByHab = pibByHab;
	}
	
	public static HashSet<Pays> country = new HashSet<Pays>(
			Arrays.asList(new Pays("USA", 2, 18),
					new Pays("France", 4, 19), 
					new Pays("Allemagne", 7, 10), 
					new Pays("UK", 8, 16), 
					new Pays("Italie", 3, 17), 
					new Pays("Japon", 9 ,18), 
					new Pays("Chine", 15, 15), 
					new Pays("Russie", 58, 14), 
					new Pays("Inde", 125, 11)));
	

public static void main(String args[]) {
	
	
	int pibMax = 0;
	int pibMin = Integer.MAX_VALUE;
	
	Pays countryPibMax = null;
	Pays countryPibMin = null;
	
	for (Pays myCountry : country) {
		
		//System.out.println(myCountry);
		
		if (myCountry.pibByHab > pibMax) {
			pibMax = myCountry.pibByHab;
			countryPibMax = myCountry;
		} 
		
		// pib le plus petit
		if (myCountry.pibByHab < pibMin) {
			countryPibMin = myCountry;
		}
		
		if (myCountry.pibByHab * myCountry.totalHab >= countryPibMax.pibByHab * countryPibMax.totalHab) {
			// c correc
			
		}
		
	}
	
		//pib le plus petit en majuscule
     	countryPibMin.name = countryPibMin.name.toUpperCase();
	System.out.println(countryPibMin.name);
	
	country.remove(countryPibMin);
	
	System.out.println("Le pays avec le plus de pib est " + countryPibMax.name);
	
}


}
