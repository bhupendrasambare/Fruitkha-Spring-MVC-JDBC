package database.model;

public class about {
	int id;
	String name;
	String logo;
	String discription;
	int status;
	public about(int id, String name, String logo, String discription, int status) {
		super();
		this.id = id;
		this.name = name;
		this.logo = logo;
		this.discription = discription;
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
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
