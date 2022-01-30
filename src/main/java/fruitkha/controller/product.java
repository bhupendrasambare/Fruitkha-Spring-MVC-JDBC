package fruitkha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import database.dao.footerDao;
import database.dao.socialmediaDao;
import database.model.footer;
import database.model.socialmedia;

@Controller
public class product {


	@Autowired
	socialmediaDao sDao;
	
	@Autowired
	footerDao footDao;
	
	@RequestMapping(value="/shop",method=RequestMethod.GET)
	public String shop(Model m) {
		

		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "shop";
	}
	
	@RequestMapping(value="/cart",method=RequestMethod.GET)
	public String cart(Model m) {
		

		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "cart";
	}
	
	@RequestMapping(value="/checkout",method=RequestMethod.GET)
	public String checkout(Model m) {
		

		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "checkout";
	}
}
