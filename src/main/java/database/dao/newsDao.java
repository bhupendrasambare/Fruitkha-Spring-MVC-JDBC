package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import database.model.news;

public class newsDao {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<news> allNews(){
		return template.query("select * from article", new RowMapper<news>() {
			public news mapRow(ResultSet result,int row) throws SQLException{
				int i=0;
				news news = 
					new news(result.getInt(++i)
							,result.getString(++i)
							,result.getString(++i)
							,result.getString(++i)
							,result.getString(++i)
							,result.getString(++i)
							,result.getString(++i)
							,result.getInt(++i)
							,result.getInt(++i));
				return news;
			}
		});
	}
	
	public int setNews(news n) {
		String sql = "insert into article(name,image,info,user,date,tags,count,status)"
				+ "values("
				+ "'"+n.getName()+"',"
				+ "'"+n.getImage()+"',"
				+ "'"+n.getInfo()+"',"
				+ "'"+n.getUser()+"',"
				+ "'"+n.getDate()+"',"
				+ "'"+n.getTags()+"',"
				+ "0,1)";
		return template.update(sql);
	}
	
}
