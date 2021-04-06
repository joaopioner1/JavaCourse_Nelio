package strings;

import java.util.Scanner;

public class UsingStringsFunctions {

	public static void main(String[] args) {
		//Author: João vítor Pioner / Date: 06/04/2021
		//Last edition: 
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Type a few words: ");
		String words = in.nextLine();
		
		String tLC = words.toLowerCase();
		String tUC = words.toUpperCase();
		String trim = words.trim();
		String subs = words.substring(2, 5);
		String repl = words.replace('a', '1');
		String repl2 = words.replace("vermelho", "laranja");
		int indexOf = words.indexOf('a');
		int lastIndexOf = words.lastIndexOf('a');
		
		String[] vect = words.split(" ");

		String test = "Joao Vitor Pioner";
		System.out.println(test.matches("(.*)Isa(.*)"));
		
		System.out.println("String split: " + vect[0]);
		System.out.println("Last Index Of: " + lastIndexOf);
		System.out.println("indexOf: " + indexOf);
		System.out.println("Replace 2: " + repl2);
		System.out.println("Replace: " + repl);
		System.out.println("Substring: " + subs);
		System.out.println("Trim: " + trim);
		System.out.println("String with all upper case: " + tUC);
		System.out.println("String with all lower case: " + tLC);
		System.out.println("Valor: " + returnIt(938.98));
		in.close();
	}
	
	public static String returnIt(double val) {
		return String.valueOf(val);
	}
}
