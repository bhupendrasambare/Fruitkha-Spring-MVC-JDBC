package database.model;

public class team {
	int id;
	String name;
	String title;
	String image;
	String facebook;
	String tweeter;
	String instagram;
	String linkedin;
	int status;
	public team(int id, String name, String title, String image, String facebook, String tweeter, String instagram,
			String linkedin, int status) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.image = image;
		this.facebook = facebook;
		this.tweeter = tweeter;
		this.instagram = instagram;
		this.linkedin = linkedin;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getTweeter() {
		return tweeter;
	}
	public void setTweeter(String tweeter) {
		this.tweeter = tweeter;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getLinkedin() {
		return linkedin;
	}
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
