package entites;

import entites.AdressePostale;

public class TestAdressePostale {
	
public static void main(String args[]) {
  AdressePostale firstInstance = new AdressePostale(5, "Avenue du pont", "54000", "Nancy");
  System.out.println(firstInstance.toString());

  AdressePostale secondInstance = new AdressePostale(54, "Avenue du puis", "34000", "Montpellier");
  System.out.println(secondInstance.toString());
}
}
