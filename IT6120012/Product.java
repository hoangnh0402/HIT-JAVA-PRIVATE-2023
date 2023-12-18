package IT6120012;

public class Product {
	protected String product_id;
	protected String product_name;
	protected double product_price;
	protected int product_total;

	
	public Product() {
		
	}

	public Product(String product_id, String product_name, double product_price, int product_total) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_total = product_total;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
	    if (product_price > 0) {
	        this.product_price = product_price;
	    } else {
	        System.out.println("Giá sản phẩm phải lớn hơn 0.");
	    }
	}


	public int getProduct_total() {
		return product_total;
	}

	public void setProduct_total(int product_total) {
		if(product_total >= 0) {
			this.product_total = product_total;
		} else {
			System.out.println("Số lượng sản phâm không thể âm");
		}
	}
	
	
	 @Override
	 public String toString() {
	        return "Product{" +
	                "product_id=" + product_id +
	                ", product_name='" + product_name + '\'' +
	                ", product_price=" + product_price +
	                ", product_total=" + product_total +
	                '}';
	 }
}
