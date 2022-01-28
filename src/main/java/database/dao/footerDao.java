package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import database.model.footer;

public class footerDao {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<footer> getFooter(){
		return template.query("SELECT * FROM `footer` order by id DESC LIMIT 1",new RowMapper<footer>(){    
	        public footer mapRow(ResultSet rs, int row) throws SQLException { 
	        	int i=0;
	            footer e=new footer(rs.getInt(++i),
	            					rs.getString(++i),
	            					rs.getString(++i),
	            					rs.getString(++i),
	            					rs.getString(++i),
	            					rs.getInt(++i));  
	                
	            return e;    
	        }    
	    });    
	}
	
	public int setFooter(footer f) {
		String sql = "insert into footer(about,address,email,phone,status)"
							+ " Values('"+f.getAbout()+"',"
							+ "'"+f.getAddress()+"',"
							+ "'"+f.getEmail()+"',"
							+ "'"+f.getPhone()+"',1)";
		return template.update(sql);
	}
}
