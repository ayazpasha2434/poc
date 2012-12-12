/**
 * 
 */
package com.tfs.operator.util;

import com.tfs.common.Util;
import com.tfs.operator.rest.Operator;
import com.tfs.operator.service.OperatorService;

/**
 * @author ayaz
 *
 */
public class OperatorUtil {
	
	public static Operator get(long id) {
		OperatorService operatorService = (OperatorService) Util.getObject("operatorService");
		return new Operator(operatorService.getOperatorDetails(id));
	} 

}
