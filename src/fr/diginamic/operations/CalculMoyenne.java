package fr.diginamic.operations;

import java.util.ArrayList;

public class CalculMoyenne {
	public double[] values;
	
	public CalculMoyenne(double[] values) {
		this.values = values;
	}
	
	public void addValue(double value) {
		this.values[this.values.length + 1] = value;
	}
	
	public double calcul() {
		
		double somme = 0;
		
		for (double value : this.values) {
			somme += value;
		}
		
		
		return somme / this.values.length + 1;
		
	}
}
