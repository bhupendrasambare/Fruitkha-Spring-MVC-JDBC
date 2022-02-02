package database.model;

public class cartJoin {
	int id;
	int quantity;
	String name;
	String image;
	String unit;
	int price;
	public cartJoin(int id, int quantity, String name, String image, String unit, int price) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.image = image;
		this.unit = unit;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	
}
