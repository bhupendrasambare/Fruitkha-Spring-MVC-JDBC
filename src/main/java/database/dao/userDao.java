package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import database.model.user;

public class userDao {
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public user getUserById(int id) {
		String sql = "SELECT * FROM `user` where id= ?";
		return template.queryForObject(sql,new Object[]{id},new RowMapper<user>() {
			public user mapRow(ResultSet r,int row) throws SQLException{
				int i=0;
				user u = new user(
								r.getInt(++i),
								r.getString(++i),
								r.getString(++i),
								r.getString(++i),
								r.getString(++i),
								r.getString(++i),
								r.getString(++i));
				return u;
			}
		});
	}
	
	public int checkUser(String email, String password) {
		String sql = "SELECT id FROM `user` WHERE `email` LIKE ? AND `password` LIKE ?";
		System.out.println(sql);
		List<Integer> id =  template.query(sql,new Object[]{email,password},new RowMapper<Integer>() {
			public Integer mapRow(ResultSet r,int rowNum) throws SQLException{
				return r.getInt(1);
			}
		});
		if(id.isEmpty()) {
			return 0;
		}
		return id.get(0);
	}
	
	public int setUser(user u) {
		String sql = "Insert INTO user(name,email,password,image,phone,gender)Values("
						+ "'"+u.getName()+"',"
						+ "'"+u.getEmail()+"',"
						+ "'"+u.getPassword()+"',"
						+ "'"+u.getImage()+"',"
						+ "'"+u.getPhone()+"',"
						+ "'"+u.getGender()+"')";
		return template.update(sql);
	}
	
	public int update(user u) {
		String sql = "UPDATE `user` SET `name` = '"+u.getName()+"',"
									+ " `email` = '"+u.getEmail()+"',"
									+ " `phone` = '"+u.getPhone()+"',"
									+ " `gender` = '"+u.getGender()+"'"
									+ " WHERE `user`.`id` = "+u.getId();
		return template.update(sql);
	}
	
	public int updateImage(String img,int id) {
		String sql = "UPDATE user SET image='"+img+"' WHERE `user`.`id` = "+id;
		return template.update(sql);		
	}
	
}
