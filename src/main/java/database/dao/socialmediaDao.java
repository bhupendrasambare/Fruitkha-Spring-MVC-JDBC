package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import database.model.socialmedia;

public class socialmediaDao {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<socialmedia> getSocail(){
		return template.query("SELECT * FROM `socialmedia`", new RowMapper<socialmedia>() {
			public socialmedia mapRow(ResultSet r,int row) throws SQLException{
				int i=0;
				socialmedia s = new socialmedia(r.getInt(++i),r.getString(++i),r.getString(++i),r.getString(++i)); 
				return s;
			}
		});
	}
	
	public int addSocial(socialmedia s) {
		String sql = "insert into socialmedia(name,logo,link) Values('"+s.getName()+"','"+s.getLogo()+"','"+s.getLink()+"')";
		return template.update(sql);
	}
	
	public int deleteSocial(int id) {
		String sql = "DELETE FROM socialmedia WHERE id = "+id;
		return template.update(sql);
	}
}
