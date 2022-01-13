package fruitkha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;  

@Controller
public class pages {

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
	public String news(Model m) {
		String massage = "Hello ";
		m.addAttribute("message", massage);
		return "news";
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