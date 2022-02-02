package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import database.model.cart;
import database.model.cartJoin;

public class cartDao {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int setCart(cart c) {
		String sql = "Insert into cart(user,product,quantity,status)"
						+ " values("+c.getUser()+","
						+ c.getProduct()+","
						+ c.getQuantity()+","
						+ "1)";
		return template.update(sql);
	}
	
	public List<cartJoin> getCartById(int id){
		String sql = "SELECT cart.id,cart.quantity,fruits.name,fruits.image,fruits.unit,fruits.price from cart join fruits on cart.product = fruits.id and cart.user = ?";
		return template.query(sql,new Object[] {id},new RowMapper<cartJoin>() {
			public cartJoin mapRow(ResultSet r,int row)throws SQLException {
				int i=0;
				cartJoin c = new cartJoin(r.getInt("id"),r.getInt("quantity"), r.getString("name"),  r.getString("image"),  r.getString("unit"), r.getInt("price"));
				return c;
			}
		});
	}
	
	public int delete(int id,int user) {
		String sql = "Delete from cart where user ="+user+" And id = "+id;
		return template.update(sql);
	}
}
