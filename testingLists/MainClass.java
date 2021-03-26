package testingLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 25/03/2021 17:32
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.print("How many employees would you like to : ");
		int n = input.nextInt();

		ArrayList<Empl> list = new ArrayList<>();
		Empl emp = null;
		RandomStuff rand = new RandomStuff();

		System.out.println("Employees Data:");
		for (int i = 0; i < n; i++) {
			System.out.println("---------------");
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
		System.out.println("\nSize of the list: " + list.size()+"\n");
		
		List<Empl> orgNames = list.stream().filter(x -> x.getName().charAt(0) == 'M').collect(Collectors.toList()); //It gets the names that start with the word M
		
		System.out.print("Names that start with the word M: ");
		for (Empl obj : orgNames) {
			System.out.println(obj);
		}
		
		System.out.println("\nAll the elements from the list:");
		for (Empl obj : list) {
			System.out.println(obj);
		}
		
		System.out.print("\nEnter the position of the element: ");
		emp.setPosition(input.nextInt()-1);// -1 because if the user types "1" the program will undersatand "0". Then, It would commit a mistake. 
		
		if (emp.getPosition() > list.size()) {
			emp.error();
		} else {
			System.out.print("I found this element in that position: "+list.get(emp.getPosition()));
		}
		
		System.out.println("\nEnter the position of the element that you'd like to remove: ");
		emp.setPosition(input.nextInt());
		
		if (emp.getPosition() <= list.size()) {
			list.remove(emp.getPosition());
		} else {
			emp.error();
		}
		
		System.out.println("List without the element that you wanted to remove: ");
		for (Empl obj : list) {
			System.out.println(obj);
		}
		
		list.removeIf(x -> x.getSales() < 90);
		System.out.println("List without people who sold less than 90: ");
		for (Empl obj : list) {
			System.out.println(obj);
		}
		
		list.add(2, emp.getName());
		input.close();
	}
}
