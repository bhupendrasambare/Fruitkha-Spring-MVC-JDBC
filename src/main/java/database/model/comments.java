package database.model;

public class comments {
	int id;
	String name;
	String date;
	String comment;
	int status;
	public comments(int id, String name, String date, String comment, int status) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.comment = comment;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
