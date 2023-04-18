package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> liste1 = new ArrayList<Integer>(
				Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5)
		);

		int max = 0;
		int min = 0;

		for (int i = 0; i < liste1.size(); i++) {
		
		System.out.println(liste1.get(i));
		
		if (liste1.get(i) > max) {
			max = liste1.get(i);
		}
		
		if (liste1.get(i) < min) {
			min = liste1.get(i);
		}
		
		if (liste1.get(i) < 0) {
			System.out.println("inf");
			liste1.set(i, liste1.get(i) * liste1.get(i));
			//item += item;
		}
		
	}
	
	
	System.out.println("Plus grand: " + max);
	System.out.println("Plus pti: " + min);


	System.out.println("Taille du tableau: "+ liste1.size());
	System.out.println(liste1);

	
	}

}
