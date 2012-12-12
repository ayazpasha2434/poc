/**
 * 
 */
package com.tfs.operator.rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.tfs.core.rest.RestModel;
import com.tfs.driver.model.impl.DriverImpl;
import com.tfs.driver.rest.Driver;
import com.tfs.operator.model.impl.OperatorImpl;

/**
 * @author ayaz
 *
 */
@XmlRootElement
public class Operator extends RestModel {
	
	public Operator() {}
	
	public Operator(OperatorImpl operator) {
		this.id = operator.getId();
		this.name = operator.getName();
		this.rank = operator.getRank();
		
		Iterator iterator = operator.getDrivers().iterator();
		
		while(iterator.hasNext()) {
			//this.drivers.add((DriverImpl) iterator.next());
			//System.out.println(iterator.next());
			Driver driver = new Driver((DriverImpl)iterator.next());
			System.out.println(driver.getName());
			drivers.add(driver);
		}
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
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public List<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}

	private long id;
	private String name;
	private int rank;

	private List<Driver> drivers = new ArrayList<Driver>();
}
