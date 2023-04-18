package listes;

import java.util.ArrayList;


public class CreationListe {
	
	public static void main(String[] args) {
		ArrayList numberlist = new ArrayList();
		
		for (int i = 0; i < 100; i++) {
			numberlist.add(i, i);
		}
		
		System.out.println(numberlist.size());
		
		
	}

}
