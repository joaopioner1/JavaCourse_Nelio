package date_examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyExample {

	public static void main(String[] args) throws ParseException {
		//Author: João Vítor Souza Pioner | Date: 29/03/2021 11:06
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date x = sdf.parse("09/04/2005");
		Date y = sdf.parse("02/03/2005");
		
 		boolean result = x.after(y); //It sees if the date is before/after 
		if (result) {
			System.out.println("X is older");
		} else {
			System.out.println("Y is older");
		}
		
		Date adriana = sdf.parse("02/06/1976");
		Object maria = adriana.clone(); //clone() is used to literally 
		
		System.out.println("Original: " + adriana);
		System.out.println("Clone: " + maria);
		
		if (adriana.equals(maria)) { //it checks if one date is equal to another
			System.out.println("Both are equal!");
		} else {
			System.out.println("They're not equal!");
		}
		
		int comp = y.compareTo(adriana); // 0 - dates are equal -1 - first date is older than the second one 1 - argument date is greater than the first date
		System.out.println("Compare: " + comp);
	}
}
