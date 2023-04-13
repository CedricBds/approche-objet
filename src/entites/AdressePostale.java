package entites;

public class AdressePostale {
	//Valeurs par defaut s'il n'y a pas d'instances
	
int streetNumber;
String addressLabel;
String postCode;
String city;


public AdressePostale(int streetNumber, String addressLabel, String postCode, String city) {
	this.streetNumber = streetNumber;
	this.addressLabel = addressLabel;
	this.postCode = postCode;
	this.city = city;
}

public String toString() {
	return Integer.toString(streetNumber) +" "+ addressLabel +" "+ postCode + " " + city;
	
}
}
