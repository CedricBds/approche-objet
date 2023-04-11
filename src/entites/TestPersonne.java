package entites;
import entites2.Personne;

public class TestPersonne {
public static void main(String args[]) {
	/*Modifier la classe TestPersonne de manière à 
o utiliser le constructeur avec arguments de la classe Personne pour valoriser les 
attributs nom et prenom 
o utiliser la méthode qui permet de modifier l’adresse pour valoriser l’adresse.*/
	Personne person = new Personne("Cedric", "Bds", "780 avenue du pirée");
	person.setAddress("2 rue du steak");
	System.out.println(person.toString());
}
}
