package fr.diginamic.entites;

public class Cercle {
	
	double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * rayon;
	}

	public double getSurface() {
		return rayon * Math.PI;
	}

}
