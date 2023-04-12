package fr.diginamic.essais;

import fr.diginamic.utils.CercleFactory;

public class TestCercle extends CercleFactory  {
	
	
	public static void main(String args[]) {
		System.out.println("Perimetre: " + CercleFactory.createCircle(102).getPerimeter() + " Surface:" + CercleFactory.createCircle(102).getSurface());
		System.out.println("Perimetre: " + CercleFactory.createCircle(105).getPerimeter() + " Surface:" + CercleFactory.createCircle(105).getSurface());
	}

}
