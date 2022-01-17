package fruitkha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import database.dao.newsDao;
import database.model.news;

import org.springframework.ui.Model;  

@Controller
public class pages {

	@Autowired
	newsDao newsDao;
	
	
	@RequestMapping({"/index","/"})
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about(Model m) {
		String massage = "Hello ";
		m.addAttribute("message", massage);
		return "about";
	}
	
	@RequestMapping(value="/news",method=RequestMethod.GET)
	public String newsPage(Model m) {
		List<news> allnews = newsDao.allNews();
		String massage = "Hello ";
		m.addAttribute("message", massage);
		m.addAttribute("allNews", allnews);
		return "news";
	}

	@RequestMapping(value="/article",method=RequestMethod.GET)
	public String Singlenews(@RequestParam("news") int news, Model m) {
		String massage = "Hello ";
		m.addAttribute("message", massage);
		return "singleNews";
	}
	
	@RequestMapping(value="/contact",method=RequestMethod.GET)
	public String contact(Model m) {
		String massage = "Hello ";
		m.addAttribute("message", massage);
		return "contact";
	}
	
	@RequestMapping(value="/shop",method=RequestMethod.GET)
	public String shop(Model m) {
		String massage = "Hello ";
		m.addAttribute("message", massage);
		return "shop";
	}
	
	@RequestMapping(value="/cart",method=RequestMethod.GET)
	public String cart(Model m) {
		String massage = "Hello ";
		m.addAttribute("message", massage);
		return "cart";
	}
	
	@RequestMapping(value="/checkout",method=RequestMethod.GET)
	public String checkout(Model m) {
		String massage = "Hello ";
		m.addAttribute("message", massage);
		return "checkout";
	}
	
}