package database.model;

public class cart {
	int id;
	int user;
	int product;
	int quantity;
	int status;
	public cart(int id, int user, int product, int quantity, int status) {
		super();
		this.id = id;
		this.user = user;
		this.product = product;
		this.quantity = quantity;
		this.status = status;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
