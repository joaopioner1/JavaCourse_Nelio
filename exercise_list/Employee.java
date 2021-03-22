package exercise_list;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		percentage = this.getSalary() * percentage / 100;
		this.setSalary(this.getSalary() + percentage);
	}
}
