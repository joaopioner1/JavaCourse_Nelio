package MyExample3_sdf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyExample_3sdf {

	public static void main(String[] args) throws ParseException {
		//Author: João Vítor Souza Pioner | Date: 30/03/2021 11:57
		//Last edition: 30/03/21 11:59
		
		String pattern = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);
		Date date = new Date();
		
		System.out.println(sdf.parse("30/03/2021 12:49:06"));
		System.out.println("-------");
		System.out.println(sdf.toPattern()); //It shows the date pattern that is being used
		System.out.println("-------");
		String pattern2 = "yyyy/MM/dd";
		//sdf.applyPattern(pattern2);
		applyPattern(pattern2);
		System.out.println(sdf.format(date));
	}
	public static void applyPattern(String pattern) {
	}
}
