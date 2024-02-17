package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Train;
import com.library.service.train.TrainService;
import com.library.service.user.LoginService;

@Service
public class MainService {

	
	@Autowired
	TrainService trainService;
	
	@Autowired
	LoginService loginService;
	
	public List<Train> trianSearchList() {
		return trainService.getTrainList();
	}
	
}
