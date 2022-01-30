package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import database.model.fruits;

public class fruitDao {

	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<fruits> getFruits() {
		return template.query("SELECT * FROM `fruits` where status =1", new BeanPropertyRowMapper<fruits>() {
			public fruits mapRow(ResultSet r, int row) throws SQLException{
				fruits f = new fruits(r.getInt("id"),
							          r.getString("name"),
							          r.getString("image"),
							          r.getString("unit"),
							          r.getInt("price"),
							          r.getString("discription"),
							          r.getString("categories"),
							          r.getInt("count"),
							          r.getInt("status"));
				return f;
			}
		});
	}
	
	public List<fruits> getLimitFruit(int n) {
		return template.query("SELECT * FROM `fruits` where status =1 Limit "+n, new BeanPropertyRowMapper<fruits>() {
			public fruits mapRow(ResultSet r, int row) throws SQLException{
				fruits f = new fruits(r.getInt("id"),
							          r.getString("name"),
							          r.getString("image"),
							          r.getString("unit"),
							          r.getInt("price"),
							          r.getString("discription"),
							          r.getString("categories"),
							          r.getInt("count"),
							          r.getInt("status"));
				return f;
			}
		});
	}
	
	public int setFruit(fruits f) {
		String sql = "Insert into fruits(name,image,unit,price,discription,categories,count,status) "
				+ "values("
				+ "'"+f.getName()+"',"
				+ "'"+f.getImage()+"',"
				+ "'"+f.getUnit()+"',"
				+ ""+f.getPrice()+","
				+ "'"+f.getDiscription()+"',"
				+ "'"+f.getCategories()+"',"
				+ ""+f.getCount()+",1)";
		return template.update(sql);
	}
}










