package testingLists;

import java.util.ArrayList;


public class Grocery {

	public static void main(String[] args) {
		//Author: João Vítor Souza Pioner | Date: 25/03/2021 16:32
		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

		ArrayList<String> bakeryList = new ArrayList<>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");

		ArrayList<String> produceList = new ArrayList<>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");

		ArrayList<String> drinksList = new ArrayList<>();
		drinksList.add("soda");
		drinksList.add("coffee");

		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		System.out.println(groceryList.get(0).get(2));
		
		System.out.println(groceryList.indexOf(bakeryList));
	}

}
