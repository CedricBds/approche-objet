package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
	
	/**
	 * 
	 * @param forme
	 * @return
	 */
	 public void afficher(Forme forme) {
		 System.out.println(forme.calculerPerimetre());
		 System.out.println(forme.calculerSurface());

	 }
	 
 
}
