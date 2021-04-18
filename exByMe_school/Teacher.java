package exByMe_school;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

	private String name;
	private Integer id;
	private AreaEnum area;
	private SchoolName school;
	private Double salary;

	private List<Student> student = new ArrayList<>();

	public Teacher() {
	}

	public Teacher(String name, Integer id, AreaEnum area, SchoolName school, Double salary) {
		this.name = name;
		this.id = id;
		this.area = area;
		this.school = school;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AreaEnum getArea() {
		return area;
	}

	public void setArea(AreaEnum area) {
		this.area = area;
	}

	public SchoolName getSchool() {
		return school;
	}

	public void setSchool(SchoolName school) {
		this.school = school;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void addStud(Student student) {
		this.student.add(student);
	}

	public void removeStud(Integer id) {
		Student std = student.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		student.remove(std);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("--------------");
		sb.append("\nName: ");
		sb.append(name);
		sb.append("\nId: ");
		sb.append(id);
		sb.append("\nSchool: ");
		sb.append(school);
		sb.append("\nSalary: ");
		sb.append(salary);
		sb.append("\nArea: ");
		sb.append(area);
		sb.append("\n---#"+area+" students#---\n");
		for (Student s : student) {
			sb.append("STUDENT #"+(student.indexOf(s)+1));
			sb.append("\n"+s+"\n");
			sb.append("----------");
		}
		return sb.toString();
	}
}
/*
 * Teacher - name : String - Id : Integer - area : AreaEnum - salary : Double -
 * school : SchoolEnum
 * 
 * increaseSalary() : Double addStud() : void
 * 
 */