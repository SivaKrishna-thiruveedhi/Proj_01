package com.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "train_region")
public class Station {
	
	@Column(name = "ss_code")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stationCode;
	
	@Column(name = "station_name")
	private String stationName;
	
	@Column(name = "is_avvailable")
	private int is_avvailable;
	
	@Column(name = "createdby")
	private String createdby;
	
	@Column(name = "modifiedby")
	private String modifiedby;
	
	@Column(name = "last_modification")
	private String last_modification;


	public Station() {
		super();
	}

	public Station(int stationCode, String stationName, int is_avvailable, String createdby, String modifiedby,
			String last_modification) {
		super();
		this.stationCode = stationCode;
		this.stationName = stationName;
		this.is_avvailable = is_avvailable;
		this.createdby = createdby;
		this.modifiedby = modifiedby;
		this.last_modification = last_modification;
	}

	public int getStationCode() {
		return stationCode;
	}


	public void setStationCode(int stationCode) {
		this.stationCode = stationCode;
	}


	public String getStationName() {
		return stationName;
	}


	public void setStationName(String stationName) {
		this.stationName = stationName;
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
	
	

}
