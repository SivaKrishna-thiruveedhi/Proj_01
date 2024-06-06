package com.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Station;
import com.library.model.Train;
import com.library.model.User;
import com.library.service.train.TrainService;
import com.library.service.user.UserService;

@Service
public class MainService {

	
	@Autowired
	TrainService trainService;
	
	@Autowired
	UserService userService;
	
	public List<Station> trianSearchList() {
		return trainService.getTrainList();
	}

	public List<Train> trainSearchByStationName(String stationName) {
		return trainService.getTrainByName(stationName);
	}

	public String getRegister(User user) {
		return userService.addUser(user);
		
	}

	public Optional<User> getLogin(User user) {
		return userService.getLogin(user);
	}
	
}













































