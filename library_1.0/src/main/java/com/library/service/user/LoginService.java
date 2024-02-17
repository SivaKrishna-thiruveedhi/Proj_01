package com.library.service.user;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.User;
import com.library.repo.user.UserRepository;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepo;

	public boolean checkUserExistence(HttpServletRequest request, HttpServletResponse response) {

		boolean result = false;
		System.out.println("***********LoginService***********"+ request.getParameter("email"));
		String gmail = request.getParameter("email");
		Optional<User> user = userRepo.findByUgmail(gmail);
		if (!(user.isEmpty())) {
			System.out.println("true..."+user);
			return true;
		} else {
			System.out.println("false...");
			return result;
		}
	}
	
	public boolean addUser(HttpServletRequest req, HttpServletResponse response) {
		boolean result = false;
		boolean userExist = false;
		System.out.println("***********RegisterService***********"+ req.getParameter("email"));
		
		if (checkUserExistence(req, response)) {
			userExist = true;
		}
		
		if (!userExist) {
			
			// Get the current date and time
	        LocalDateTime currentDateTime = LocalDateTime.now();

	        // Define a custom date and time format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	        // Format the current date and time as a string
	        String formattedDateTime = currentDateTime.format(formatter);
			
			User user = new User();
			user.setUname(req.getParameter("username"));
			user.setUgmail(req.getParameter("email"));
			user.setPassword(req.getParameter("password"));
			user.setUage(Integer.parseInt(req.getParameter("age")));
			user.setIs_avvailable(1);
			user.setCreatedby("SK");
			user.setModifiedby("SK");
			user.setLast_modification(formattedDateTime);
		}
		
		return result;
	}

}















