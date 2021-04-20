package exResolvido_poli_her;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n): ");
			char answer = in.next().charAt(0);
			System.out.print("Name: ");
			in.nextLine();
			String name = in.nextLine();
			System.out.print("Hours: ");
			Integer hours = in.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = in.nextDouble();
			if (answer == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = in.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);		
				list.add(emp);
				/*Outra forma de adicionar o emp dentro da lista eh
				  new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);	
				  Desta formar nao eh necessario criar a variavel emp.
				 */
			} else { 
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f",  emp.payment()));
		}
		
		in.close();
	}
}
