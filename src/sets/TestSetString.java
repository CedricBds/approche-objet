package sets;

import java.util.*;

public class TestSetString {

	public static void main(String[] args) {
		
		HashSet<String> country = new HashSet<String>(
				Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
		
		int maxLength = 0;
		
		String maxLengthCountry = "";
		
		for (String mycountry : country) {
			if (mycountry.length() > maxLength) {
				maxLength = mycountry.length();
				maxLengthCountry = mycountry;
			}
		}
		
		System.out.println("Max length country is " + maxLengthCountry);
		//remove allemagne
		country.remove(maxLengthCountry);
		System.out.println(country);

	}

}
