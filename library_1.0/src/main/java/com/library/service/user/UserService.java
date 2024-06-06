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
public class UserService {

	@Autowired
	UserRepository userRepo;

	public boolean checkUserExistence(User user) {

		boolean result = false;
		System.out.println("***********LoginService***********"+ user.getEmail());
		String gmail = user.getEmail();
		Optional<User> user1 = userRepo.findByEmail(gmail);
		if (!(user1.isEmpty())) {
			System.out.println("true..."+user1);
			return true;
		} else {
			System.out.println("false...");
			return result;
		}
	}
	
	public String addUser(User user) {
		boolean result = false;
		boolean userExist = false;
		System.out.println("***********RegisterService***********"+ user.getEmail());
		
		if (checkUserExistence(user)) {
			userExist = true;
		
		}else {
			// Get the current date and time
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        // Define a custom date and time format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        // Format the current date and time as a string
	        String formattedDateTime = currentDateTime.format(formatter);
			
			User newUser = new User();
			newUser.setName(user.getName());
			newUser.setEmail(user.getEmail());
			newUser.setPassword(user.getPassword());
			newUser.setAge(user.getAge());
			newUser.setIs_avvailable(1);
			newUser.setCreatedby("SK");
			newUser.setModifiedby("SK");
			newUser.setLast_modification(formattedDateTime);
			newUser.setIsAdmin("N");
			
			userRepo.save(newUser);
		}
		
		if(userExist) {
			return "User Already Exists With Same Email-Id";
		}else
			return "User Saved Succesfully";
	}

	public Optional<User> getLogin(User user) {
		boolean result = false;
		Optional<User> user1 = java.util.Optional.empty();
		if (checkUserExistence(user)) {
			result = true;
		}		
		if (result) {
			user1 = userRepo.findByEmail(user.getEmail());
			if ((user.getPassword().toString()).equals(user1.get().getPassword()) && user1.get().getIs_avvailable() == 1 ) {
				return user1;
			}
		}
		return null;
	}

	
}















