package exercise_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 3/22/21 | 14:07
		/*
		 * This code is a exercise from Nélio's course. He asked for the students to do
		 * it because it'll help them to put the information into their minds in a
		 * better and useful way.
		 */
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = input.nextInt();

		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("\nEmployee #" + (i+1) + ": ");
			System.out.print("Id: ");
			Integer id = input.nextInt();
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Salary: ");
			Double salary = input.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.print("\nEnter the id that will have salary increase: ");
		int idSalary = input.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);//Achando ID usando list.stream e expressão lambda
		Integer pos = position(list, idSalary); //Achando o ID manualmente
		if (pos == null) {
			System.out.println("The ID does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = input.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees: ");
		
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		input.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for (int i=0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
/*
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e
 * salario) de N funcionários. Não deve haver repetição de id. Em seguida,
 * efetuar o aumento de X por cento no salário de um determinado funcionário.
 * Para isso, o programa deve ler um id e o valor X. Se o id informado não
 * existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a
 * listagem atualizada dos funcionários, conforme exemplos. Lembre-se de aplicar
 * a técnica de encapsulamento para não permitir que o salário possa ser mudado
 * livremente. Um salário só pode ser aumentado com base em uma operação de
 * aumento por porcentagem dada.
 */