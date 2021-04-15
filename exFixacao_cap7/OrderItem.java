package exFixacao_cap7;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	public OrderItem() {
	}
	
	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal(Product price, OrderItem quantity) {
		Double p = price.getPrice();
		Integer q = quantity.getQuantity();
		return p * q;
	}
}