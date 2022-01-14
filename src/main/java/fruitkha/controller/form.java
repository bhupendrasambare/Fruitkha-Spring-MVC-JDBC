package fruitkha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import database.dao.feedbackDao;
import database.model.feedback;

@Controller
public class form {
	
	@Autowired
	feedbackDao feedkDao;
	
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
}
