package testingLists;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 25/03/2021 17:32
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("How many employees would you like to : ");
		int n = input.nextInt();

		ArrayList<Empl> list = new ArrayList<>();
		Empl emp;

		System.out.println("Employees Data:");
		for (int i = 0; i < n; i++) {
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Salary: ");
			Double salary = input.nextDouble();
			System.out.print("Birth: ");
			String birth = input.next();
			System.out.print("Phone: ");
			Integer phone = input.nextInt();
			System.out.print("Quantity of sales: ");
			Integer sales = input.nextInt();
			emp = new Empl(birth, phone, salary, name, sales);

			list.add(emp);
		}

		for (Empl obj : list) {
			System.out.println(obj);
		}
	}

}
