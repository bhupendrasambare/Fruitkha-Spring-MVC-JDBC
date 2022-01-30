package fruitkha.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import database.dao.footerDao;
import database.dao.newsDao;
import database.dao.socialmediaDao;
import database.model.footer;
import database.model.news;
import database.model.socialmedia;

@Controller
public class pageNews {

	@Autowired
	newsDao newsDao;

	@Autowired
	socialmediaDao sDao;
	
	@Autowired
	footerDao footDao;
	
	@RequestMapping(value="/news",method=RequestMethod.GET)
	public String newsPage(Model m) {
		List<news> allnews = newsDao.allNews();
		String massage = "Hello ";
		m.addAttribute("message", massage);
		m.addAttribute("allNews", allnews);
		

		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "news";
	}

	@RequestMapping(value="/article",method=RequestMethod.GET)
	public String Singlenews(@RequestParam("news") int news, Model m) {
		news n = newsDao.FindNewsById(news);
		//Tags string to arraylists
		List<String> items = Arrays.asList(n.getTags().split("\\s*-\\s*"));
		//Recent news to add
		List<news> recent = newsDao.numNews(5);
		m.addAttribute("tags",items);
		m.addAttribute("article", n);
		m.addAttribute("recent", recent);
		
		
		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "singleNews";
	}
	
	
}
