package entites2;

public class Personne {
public String lastname;
public String firstname;
public String address;

public Personne(String lastname, String firstname, String address) {
	this.lastname = lastname;
	this.firstname = firstname;
	this.address = address;
}


public String toString() {
	return  lastname +" "+ firstname +" "+ address;
	
}
//Dans la classe Personne, ajoutez une méthode qui permet d’afficher le nom et le 
//prénom avec le nom de famille en majuscules. 
public String getIdentity() {
	return lastname.toUpperCase() + " " + firstname;
}
/*Dans la classe Personne, ajoutez une méthode qui prend un argument en paramètre et 
permet de modifier la variable d’instance nom de Personne.*/
public void setLastname(String lastname) {
	this.lastname = lastname;
}

//• Dans la classe Personne, ajoutez une méthode qui retourne le nom.
public String getLastname() {
	return this.lastname;
}

//Dans la classe Personne, ajoutez une méthode similaire pour modifier le prénom.
public void setFirstname(String firstname) {
	this.firstname = firstname;
}

//• Dans la classe Personne, ajoutez une méthode qui retourne le prenom.
public String getFirstname() {
	return this.firstname;
}

// Dans la classe Personne, ajoutez une méthode similaire pour modifier l’adresse.
public void setAddress(String address) {
	this.address = address;
}

//• Dans la classe Personne, ajoutez une méthode qui retourne l'addresse.
public String getAddress() {
	return this.address;
}




}
