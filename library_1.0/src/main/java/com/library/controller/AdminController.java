package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.model.Message;
import com.library.model.Train;
import com.library.model.User;
import com.library.service.MainService;
import com.library.service.user.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	UserService logService;
	
	@Autowired
	MainService service;
	
	@PostMapping("/addTrain")
	public Message addTrain(@RequestBody Train train ) {
		System.out.println("***************Add Train***************");
		System.out.println(train.getTrainName());
		Message msg = new Message();
		msg.setMsg(service.addTrain(train));
		return msg;
	}
	
	
}
































