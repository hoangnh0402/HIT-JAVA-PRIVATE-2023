package BAI_1;

import java.util.Scanner;

public class Student extends Person {
	private Integer id;
	private static int ID = 0;
	private String nameClass;
	private Float gpa;
	private final float CRITERIA = 2;

	public Student() {
		id = ID;
		ID++;
	}

	public Student(String name, int age, Address address, String nameClass, Float gpa) {
		super();
		id = ID;
		ID++;
		this.nameClass = nameClass;
		this.gpa = gpa;
	}

	@Override
	public void input() {
		super.input();
		System.out.printf("Id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.printf("Name class: ");
		nameClass = sc.nextLine();
		System.out.printf("Jpa: ");
		gpa = sc.nextFloat();
	}

	@Override
	public void output() {
		super.output();
		System.out.printf("%-10d %-20s %-20f\n", id, nameClass, gpa);
	}

	public boolean checkFall() {
		if (gpa < CRITERIA)
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public Float getGpa() {
		return gpa;
	}

	public void setGpa(Float gpa) {
		this.gpa = gpa;
	}
	
	
}
