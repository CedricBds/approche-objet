package fr.diginamic.testenumeration;

public enum Saison {	
	
	PRINTEMPS(1),
	ETE(2),
	AUTOMNE(3),
	HIVER(4);
	
	
	  private final int valeur;

	  private Saison(int valeur) {
	    this.valeur = valeur;
	  }

	  public int getValeur() {
	    return this.valeur;
	  }

}


