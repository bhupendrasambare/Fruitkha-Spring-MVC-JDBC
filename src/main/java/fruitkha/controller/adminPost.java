package fruitkha.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import database.dao.clientsDao;
import database.dao.teamDao;
import database.model.clients;
import database.model.team;
import fruitkha.operations.imageUpload;

@Controller
public class adminPost {

	@Autowired
	clientsDao clientDao;
	
	@Autowired
	teamDao teamDao;
	
	@RequestMapping(value="/admin/addClient",method=RequestMethod.POST)
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
	
	@RequestMapping(value={"/admin/addTeam","/admin/addteam"},method = RequestMethod.POST)
	
	public String PostAddTeam(@RequestParam("image") CommonsMultipartFile image,
							@RequestParam("name") String name,
							@RequestParam("title") String title,
							@RequestParam("facebook") String facebook,
							@RequestParam("twitter") String twitter,
							@RequestParam("instagram") String instagram,
							@RequestParam("linkedin") String linkedin,
							HttpSession session
							) {
		String path = session.getServletContext().getRealPath("/");
		String filename = image.getOriginalFilename();
		
		filename = imageUpload.addImage(image, session, "team", filename);
		team t = new team(1, name, title, filename, facebook, twitter, instagram, linkedin, 1);
		teamDao.insert(t);
		return "redirect:team";
	}
}
