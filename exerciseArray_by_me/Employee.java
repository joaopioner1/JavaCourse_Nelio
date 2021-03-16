package exerciseArray_by_me;

public class Employee {
	//Author: joão Vítor Souza Pioner | DAte: 16/03/21
	
	private String name;
	private short age;
	private char sex;
	private double salary;
	
	public Employee (String name, short age, double salary, char sex) {
		this.setName(name);
		this.setAge(age);
		this.setSalary(salary);
		this.setSex(sex);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public short getAge() {
		return age;
	}
	
	public void setAge(short age) {
		this.age = age;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double addSalary() {
		return salary + 780;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + ", age=" + age + ", sex=" + sex + ", salary=" + salary;
	}
}
