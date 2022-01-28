package fruitkha.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import database.dao.clientsDao;
import database.dao.footerDao;
import database.dao.socialmediaDao;
import database.model.clients;
import database.model.footer;
import database.model.socialmedia;
import fruitkha.operations.imageUpload;

@Controller
@RequestMapping(value="/admin",method=RequestMethod.POST)
public class adminAboutPost {

	@Autowired
	clientsDao clientDao;
	
	
	@Autowired
	socialmediaDao socailDao;
	
	@Autowired
	footerDao footDao;

	@RequestMapping(value="/addClient")
	public String PostAddClient(@RequestParam("image") CommonsMultipartFile image,
								@RequestParam("name") String name,
								@RequestParam("title") String title,
								@RequestParam("info") String info,
								HttpSession session) {
		
		String path = session.getServletContext().getRealPath("/");
		String filename = image.getOriginalFilename();
		
		filename = imageUpload.addImage(image, session, "clients", filename);
			clients c = new clients(1, name, filename, title, info, 1);
			clientDao.insert(c);
		  
			//System.out.println(path+ " /resources/assets/img/clients/"+filename);
	   return "redirect:clients";
	}
	
	
	@RequestMapping(value= {"/addsocail"})
	public String PostSocial(@RequestParam("name") String name,
							@RequestParam("link") String link,
							@RequestParam("logo") String logo) {
		socialmedia s = new socialmedia(1, name, logo, link);
		socailDao.addSocial(s);
		return "redirect:socialmedia";
	}
	
	@RequestMapping(value= {"/addfooter"})
	public String PostFooter(@RequestParam("about") String about,
							@RequestParam("address") String address,
							@RequestParam("email") String email,
							@RequestParam("phone") String phone) {
		footer f = new footer(1, about, address, email, phone, 1);
		footDao.setFooter(f);
		return "redirect:aboutdata";
	}
}
