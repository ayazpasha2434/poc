package com.tfs.driver.service.impl;

import java.util.Collections;

import com.tfs.common.Util;
import com.tfs.core.model.BaseModel;
import com.tfs.driver.model.impl.DriverImpl;
import com.tfs.driver.service.DriverService;

public class DriverServiceImpl implements DriverService {

	public DriverImpl getDriverDetails(long id) {
		return (DriverImpl) Util.getHibernateSession().get(DriverImpl.class, id);
	}

	public void add() {
		// TODO Auto-generated method stub
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

	public BaseModel update(BaseModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public BaseModel get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collections findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public DriverImpl findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
