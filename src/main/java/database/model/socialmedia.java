package database.model;

public class socialmedia {
	int id;
	String name;
	String logo;
	String link;
	public socialmedia(int id, String name, String logo, String link) {
		super();
		this.id = id;
		this.name = name;
		this.logo = logo;
		this.link = link;
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
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
}
