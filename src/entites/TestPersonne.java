package entites;
import entites2.Personne;

public class TestPersonne {
public static void main(String args[]) {
	Personne person = new Personne();
	person.nom = "Cedric";
	person.prenom = "bds";
	person.addresse = "780 av du pirée";
	System.out.println(person.toString());
}
}
