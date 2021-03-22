package exercise_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//Author: João Vítor Souza Pioner | Date: 3/22/21 | 14:07
		/*This code is a exercise from Nélio's course. He asked for 
		the students to do it because it'll help them to put the
		information into their minds in a better and useful way.
		*/
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = input.nextInt();
		
		List<Integer> list = new ArrayList<>();
		Employee[] emp = new Employee[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = input.nextInt();
			System.out.print("Salary: ");
			double salary = input.nextDouble();
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			list.add(i, id);
			emp[list.size()] = new Employee(name, salary);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idTest = input.nextInt();
		
		input.close();
	}
}
/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.
*/