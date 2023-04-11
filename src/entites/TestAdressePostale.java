package entites;

import entites.AdressePostale;

public class TestAdressePostale {
	
public static void main(String args[]) {
  AdressePostale firstInstance = new AdressePostale();
  
  firstInstance.streetNumber = 5;
  firstInstance.addressLabel = "Avenue du pirée";
  firstInstance.postCode = "34000";
  firstInstance.City = "Montpellier";
  
  System.out.println(firstInstance.toString());

  AdressePostale secondInstance = new AdressePostale();
  
  secondInstance.streetNumber = 3;
  secondInstance.addressLabel = "Avenue des champs";
  secondInstance.postCode = "54000";
  secondInstance.City = "Nancy";
  
  System.out.println(secondInstance.toString());
}
}
