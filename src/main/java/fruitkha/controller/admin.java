package fruitkha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import database.dao.feedbackDao;
import database.dao.subscriberDao;
import database.model.feedback;
import database.model.subscriber;

@Controller
public class admin {
	
	@Autowired
	feedbackDao feedbackDao;
	
	@Autowired
	subscriberDao subDao;
	
	@RequestMapping(value= {"/admin/","/admin/index"})
	public String index() {
		return "admin/index";
	}
	
	@RequestMapping(value= {"/admin/feedback"})
	public String Feedback(Model m) {
		List<feedback> allFeedback= feedbackDao.allFeedback();
		m.addAttribute("allFeedback", allFeedback);
		return "admin/feedback";
	}
	
	@RequestMapping(value= {"/admin/subscribers"})
	public String Getsubscriber(Model m) {
		List<subscriber> allFeedback= subDao.allSubscribers();
		m.addAttribute("allSubs", allFeedback);
		return "admin/subscribers";
	}
}