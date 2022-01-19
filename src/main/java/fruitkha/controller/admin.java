package fruitkha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import database.dao.clientsDao;
import database.dao.feedbackDao;
import database.dao.subscriberDao;
import database.dao.teamDao;
import database.model.clients;
import database.model.feedback;
import database.model.subscriber;
import database.model.team;

@Controller
public class admin {
	
	@Autowired
	feedbackDao feedbackDao;
	
	@Autowired
	subscriberDao subDao;
	
	@Autowired
	clientsDao clientsDao;
	
	@Autowired
	teamDao teamDao;
	
	@RequestMapping(value= {"/admin/","/admin/index"},method=RequestMethod.GET)
	public String GetIndex() {
		return "admin/index";
	}
	
	@RequestMapping(value= {"/admin/feedback"},method=RequestMethod.GET)
	public String GetFeedback(Model m) {
		List<feedback> allFeedback= feedbackDao.allFeedback();
		m.addAttribute("allFeedback", allFeedback);
		return "admin/feedback";
	}
	
	@RequestMapping(value= {"/admin/subscribers"},method=RequestMethod.GET)
	public String Getsubscriber(Model m) {
		List<subscriber> allFeedback= subDao.allSubscribers();
		m.addAttribute("allSubs", allFeedback);
		return "admin/subscribers";
	}
	
	@RequestMapping(value= {"/admin/clients"},method=RequestMethod.GET)
	public String GetClients(Model m) {
		List<clients> allFeedback= clientsDao.getClients();
		m.addAttribute("allclients", allFeedback);
		return "admin/clients";
	}
	
	@RequestMapping(value= {"/admin/team"},method=RequestMethod.GET)
	public String GetTeam(Model m) {
		List<team> allTeam= teamDao.getTeam();
		m.addAttribute("allTeam", allTeam);
		return "admin/team";
	}
}