package exByMe_school;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		//Author: João Vítor Souza Pioner | Date: 4/17/2021
		//Last edition: 
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("---School system---");
		System.out.println("#Teacher data#");
		System.out.print("Name: ");
		String nameTeacher = in.nextLine();
		System.out.print("Id: ");
		Integer idTeacher = in.nextInt();
		System.out.print("Area: ");
		AreaEnum area = AreaEnum.valueOf(in.next());
		System.out.print("Salary: ");
		Double salary = in.nextDouble();
		System.out.print("School: ");
		SchoolName schoolTeacher = SchoolName.valueOf(in.next());
		Teacher t = new Teacher(nameTeacher, idTeacher, area, schoolTeacher, salary);
		
		System.out.print("How many students would you like to register? ");
		Integer n = in.nextInt();
		for (int i = 0;i < n;i++) {
			System.out.println("STUDENT #"+(i+1));
			System.out.print("Name: ");
			in.nextLine();
			String name = in.nextLine();
			System.out.print("Age: ");
			Integer age = in.nextInt();
			System.out.print("Birth day: ");
			Date birthDay = sdf.parse(in.next());
			System.out.print("School: ");
			SchoolName school = SchoolName.valueOf(in.next());
			System.out.print("ID: ");
			Integer id = in.nextInt();
			System.out.print("Enter that quantity of grades: ");
			Double[] grades = new Double[in.nextInt()];
			Double avg = 0.0;
			for (int j = 0; j < grades.length; j++) {
				System.out.printf("Grade #%d: ", (j+1));
				grades[j] = in.nextDouble();
				avg += grades[j];
			}
			Student student = new Student(name, age, id, birthDay, school, grades, avg);
			if (school.equals(schoolTeacher)) {
				t.addStud(student);
			} else {
				System.out.println("Impossible to add student because the teacher is from another school.");
			}
		}
		System.out.println(t);
		
		in.close();
	}
}
