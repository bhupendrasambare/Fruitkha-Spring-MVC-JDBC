package fruitkha.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import database.dao.footerDao;
import database.dao.socialmediaDao;
import database.dao.userDao;
import database.model.footer;
import database.model.socialmedia;
import fruitkha.operations.imageUpload;

@Controller
public class userPost {

	@Autowired
	socialmediaDao sDao;
	
	@Autowired
	footerDao footDao;
	
	@Autowired
	userDao uDao;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("email") String email,
						@RequestParam("password") String password,
						HttpSession session,
						Model m) {
		int u = uDao.checkUser(email, password);
		if(u != 0) {
			session.setAttribute("id", String.valueOf(u));
			return "redirect:index";
		}
		m.addAttribute("message", "Invalid Account details");
		return "login";
	}
	
	@RequestMapping(value = "/register", method=RequestMethod.POST)
	public String register(@RequestParam("name") String name,
							@RequestParam("email") String email,
						@RequestParam("password") String password,
						@RequestParam("number") String number,
						@RequestParam("gender") String gender,
						@RequestParam("image") CommonsMultipartFile image,
						HttpSession session,
						Model m) {
		String path = session.getServletContext().getRealPath("/");
		String filename = image.getOriginalFilename();
		filename = imageUpload.addImage(image, session, "user", filename);
		
		database.model.user u = new database.model.user(0, name, email, password, filename, number, gender);
		uDao.setUser(u);
		return "redirect:login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Model m,HttpSession session) {
		return "login";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(Model m,HttpSession session) {
		return "register";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String user(Model m,HttpSession session) {
		String id = (String) session.getAttribute("id");
		if(id ==null) {
			return "redirect:login";
		}
		database.model.user u = uDao.getUserById(Integer.parseInt(id));
		m.addAttribute("user",u);
		
		
		List<footer> foot = footDao.getFooter();
		List<socialmedia> social = sDao.getSocail();
		m.addAttribute("footer", foot);
		m.addAttribute("social", social);
		return "user";
	}
	
	@RequestMapping(value="/edituserinformation",method=RequestMethod.POST)
	public String edituserinformation(@RequestParam("name") String name,
										@RequestParam("email") String email,
										@RequestParam("phone") String phone,
										@RequestParam("gender") String gender,
										HttpSession session) {
		String id = (String) session.getAttribute("id");
		if(id ==null) {
			return "redirect:login";
		}
		int userId = Integer.parseInt(id);
		database.model.user u = new database.model.user(userId, name, email, name, email, phone, gender);
		uDao.update(u);
		return "redirect:user";
	}
	
	@RequestMapping(value="/chengeimage",method=RequestMethod.POST)
	public String chengeimage(@RequestParam("image") CommonsMultipartFile image,
										HttpSession session) {
		String id = (String) session.getAttribute("id");
		if(id ==null) {
			return "redirect:login";
		}
		String path = session.getServletContext().getRealPath("/");
		String filename = image.getOriginalFilename();
		filename = imageUpload.addImage(image, session, "user", filename);
		int userId = Integer.parseInt(id);
		uDao.updateImage(filename, userId);
		return "redirect:user";
	}
}
