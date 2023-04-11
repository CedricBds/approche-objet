package entites;

public class AdressePostale {
	//Valeurs par defaut s'il n'y a pas d'instances
int streetNumber = 780;
String addressLabel = "Avenue du pirée";
String postCode = "34000";
String City = "Montpellier";

public String toString() {
	return Integer.toString(streetNumber) +" "+ addressLabel +" "+ postCode + " " + City;
	
}
}
