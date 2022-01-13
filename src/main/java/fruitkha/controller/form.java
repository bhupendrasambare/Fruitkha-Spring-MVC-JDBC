package fruitkha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class form {

	@RequestMapping(value="/contact/submitContact",method=RequestMethod.POST)
	public String contactPost(@RequestParam("name") String name,Model m) {
		
		m.addAttribute("msg",name+" Thank You For Your Approach Will Contact You Soon");
		return "responce/centerTest";
	}
}
