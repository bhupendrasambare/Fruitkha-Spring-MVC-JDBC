package database.model;

public class clients {
	int id;
	String name;
	String image;
	String title;
	String discription;
	int status;
	public clients(int id, String name, String image, String title, String discription, int status) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.title = title;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
