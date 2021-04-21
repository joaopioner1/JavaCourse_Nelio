package exFixacao_poli_her;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		//Author: Joao Vitor Souza Pioner | Date: 20/04/2021 9:20
		//Last edition: 21/04/21 11:40 
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char status = in.next().charAt(0);
			System.out.print("Name: ");
			in.nextLine();
			String name = in.nextLine();
			System.out.print("Price: ");
			Double price = in.nextDouble();
			switch (status) {
			case 'i' :
				System.out.print("Customs fee: ");
				Double customsFee = in.nextDouble();
				Product p_imported = new ImportedProduct(customsFee, name, price);
				list.add(p_imported);
				break;
			case 'u' :
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(in.next());
				Product p_used = new UsedProduct(manufactureDate, name, price);
				list.add(p_used);
				break;
			case 'c' :
				Product p_common = new Product(name, price);
				list.add(p_common);
				break;
			}
		}
		System.out.println("\nPRICE TAGS:");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
		in.close();
	}
}
