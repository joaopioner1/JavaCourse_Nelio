package exFixacao_poli_her;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 20/04/2021 9:20
		//Last edition: 
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		Product p1 = new Product("Tablet", 1200.00);
		System.out.println(p1.priceTag());
		Product p2 = new ImportedProduct(100.00, "TV", 1900.00);
		System.out.println(p2.priceTag());
		
		
		in.close();
	}
}
