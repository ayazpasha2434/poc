/**
 * 
 */
package com.tfs.operator.service.impl;

import java.util.Collections;

import com.tfs.common.Util;
import com.tfs.core.model.BaseModel;
import com.tfs.operator.model.Operator;
import com.tfs.operator.model.impl.OperatorImpl;
import com.tfs.operator.service.OperatorService;

/**
 * @author ayaz
 *
 */
public class OperatorServiceImpl implements OperatorService {

	public void add() {
		// TODO Auto-generated method stub
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

	public Operator update(BaseModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collections findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public OperatorImpl getOperatorDetails(long id) {
		// TODO Auto-generated method stub
		return (OperatorImpl) Util.getHibernateSession().get(OperatorImpl.class, id);
	}

	public BaseModel get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
