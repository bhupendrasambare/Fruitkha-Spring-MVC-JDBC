package fruitkha.operations;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class imageUpload {
	public static String addImage(CommonsMultipartFile image,HttpSession session,String folder,String filename) {

		filename = ThreadLocalRandom.current().nextInt(1000000, 9999999 + 1) + filename;
		String path = session.getServletContext().getRealPath("/");
		try{  
	        byte barr[]=image.getBytes();  
	          
	        BufferedOutputStream file=new BufferedOutputStream(  
	                 new FileOutputStream(path+"/resources/assets/img/"+folder+"/"+filename));  
	        file.write(barr);  
	        file.flush();  
	        file.close();  
	          return filename;
	        }
		catch(Exception e){
			System.out.println(e);
			}  
		
		return filename;
	}
}
