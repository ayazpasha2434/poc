package com.tfs.driver.service;

import com.tfs.core.service.EntityService;
import com.tfs.driver.model.impl.DriverImpl;

public interface DriverService extends EntityService {

	public DriverImpl getDriverDetails(long id);
	
	public DriverImpl findByName(String name);
}
