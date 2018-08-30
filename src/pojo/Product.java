package pojo;

public class Product {

	private int id;
	private String name;
	private float price;
	private boolean state;

	public Product() {
		super();
		this.name = "admin";
		this.price = (float) 10.10;
	}

	public Product(String name, float price, boolean state) {
		super();
		this.name = name;
		this.price = price;
		this.state = state;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
