package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import database.model.feedback;
import database.model.subscriber;

public class subscriberDao {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insert(subscriber sub) {
		String sql = "Insert INTO subscriber(email,date,status) "
				+ "Values('"+sub.getEmail()+"',"
				+ "'"+sub.getDate()+"',"
				+ "'"+1+"')";
		
		return template.update(sql);
	}
	
	public List<subscriber> allSubscribers(){
		return template.query("Select * From subscriber", new RowMapper<subscriber>()  {
			public subscriber mapRow(ResultSet r,int row)throws SQLException{
				subscriber s = new subscriber(
							r.getInt("id"),
							r.getString("email"),
							r.getString("date"),
							r.getInt("status"));
				return s;
			}
		});
	}
}
