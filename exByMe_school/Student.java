package exByMe_school;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Student {
	
	private String name;
	private Integer age, id;
	private Date birthDay;
	private SchoolName school;
	private Double[] grades;
	private Double avg;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Student() {
	}
	public Student(String name, Integer age, Integer id, Date birthDay, SchoolName school, Double[] grades, Double avg) {
		this.age = age;
		this.id = id;
		this.birthDay = birthDay;
		this.school = school;
		this.grades = grades;
		this.avg = avg;
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}
	
	public Double getAvg() {
		return avg;
	}
	
	public void setAvg(Double avg) {
		this.avg = avg;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public SchoolName getSchool() {
		return school;
	}
	
	public void setSchool(SchoolName school) {
		this.school = school;
	}
	
	public Double[] getGrades() {
		return grades;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		String showGrades = Arrays.toString(grades); //mostra elementos dentro do array sem usar loop
		return "Name: " + getName()
				+ "\nBirthDay: " + sdf.format(getBirthDay())
				+ "\nId: " + getId()
				+ "\nAge: " + getAge()
				+ "\nSchool: " + getSchool()
				+ "\nGrades: " + showGrades
				+ "\nAverage: " + getAvg();
	}
}
