package fruitkha.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import database.dao.cartDao;
import database.dao.footerDao;
import database.dao.fruitDao;
import database.dao.socialmediaDao;
import database.model.cart;
import database.model.cartJoin;
import database.model.footer;
import database.model.fruits;
import database.model.socialmedia;

@Controller
public class product {

	@Autowired
	fruitDao fDao;
	
	@Autowired
	cartDao cDao;

	@Autowired
	socialmediaDao sDao;
	
	@Autowired
	footerDao footDao;
	
	@RequestMapping(value="/shop",method=RequestMethod.GET)
	public String shop(Model m) {
		
		List<String> cat = fDao.getCategories();
		List<fruits> fruits = fDao.getFruits();
		m.addAttribute("fruits", fruits);
		m.addAttribute("categories", cat);
		
		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "shop";
	}

	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String product(@RequestParam("id") int id, Model m) {
		fruits f = fDao.getFruitsById(id);
		List<fruits> relate =fDao.getLimitFruit(3);
		m.addAttribute("product", f);
		m.addAttribute("relate", relate);
		
		
		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "product";
	}
	
	
	@RequestMapping(value="/cart",method=RequestMethod.GET)
	public String cartPage(Model m,HttpSession session) {
		String id = (String) session.getAttribute("id");
		if(id ==null) {
			return "redirect:login";
		}
		List<cartJoin> c = cDao.getCartById(Integer.parseInt(id));
		m.addAttribute("cart",c);		
		
		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "cart";
	}
	
	@RequestMapping(value="/checkout",method=RequestMethod.GET)
	public String checkout(Model m,HttpSession session) {
		String id = (String) session.getAttribute("id");
		if(id ==null) {
			return "redirect:login";
		}

		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "checkout";
	}
	
	@RequestMapping(value="addcart",method=RequestMethod.POST)
	public String addcart(@RequestParam("product") int product,
						@RequestParam("value") int value,
						HttpSession session) {
		String id = (String) session.getAttribute("id");
		if(id ==null) {
			return "redirect:login";
		}
		cart c = new cart(1, Integer.parseInt(id), product, value, 1);
		cDao.setCart(c);
		return "redirect:cart";		
	}
	
}
