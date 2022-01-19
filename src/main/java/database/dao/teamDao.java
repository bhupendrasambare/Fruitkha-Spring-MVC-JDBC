package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import database.model.team;

public class teamDao {
	private JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public JdbcTemplate getTemplate() {
		return template;
	}
	
	public int insert(team t) {
		String sql = "Insert into team(name,title,image,facebook,twitter,instagram,linkedin,status) "
					+ "values("
					+ "'"+t.getName()+		"',"
					+ "'"+t.getTitle()+		"',"
					+ "'"+t.getImage()+		"',"
					+ "'"+t.getFacebook()+	"',"
					+ "'"+t.getTweeter()+	"',"
					+ "'"+t.getInstagram()+	"',"
					+ "'"+t.getLinkedin()+	"',"
					+ "1)";
		return template.update(sql);
	}
	
	public int delete(int id) {
		String sql = "Delete from team where id= "+id;
		return template.update(sql);
	}
	
	public List<team> getTeam(){
		return template.query("Select * from team where status =1",new RowMapper<team>() {
			public team mapRow(ResultSet r,int row)throws SQLException {
				int i=0;
				team t = new team(r.getInt(++i),
								r.getString(++i), 
								r.getString(++i), 
								r.getString(++i), 
								r.getString(++i), 
								r.getString(++i), 
								r.getString(++i), 
								r.getString(++i), 
								r.getInt("status"));
				return t;
			}
		});
	}
}
