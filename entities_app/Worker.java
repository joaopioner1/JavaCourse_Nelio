package entities_app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	Calendar cal = Calendar.getInstance();
	
	private String nam;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}

	public Worker(String nam, WorkerLevel level, Double baseSalary, Department department) {
		this.nam = nam;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getNam() {
		return nam;
	}

	public void setNam(String nam) {
		this.nam = nam;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartament(Department departament) {
		this.department = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = this.baseSalary;
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) { 
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
