package exampleList;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); //instantiating  a list
		//PS: ATTENTION! LISTS COUNT 0 THROUGH ... NOT 1.
		list.add("Joao"); //list.add add something into the list
		list.add("Isa");
		list.add("Adriana");
		list.add("Miriam");
		list.add(3, "Maria"); //add element in a specific place 
		
		System.out.println(list.size()); //this code shows the size of the list
		
		for (String x : list ) {
			System.out.println(x);
		}
		System.out.println("----------------");
		
		list.remove(0); //it removes something from the list
		list.removeIf(x -> x.charAt(0) == 'M'); //Lambda funcion. it removes the names that start with the word M
		
		for (String x : list ) {
			System.out.println(x);
		}
	}
}
