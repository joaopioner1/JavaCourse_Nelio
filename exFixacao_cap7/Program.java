package exFixacao_cap7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		//Author: Joao Vitor Souza Pioner | Date: 13/04/21
		//Last edition: 
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date moment = new Date();		
		Product p = new Product();
		OrderItem od = new OrderItem();
		
		System.out.println("--Enter client data:");
		System.out.print("Name: ");
		String name = in.nextLine();
		System.out.print("Email: ");
		String email = in.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(in.nextLine());
		Client client = new Client(name, email, birthDate);
		System.out.println("--Enter order data:");
		System.out.print("Status: ");
		String status = in.next();
		Order order = new Order(moment, OrderStatus.valueOf(status));
		System.out.print("How many itens to this order? ");
		Integer n = in.nextInt();
		
		Double total = null;
		for (int i = 0; i<n; i++) {
			System.out.println("Enter #"+i+" item data: ");
			System.out.print("Product name: ");
			in.nextLine();
			String productName = in.nextLine();
			System.out.print("Product price: ");
			Double price = in.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = in.nextInt();
			od = new OrderItem(quantity, price);
			p = new Product(productName, price);
			total = order.total(price);
			order.addItem(od);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + sdf.format(moment));
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + client.getName()+" ("+ sdf.format(client.getBirthDate())+") - " + client.getEmail());
		System.out.println("Order items:");
		System.out.println(od.toString());
		System.out.print(", Subtotal: "+od.subTotal(p, od)+"\n");
		for (OrderItem o : order.getOrdItem()) {
			System.out.println("Total: "+ total);
		}
	}
}
