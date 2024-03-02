package com.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "train_details")
public class Train {
	
	@Column(name = "train_no")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainNo;
	
	@Column(name = "train_name")
	private String trainName;
	
	@Column(name = "starting_station")
	private String startingStationName;
	
	@Column(name = "end_station")
	private String endStationName;
	
	@Column(name = "station_code")
	private String stationCode;
	
	@Column(name = "bording_time")
	private String boardingTime;
	
	@Column(name = "destination_time")
	private String destinationTime;
	
	@Column(name = "avg_speed")
	private String avgSpeed;
	
	@Column(name = "is_avvailable")
	private int is_avvailable;
	
	@Column(name = "createdby")
	private String createdby;
	
	@Column(name = "modifiedby")
	private String modifiedby;
	
	@Column(name = "last_modification")
	private String last_modification;
	
	public Train() {
		super();
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getBoardingTime() {
		return boardingTime;
	}

	public void setBoardingTime(String boardingTime) {
		this.boardingTime = boardingTime;
	}

	public String getDestinationTime() {
		return destinationTime;
	}

	public void setDestinationTime(String destinationTime) {
		this.destinationTime = destinationTime;
	}

	public String getAvgSpeed() {
		return avgSpeed;
	}

	public void setAvgSpeed(String avgSpeed) {
		this.avgSpeed = avgSpeed;
	}

	public int getIs_avvailable() {
		return is_avvailable;
	}

	public void setIs_avvailable(int is_avvailable) {
		this.is_avvailable = is_avvailable;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public String getLast_modification() {
		return last_modification;
	}

	public void setLast_modification(String last_modification) {
		this.last_modification = last_modification;
	}

	public String getStartingStationName() {
		return startingStationName;
	}

	public void setStartingStationName(String startingStationName) {
		this.startingStationName = startingStationName;
	}

	public String getEndStationName() {
		return endStationName;
	}

	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	
	
}
