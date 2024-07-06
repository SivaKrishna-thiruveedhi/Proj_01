package com.library.service.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.config.CurrentTime;
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
	
	@Autowired
	CurrentTime currentTime;
	
	public List<Station> getTrainList() {
		
//		ArrayList<Train> trainDetailList = (ArrayList) trainRepo.findAll();

		return stationRepo.findAll();
	}

	public List<Train> getTrainByName(String stationName) {
		return trainRepo.findByStartingStationName(stationName);
	}

	public String addTrain(Train train) {
		boolean exist = false;
		
		if (isTrainExist(train.getTrainName())) {
			exist = true;
			return "Train Already existed";
		} else {
			String formattedDateTime = currentTime.presentTime();
			
			Train newTrain = new Train();
			
			newTrain.setTrainName(train.getTrainName());
			newTrain.setStartingStationName(train.getStartingStationName());
			newTrain.setEndStationName(train.getEndStationName());
			newTrain.setStationCode(train.getStationCode());
			newTrain.setBoardingTime(train.getBoardingTime());
			newTrain.setDestinationTime(train.getDestinationTime());
			newTrain.setAvgSpeed(train.getAvgSpeed());
			newTrain.setCreatedby("SK");
			newTrain.setModifiedby("SK");
			newTrain.setIs_avvailable(1);
			newTrain.setLast_modification(formattedDateTime);
			
			trainRepo.save(newTrain);
			
			addStationIfNotExist(train.getStartingStationName());
			addStationIfNotExist(train.getEndStationName());
			
			return "Train Added Succesfully";

		}
	}

	/*private void addEndStation(Train train) {
		
		Optional<Station> existingStation = stationRepo.findByStationName(train.getEndStationName());
		
		String formattedDateTime = currentTime.presentTime();
		String stationName = train.getEndStationName();
		String code = stationName.substring(0, 3).toUpperCase();
		
		if (existingStation.isEmpty()) {
			Station station = new Station();
			
			station.setStationName(stationName);
			station.setIs_avvailable(1);
			station.setCreatedby("SK");
			station.setModifiedby("SK");
			station.setLast_modification(formattedDateTime);
			station.setCode(code);
			
			stationRepo.save(station);
		}
		
	}*/

	private void addStationIfNotExist(String stationName) {
		
		Optional<Station> existingStation = stationRepo.findByStationName(stationName);
		
		String formattedDateTime = currentTime.presentTime();
		String code = stationName.substring(0, 3).toUpperCase();
		
		if (existingStation.isEmpty()) {
			Station station = new Station();
			
			station.setStationName(stationName);
			station.setIs_avvailable(1);
			station.setCreatedby("SK");
			station.setModifiedby("SK");
			station.setLast_modification(formattedDateTime);
			station.setCode(code);
			
			stationRepo.save(station);
		}
	}

	public boolean isTrainExist(String trainName) {
		
		Optional<Train> train = trainRepo.findByTrainName(trainName);
		
		if (!(train.isEmpty())) {
			return true;
		} else {
			return false;
		}
	}

}













































