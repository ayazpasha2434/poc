/**
 * 
 */
package com.tfs.operator.service;

import com.tfs.core.service.BaseService;
import com.tfs.operator.model.impl.OperatorImpl;

/**
 * @author ayaz
 *
 */
public interface OperatorService extends BaseService {

	public OperatorImpl getOperatorDetails(long id);

}
