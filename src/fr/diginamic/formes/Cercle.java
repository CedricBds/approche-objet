package fr.diginamic.formes;

public class Cercle extends Forme{
double rayon;

public Cercle(double rayon) {
	// TODO Auto-generated constructor stub
	this.rayon = rayon;
}

@Override
public double calculerSurface() {
	// TODO Auto-generated method stub
	return rayon * Math.PI;
}

@Override
public double calculerPerimetre() {
	// TODO Auto-generated method stub
	return 2 * Math.PI * rayon;
}
}
