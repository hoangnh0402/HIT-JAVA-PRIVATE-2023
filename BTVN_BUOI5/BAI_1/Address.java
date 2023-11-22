package BAI_1;

import java.util.Scanner;

public class Address {
	private String commune;
	private String district;
	private String city;

	public Address() {
	}

	public Address(String commune, String district, String city) {
		this.commune = commune;
		this.district = district;
		this.city = city;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	Scanner sc = new Scanner(System.in);
	public void input() {
		System.out.printf("Commune: ");
        commune = sc.nextLine()  ;
        System.out.printf("District: ");
        district = sc.nextLine() ;
        System.out.printf("City: ");
        city = sc.nextLine();
	}
	
	public void output() {
		 System.out.printf(" %-20s, %-20s, %-10s ", getCommune(),
	                getDistrict(), getCity());
	}

}
