package testingLists;

import exercise_list.Employee;

public class Empl extends Employee {
	
	private String birth;
	private Integer phone, sales, position;
	
	public Empl(String birth, Integer phone, Double salary, String name, Integer sales) {
		this.setPhone(phone);
		this.setBirth(birth);
		this.setSalary(salary);
		this.setName(name);
		this.setSales(sales);
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}
	
	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	
	public Double verfSales() {
		this.setSalary(this.getSalary() + 500.00);
		return this.getSalary();
	}

	@Override
	public String toString() {
		return "\nName: "+this.getName()+"\n"+
				"Phone: "+ this.getPhone()+"\n"+
				"Birth: "+this.getBirth()+"\n"+
				"Salary: "+this.getSalary()+"\n"+
				"Sales: "+this.getSales();
	}
	
	public String error() {
		return "ERROR! This position doesn't exist.";
	}
}
