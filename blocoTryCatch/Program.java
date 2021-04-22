package blocoTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		try {
			String[] vect = in.nextLine().split(" ");
			Integer posi = in.nextInt();
			System.out.println(vect[posi]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("TYPE A CORRECT POSITION, SON OF A BITCH");
			e.printStackTrace();
			in.next();
		} catch (InputMismatchException e) {
			System.out.println("WRONG VALUE");
			e.printStackTrace();
		}
		System.out.println("END PROGRAM");
	}
}
