package database.model;

public class paragraph {
	int id;
	int news;
	String data;
	int status;
	public paragraph(int id, int news, String data, int status) {
		super();
		this.id = id;
		this.news = news;
		this.data = data;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNews() {
		return news;
	}
	public void setNews(int news) {
		this.news = news;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
