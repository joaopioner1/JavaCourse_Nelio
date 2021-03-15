package arrays;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 11/03/21
		Scanner in = new Scanner(System.in);

		System.out.print("How many rooms will be rented (1-10)? ");
		int n = in.nextInt();
		
		Data[] array = new Data[10];

		for (int i = 1; i <= n; i++) {
			in.nextLine();
			System.out.println("\nRent #" + i);
			System.out.print("Name: ");
			String name = in.nextLine();
			System.out.print("E-mail: ");
			String email = in.nextLine();
			System.out.print("Room: ");
			int room = in.nextInt();
			array[room] = new Data(name, email);
		}
		
		System.out.println("\nBusy rooms: ");
		for (int i = 0; i <= n; i++) {
			System.out.println(i + ": " + array[i].getName() + ", " + array[i].getEmail());
		}
		

		in.close();
	}
}
/*Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
*/