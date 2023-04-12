package entites;

public class Rectangle implements ObjetGeometrique {

	double longueur;
	double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2 * (longueur + largeur);
	}

	public double surface() {
		// TODO Auto-generated method stub
		return longueur * largeur;
	}

}
