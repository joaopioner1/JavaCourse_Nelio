package exercise_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//Author: Jo�o V�tor Souza Pioner | Date: 3/22/21 | 14:07
		/*This code is a exercise from N�lio's course. He asked for 
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
/*Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de
N funcion�rios. N�o deve haver repeti��o de id.
Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma
mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios,
conforme exemplos.
Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
aumento por porcentagem dada.
*/