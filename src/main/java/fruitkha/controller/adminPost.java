package fruitkha.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import database.dao.fruitDao;
import database.dao.newsDao;
import database.dao.teamDao;
import database.model.fruits;
import database.model.news;
import database.model.team;
import fruitkha.operations.imageUpload;

@Controller
@RequestMapping(value="/admin",method=RequestMethod.POST)
public class adminPost {

	@Autowired
	teamDao teamDao;
	
	@Autowired
	fruitDao fDao;
	
	@Autowired
	newsDao ndao;
	
	@RequestMapping(value= {"/addproduct","/addProduct"})
	public String SetProduct(@RequestParam("name")String name,
							@RequestParam("info")String info,
							@RequestParam("price")int price,
							@RequestParam("unit")String unit,
							@RequestParam("categories")String categories,
							@RequestParam("count")int count,
							@RequestParam("image")CommonsMultipartFile image,
							HttpSession session) {
		
		String path = session.getServletContext().getRealPath("/");
		String filename = image.getOriginalFilename();
		
		filename = imageUpload.addImage(image, session, "products", filename);
		
		fruits f = new fruits(1, name, filename, unit, price, info, categories, count, 1);
		fDao.setFruit(f);
		return "redirect:products";
	}

	@RequestMapping(value={"/addTeam","/addteam"})
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
	

	@RequestMapping(value={"/addnews"})
	public String PostAddNews(@RequestParam("image") CommonsMultipartFile image,
							@RequestParam("name") String name,
							@RequestParam("user") String user,
							@RequestParam("info") String info,
							@RequestParam("date") String date,
							@RequestParam("tags") String tags,
							HttpSession session
							) {
		String path = session.getServletContext().getRealPath("/");
		String filename = image.getOriginalFilename();
		
		filename = imageUpload.addImage(image, session, "news", filename);
		news n = new news(1, name, filename, info, user, date, tags, 0, 1);
		ndao.setNews(n);
		return "redirect:news";
	}
}
