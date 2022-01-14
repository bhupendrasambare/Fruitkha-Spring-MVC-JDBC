package database.dao;

import org.springframework.jdbc.core.JdbcTemplate;

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
	
}
