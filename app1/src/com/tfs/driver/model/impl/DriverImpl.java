package com.tfs.driver.model.impl;

import com.tfs.driver.model.Driver;

public class DriverImpl implements Driver {

	private long id;
	private String name;
	private int operatorId;
	private String vehicleDescription;
	private int available;
	
	public DriverImpl() {}
	
	public DriverImpl(String name, int operatorId) {
		this.name = name;
		this.operatorId = operatorId;
	}
	
	public String getVehicleDescription() {
		return vehicleDescription;
	}

	public void setVehicleDescription(String vehicleDescription) {
		this.vehicleDescription = vehicleDescription;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}
	
}
