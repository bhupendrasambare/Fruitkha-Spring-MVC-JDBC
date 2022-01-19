package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import database.model.clients;

public class clientsDao {

	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<clients> getClients(){
		return template.query("select * from clients  where status =1", new RowMapper<clients>() {
			public clients mapRow(ResultSet r,int row) throws SQLException{
				clients c = new clients(
						r.getInt("id"),
						r.getString("name"),
						r.getString("image"),
						r.getString("title"),
						r.getString("discription"),
						r.getInt("status"));
				return c;
			}
		});
	}
	
	public int insert(clients c) {
		String sql = "Insert into clients(name,image,title,discription,status) "
				+ "values('"+c.getName()+"',"
				+ "'"+c.getImage()+"',"
				+ "'"+c.getTitle()+"',"
				+ "'"+c.getDiscription()+"',1)";
		return template.update(sql);
	}
	
	public int delete(int id) {
		String sql = "Delete from clients where id = "+id;
		return template.update(sql);
	}
}
