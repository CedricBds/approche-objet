package sets;

import java.util.*;

public class TestSetDouble {

	public static void main(String[] args) {
		
		HashSet<Double> mydoubles = new HashSet<Double>(
				Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));


		System.out.println(mydoubles);

		Collections.max(mydoubles);
		mydoubles.remove(Collections.min(mydoubles));
		
		
	}

}
