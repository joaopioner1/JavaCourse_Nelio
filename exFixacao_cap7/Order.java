package exFixacao_cap7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private Date moment;
	private OrderStatus status;
		
	private List<OrderItem> ordItem = new ArrayList<>();
	Product product = new Product();
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
		
	public void addItem(OrderItem item) {
		this.ordItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.ordItem.remove(item);
	}
	
	public List<OrderItem> getOrdItem() {
		return ordItem;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName()+", ");
		for (OrderItem ord : ordItem) {
			sb.append(ord.getPrice());
			sb.append(", Quantity: ");
			sb.append(ord.getQuantity());
		}
		return sb.toString();
	}
	public Double total(Double price) {
		return price += price;
	}
}
