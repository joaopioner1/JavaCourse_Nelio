package exFixacao_abstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 21/04/2021 20:23
		//Last edition: 11:40 22/04/21
		Scanner in = new Scanner(System.in);
		
		List<Person> list = new ArrayList<Person>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)? ");
			char answer = in.next().charAt(0);
			System.out.print("Name: ");
			in.nextLine();
			String name = in.nextLine();
			System.out.print("Annual income: ");
			Double annualIncome = in.nextDouble();
			switch (answer) {
			case 'i' :
				System.out.print("Health expenses: ");
				Double healthExpense = in.nextDouble();
				Person p_indidual = new NaturalPerson(name, annualIncome, healthExpense);
				list.add(p_indidual);
				break;
			case 'c' : 
				System.out.print("Number of employees: ");
				Integer numberEmp = in.nextInt();
				Person p_company = new LegalPerson(name, annualIncome, numberEmp);
				list.add(p_company);
				break;
			}
		}
		Double count = 0.0;
		System.out.println("\nTAXES PAID:");
		for (Person p : list) {
			System.out.println(p.getName()+": $ " + String.format("%.2f", p.calcTax()));
			count += p.calcTax();
		}
		System.out.printf("\nTOTAL TAXES: $ %.2f", count);
		in.close();
	}
}
