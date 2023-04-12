package entites;

public class Cercle implements ObjetGeometrique {
	
	double rayon;
	
	public Cercle (double rayon) {
		this.rayon = rayon;
	}

	public double perimetre() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * rayon;
	}

	public double surface() {
		// TODO Auto-generated method stub
		return rayon * Math.PI;
	}

}
