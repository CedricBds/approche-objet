package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class Recensement extends Ville {

	public Recensement(int stateCode, String stateName, int departmentCode, int communalCode, String communalName,
			int totalPopulation) {
		super(stateCode, stateName, departmentCode, communalCode, communalName, totalPopulation);
	}

	
	public static HashSet<Ville> cityArray = new HashSet<Ville>(
			Arrays.asList());
	
	// On init notre tableau
	public static void initCities() {
        Path path= Paths.get("C:/Users/cbds1/Desktop/spring/approche-objet/recensement.csv");
        try {
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
			
		       for (String line : lines) {
		    	   
		    	   String[] city = line.split(";");
		        	System.out.println(Arrays.toString(city));
		        	
		        	cityArray.add(new Ville(Integer.parseInt(city[0]), city[1], Integer.parseInt(city[2]), Integer.parseInt(city[3]), city[4], Integer.parseInt(city[5])));
		        }
		} catch (IOException e) {
			e.printStackTrace();
		}
        
 
        
	}
}
