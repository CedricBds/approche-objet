package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date date = new Date();
		
		//System.out.println(date.getDate(DateFormat.DAY_OF_WEEK_FIELD)+ "/" + date.getMonth() + "/" + date.getYear());
		
		String newstring = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date);		
		System.out.println(newstring);
	}

}
