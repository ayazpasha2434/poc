package com.tfs.driver.util;

import com.tfs.driver.rest.Driver;
import com.tfs.driver.service.DriverService;
import com.tfs.common.Util;

public class DriverUtil {

	public static Driver get(long id) {
		
		DriverService driverService = (DriverService) Util.getObject("driverService");
		return new Driver(driverService.getDriverDetails(id));
	}
	
}
