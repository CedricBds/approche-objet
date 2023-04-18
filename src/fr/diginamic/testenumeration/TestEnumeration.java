package fr.diginamic.testenumeration;

public class TestEnumeration {


	public static void main(String[] args) {

		String nom = "ETE";
		
		for (Saison saison : Saison.values()) {
			System.out.println(saison);
		}
		System.out.println(Saison.valueOf(nom));
		
		String libelle = "Hiver";
	
		
		

	}

}
