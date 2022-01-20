package database.model;

public class userlikes {
	int id;
	int user;
	int product;
	int count;
	public userlikes(int id, int user, int product, int count) {
		super();
		this.id = id;
		this.user = user;
		this.product = product;
		this.count = count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public int getProduct() {
		return product;
	}
	public void setProduct(int product) {
		this.product = product;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
