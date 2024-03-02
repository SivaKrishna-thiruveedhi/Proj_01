package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.model.Message;
import com.library.model.Station;
import com.library.model.Train;
import com.library.model.User;
import com.library.service.MainService;
import com.library.service.user.UserService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class Controller {
	
	@Autowired
	UserService logService;
	
	@Autowired
	MainService service;
	
	@GetMapping("/trainSearch")
	public List<Station> trainSearch() {
		System.out.println("TraiSearching.................");
		return service.trianSearchList();
	}
	
	@GetMapping("/trainSearch/{stationName}")
	public List<Train> trainSearchByStationName(@PathVariable String stationName) {
		System.out.println("Train Search By StationName............");
		return service.trainSearchByStationName(stationName);
	}
	
	@PostMapping("/addUser")
	public Message registerUser(@RequestBody User user ) {
		System.out.println("***************Register***************");
		System.out.println(user.getName());
		Message msg = new Message();
		msg.setMsg(service.getRegister(user));
		return msg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	@GetMapping("/")
	public ModelAndView home() {
		System.out.println("******Home page Working******");
		return new ModelAndView("home");
	}
	
	@PostMapping("/login")
	public ModelAndView login(ModelMap model,HttpServletRequest request, HttpServletResponse response ) {
		System.out.println("***********"+ request.getParameter("username"));
		if (logService.checkUserExistence(request, response)) {
			return new ModelAndView("user/userProfile");
		} else {
			model.put("wrongCredentials", "Please enter the nessary Username or mail or password..!!");
			System.out.println("False Credentials...");
			request.setAttribute("model", model);
			return new ModelAndView("home");
		}
	}
	
	@RequestMapping("/Register")
	public ModelAndView registerLink(ModelMap model,HttpServletRequest request, HttpServletResponse response ) {
		System.out.println("******Register page Working******");
		return new ModelAndView("register");
	}
	
	@PostMapping("/register")
	public ModelAndView register(ModelMap model,HttpServletRequest request, HttpServletResponse response ) {
		if (logService.addUser(request, response)) {
			return new ModelAndView("user/userProfile");
		} else {
			return new ModelAndView("register");
		}
	}
	*/
}























