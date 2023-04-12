package fr.diginamic.banque;

import entites.Cercle;
import entites.ObjetGeometrique;
import entites.Rectangle;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] geoObjects = new ObjetGeometrique[2];
		 geoObjects[0] = new Rectangle(20, 20);
		 geoObjects[1] = new Cercle(20);
		 
		 for (ObjetGeometrique object : geoObjects) {
			 System.out.println("Surface: "+ object.surface() + " Périmètre: " + object.perimetre());
			 object.surface();
			 object.perimetre();
		 }
	}

}
