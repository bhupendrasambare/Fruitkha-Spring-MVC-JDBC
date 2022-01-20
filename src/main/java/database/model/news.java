package database.model;

public class news {
	
	int id;
	String name;
	String image;
	String info;
	String user;
	String date;
	String tags;
	int count;
	int status;
	
	public news(int id, String name,String image, String info, String user, String date, String tags, int count, int status) {
		super();
		this.id = id;
		this.name = name;
		this.info = info;
		this.user = user;
		this.date = date;
		this.tags = tags;
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
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
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
