package Vegetable;

public class Vegetable {
	private String id;
	private String name;
	private String unit;
	private int quantinySold;
	private int sale;
	private double price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getQuantinySold() {
		return quantinySold;
	}

	public void setQuantinySold(int quantinySold) {
		this.quantinySold = quantinySold;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Vegetable() {
	}

	public Vegetable(String id, String name, String unit, int quantinySold, int sale, double price) {
		this.id = id;
		this.name = name;
		this.unit = unit;
		this.quantinySold = quantinySold;
		this.sale = sale;
		this.price = price;
	}

	public double getTotalRevenue() {
		return quantinySold * (price - price * sale / 100);
	}

	public void display() {
		System.out.printf("%-12s %-25s %-12s %-18d %-8d %-15f  %-20f", id, name, unit, quantinySold, sale, price,
				getTotalRevenue());
		System.out.println();

	}
}
