package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		long debut = System.currentTimeMillis();
		
		String chaine = "";
		
		for (int i = 0; i < 100000; i++) {
			//stringBuilder.append(i);
			
			chaine += i;
		}
		
		
		
		long fin = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes:" + (fin - debut));


	}

}
