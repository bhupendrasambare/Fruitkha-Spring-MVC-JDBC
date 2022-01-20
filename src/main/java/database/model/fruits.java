package database.model;

public class fruits {
	int id;
	String name;
	String image;
	String unit;
	int price;
	String discription;
	String categories;
	int count;
	int status;
	public fruits(int id, String name, String image, String unit, int price, String discription, String categories,
			int count, int status) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.unit = unit;
		this.price = price;
		this.discription = discription;
		this.categories = categories;
		this.count = count;
		this.status = status;
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
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
