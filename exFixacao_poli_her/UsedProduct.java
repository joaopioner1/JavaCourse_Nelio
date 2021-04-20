package exFixacao_poli_her;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate; 
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(Date manufactureDate, String name, Double price) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
}
