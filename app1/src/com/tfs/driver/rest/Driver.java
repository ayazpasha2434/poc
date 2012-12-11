package com.tfs.driver.rest;

import javax.xml.bind.annotation.XmlRootElement;

import com.tfs.core.rest.RestModel;
import com.tfs.driver.model.impl.DriverImpl;

@XmlRootElement
public class Driver extends RestModel {
	
	public Driver() {}
	
	public Driver(DriverImpl driver) {
		this.name = driver.getName();
		this.operatorId = driver.getOperatorId();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}
	
	private String name;
	private Integer operatorId;

}
