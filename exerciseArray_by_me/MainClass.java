package exerciseArray_by_me;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//Author: joão Vítor Souza Pioner | DAte: 16/03/21
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many employees would you like to show? ");
		int quantEmp = in.nextInt();
				
		Employee[] emp = new Employee[20];
		int countF = 0, countM = 0;
		
		//System.out.println("\nEmployees data: ");
		for (int i=0; i < quantEmp; i++) { //testar fazer isso dentro de um método na outra classe
			System.out.println("\nEmployee " + (i+1) + ":");
			System.out.print("Name: ");
			in.nextLine();
			String name = in.nextLine();
			System.out.print("Age: ");
			short age = in.nextShort();
			System.out.print("Sex (F/M): ");
			char sex = in.next().charAt(0);
			System.out.print("Salary: ");
			double salary = in.nextDouble();
			/*System.out.print("ID: ");
			int id = in.nextInt();*/
			emp[quantEmp] = new Employee(name, age, salary, sex);
			//verifica quantos employees são mulheres 
			if (sex == 'F') {
				countF++;
			} else {
				countM++;
			}
		}
		
		System.out.println("");
		for (int i=0; i < quantEmp; i++) {
			if (emp[quantEmp].getSalary() < 1500.00) {
				emp[quantEmp].setSalary(emp[quantEmp].getSalary()+700);
				System.out.println(i + ": " + emp[quantEmp] + " (salary was < than 1500)");
			} else {
				System.out.println(i + ": " + emp[quantEmp]);
			}
		}
		float percent = (100 * countF) / quantEmp;
		System.out.println("\n"+countF+" are women, and "+countM+" are men.");
		System.out.println("Percentage: M = "+(100 - percent)+" | F = " + percent);
		
		in.close();
	}
}
