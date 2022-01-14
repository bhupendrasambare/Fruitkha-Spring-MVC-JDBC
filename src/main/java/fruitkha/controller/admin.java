package fruitkha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class admin {

	@RequestMapping(value= {"/admin/","/admin/index"})
	public String index() {
		return "admin/index";
	}
	
}
