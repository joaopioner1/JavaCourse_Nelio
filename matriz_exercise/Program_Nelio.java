package matriz_exercise;

import java.util.Scanner;

public class Program_Nelio {

	public static void main(String[] args) {
		//Author: João Vítor Souza Pioner | Date: 27/03/2020 20:51
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please, enter the number of lines and colums that you want: ");
		int lines = input.nextInt();
		int colums = input.nextInt();
		
		int[][] mat = new int[lines][colums];
		
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (x == mat[i][j]) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		input.close();
	}

}
