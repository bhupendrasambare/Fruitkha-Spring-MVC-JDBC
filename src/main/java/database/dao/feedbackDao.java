package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import database.model.feedback;

public class feedbackDao {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insert(feedback feedback) {
		String sql = "Insert INTO feedback(name,email,phone,subject,message,type) "
				+ "Values('"+feedback.getName()+"',"
				+ "'"+feedback.getEmail()+"',"
				+ "'"+feedback.getPhone()+"',"
				+ "'"+feedback.getSubject()+"',"
				+ "'"+feedback.getMessage()+"',"
				+ "'"+feedback.getType()+"')";
		
		return template.update(sql);
	}
	
	public List<feedback> allFeedback(){
		return template.query("Select * From feedback", new RowMapper<feedback>()  {
			public feedback mapRow(ResultSet r,int row)throws SQLException{
				feedback f = new feedback(
							r.getInt("id"),
							r.getString("name"),
							r.getString("email"),
							r.getString("phone"),
							r.getString("subject"),
							r.getString("message"),
							r.getString("type"));
				return f;
			}
		});
	}
	
}
