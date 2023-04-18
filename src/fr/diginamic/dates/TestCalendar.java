package fr.diginamic.dates;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		Calendar c = Calendar.getInstance();
		c.set(2016, 5, 19, 23, 59, 30);
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH) + "/"+ c.get(Calendar.MONTH) + "/" +c.get(Calendar.YEAR));
		
	
		
	}
}
