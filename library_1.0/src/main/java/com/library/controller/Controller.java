package com.library.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.library.model.Train;
import com.library.service.MainService;
import com.library.service.user.LoginService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class Controller {
	
	@Autowired
	LoginService logService;
	
	@Autowired
	MainService service;
	
	@GetMapping("/trainSearch")
	public List<Train> trainSearch() {
		System.out.println("TraiSearching.................");
		return service.trianSearchList();
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























