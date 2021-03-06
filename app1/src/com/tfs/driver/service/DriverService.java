package com.tfs.driver.service;

import com.tfs.core.service.BaseService;
import com.tfs.driver.model.impl.DriverImpl;

public interface DriverService extends BaseService {

	public DriverImpl getDriverDetails(long id);
	
	public DriverImpl findByName(String name);
}
