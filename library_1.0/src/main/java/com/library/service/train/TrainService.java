package com.library.service.train;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Station;
import com.library.model.Train;
import com.library.repo.user.StationRepository;
import com.library.repo.user.TrainRepository;

@Service
public class TrainService {

	@Autowired
	TrainRepository trainRepo;
	
	@Autowired
	StationRepository stationRepo;
	
	public List<Station> getTrainList() {
		
		ArrayList trainDetailList = (ArrayList) trainRepo.findAll();

		return stationRepo.findAll();
	}

	public List<Train> getTrainByName(String stationName) {
		return trainRepo.findByStartingStationName(stationName);
	}

}













































