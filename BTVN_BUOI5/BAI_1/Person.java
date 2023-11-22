package BAI_1;

import java.util.Scanner;

public class Person {
	protected String name;
	protected int age;
	protected Address address;

	public Person() {
	}

	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.printf("Name: ");
		name = sc.nextLine();
		System.out.printf("Age: ");
		age = sc.nextInt();
		sc.nextLine();
		Address addr = new Address();
		addr.input();
		address = addr;
	}
	
	public void output(){
        address.output();
        System.out.printf("%-20s %-20d" , getName() , getAge());
    }

}
