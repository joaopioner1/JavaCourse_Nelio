package project_enum;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {
	
	private String name;
	private Date birth;
	private Integer id;
	private Double salary;
	
	private List<ServiceArea> area = new ArrayList<>();
	
	public Employee() {
	}
	
	public Employee(String name, Date birth, Integer id, Double salary) {
		this.name = name;
		this.birth = birth;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getBirth() {
		return birth;
	}
	
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public List<ServiceArea> getArea() {
		return area;
	}

	public void setArea(List<ServiceArea> area) {
		this.area = area;
	}

	public void addToArea(ServiceArea area) {
		this.area.add(area);
	}
	
	public void removeFromArea(ServiceArea area) {
		this.area.add(area);
	}
}
