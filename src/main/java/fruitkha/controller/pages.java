package fruitkha.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import database.dao.clientsDao;
import database.dao.footerDao;
import database.dao.fruitDao;
import database.dao.newsDao;
import database.dao.socialmediaDao;
import database.dao.teamDao;
import database.model.clients;
import database.model.footer;
import database.model.fruits;
import database.model.news;
import database.model.socialmedia;
import database.model.team;

import org.springframework.ui.Model;  

@Controller
public class pages {

	
	@Autowired
	clientsDao clientDao;
	
	@Autowired
	fruitDao fDdao;
	
	@Autowired
	newsDao nDao;
	
	@Autowired
	socialmediaDao sDao;
	
	@Autowired
	footerDao footDao;
	
	@Autowired
	teamDao tDao;
	
	@RequestMapping({"/index","/"})
	public String index(Model m) {
		List<clients> clients = clientDao.getClients();
		List<fruits> f =fDdao.getLimitFruit(3);
		List<news> n = nDao.numNews(3);
		m.addAttribute("fruits", f);
		m.addAttribute("news", n);
		m.addAttribute("clients", clients);
		
		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "index";
	}
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about(Model m) {
		List<clients> clients = clientDao.getClients();
		List<team> team = tDao.getTeam();
		m.addAttribute("clients", clients);
		m.addAttribute("team", team);
		
		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "about";
	}
	
	@RequestMapping(value="/contact",method=RequestMethod.GET)
	public String contact(Model m) {
		String massage = "Hello ";
		m.addAttribute("message", massage);
		
		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "contact";
	}
	

	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(Model m,HttpSession session) {
		session.invalidate();
		return "redirect:index";
	}
	
	
}