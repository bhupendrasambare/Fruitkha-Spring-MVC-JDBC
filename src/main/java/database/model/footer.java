package database.model;

public class footer {
	int id;
	String about;
	String address;
	String email;
	String phone;
	int status;
	public footer(int id, String about, String address, String email, String phone, int status) {
		super();
		this.id = id;
		this.about = about;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}

//return template.query("SELECT * FROM `footer` order by id DESC LIMIT 1",new RowMapper<footer>(){    
//    public footer mapRow(ResultSet rs, int row) throws SQLException { 
//    	int i=0;
//        footer e=new footer(rs.getInt(++i),
//        					rs.getString(++i),
//        					rs.getString(++i),
//        					rs.getString(++i),
//        					rs.getString(++i),
//        					rs.getInt(++i));  
//            
//        return e;    
//    }    
//});   