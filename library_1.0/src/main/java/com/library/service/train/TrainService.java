package com.library.service.train;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Train;
import com.library.repo.user.StationRepository;
import com.library.repo.user.TrainRepository;

@Service
public class TrainService {

	@Autowired
	TrainRepository trainRepo;
	
	@Autowired
	StationRepository stationRepo;
	
	public List<Train> getTrainList() {
		return trainRepo.findAll();
	}

}
