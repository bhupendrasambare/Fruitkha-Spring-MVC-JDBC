package fruitkha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import database.dao.footerDao;
import database.dao.fruitDao;
import database.dao.newsDao;
import database.model.fruits;
import database.model.news;

@Controller
@RequestMapping("/admin")
public class admin {
	
	footerDao footDao;
	
	@Autowired
	fruitDao fruitDao;
	
	@Autowired
	newsDao nDao;
	
	@RequestMapping(value= {"/","/index"},method=RequestMethod.GET)
	public String GetIndex() {
		return "admin/index";
	}
	
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public String GetProducts(Model m) {
		List<fruits> f = fruitDao.getFruits();
		m.addAttribute("allProducts", f);
		m.addAttribute("setForm", true);
		return "admin/products";
	}
	
	@RequestMapping(value="/addproduct",method=RequestMethod.GET)
	public String GetProductsList(Model m) {
		List<fruits> f = fruitDao.getFruits();
		m.addAttribute("allProducts", f);
		m.addAttribute("setForm", false);
		return "admin/products";
	}


	
	@RequestMapping(value="/addnews",method=RequestMethod.GET)
	public String GetNews(Model m) {
		List<news> n = nDao.allNews();
		m.addAttribute("allNews", n);
		m.addAttribute("setNews", true);
		return "admin/news";
	}
	
	@RequestMapping(value="/news",method=RequestMethod.GET)
	public String GetNewsList(Model m) {
		List<news> n = nDao.allNews();
		m.addAttribute("allNews", n);
		m.addAttribute("setNews", false);
		return "admin/news";
	}
}