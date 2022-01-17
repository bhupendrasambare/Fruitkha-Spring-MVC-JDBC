package fruitkha.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import database.dao.feedbackDao;
import database.dao.subscriberDao;
import database.model.feedback;
import database.model.subscriber;

@Controller
public class api {
	
	@Autowired
	feedbackDao feedkDao;
	@Autowired
	subscriberDao subDao;
	
	@RequestMapping(value="/contact/submitContact",method=RequestMethod.POST)
	public String contactPost(@RequestParam("name") String name,
							@RequestParam("phone") String phone,
							@RequestParam("email") String email,
							@RequestParam("subject") String subject,
							@RequestParam("message") String message,
							Model m) {
		feedback feedback = new feedback(0, name, email, phone, subject, message, "feedback");
		feedkDao.insert(feedback);
		m.addAttribute("msg",name+" Thank You For Your Approach Will Contact You Soon");
		return "responce/centerTest";
	}
	
	@RequestMapping(value="/api/subscribe",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public List<String> subscribePost(@RequestParam("email") String name,
							@RequestParam("date") String phone,
							Model m) {
		subscriber s = new subscriber(1, name, phone, 1);
		subDao.insert(s);
		List<String> responce = new ArrayList();
		responce.add(name);
		responce.add(phone);
		return responce;
	}
}
