package listes;

import java.util.*;

public class FusionListe {

	public static void main(String[] args) {
		List liste1 = new ArrayList();
		liste1.add("rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		
		List liste2 = new ArrayList();
		liste2.add("blanc");
		liste2.add("Bleu");
		liste2.add("orange");
		
		List liste3 = new ArrayList();

		
		for (Object item : liste1) {
			liste3.add(item);
		}
		
		for (Object item : liste2) {
			liste3.add(item);
		}
		
		
		System.out.println(liste3);

	}

}
