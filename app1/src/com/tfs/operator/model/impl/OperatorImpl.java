/**
 * 
 */
package com.tfs.operator.model.impl;

import java.util.Set;

import com.tfs.driver.model.impl.DriverImpl;
import com.tfs.operator.model.Operator;

/**
 * @author ayaz
 *
 */
public class OperatorImpl implements Operator {

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
	
	public Set<DriverImpl> getDrivers() {
		return drivers;
	}
	public void setDrivers(Set<DriverImpl> drivers) {
		this.drivers = drivers;
	}

	private long id;
	private String name;
	private int rank;
	
	private Set<DriverImpl> drivers;
	
}
