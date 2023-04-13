package fr.diginamic.essais;
import fr.diginamic.salaire.*;


public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie salarie = new Salarie(50.00);
		System.out.println(salarie.getSalaire());
		
		Pigiste pigiste = new Pigiste(50.00);
		System.out.println(pigiste.getSalaire());

	}

}
