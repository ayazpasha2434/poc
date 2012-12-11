/**
 * 
 */
package com.tfs.driver.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tfs.core.rest.RestModel;
import com.tfs.core.rest.RestService;
import com.tfs.driver.util.DriverUtil;


/**
 * @author ayaz
 *
 */
@Path("/driver")
public class DriverService extends RestService {
	
	@Override
	public void add(RestModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RestModel update(RestModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public RestModel get(@PathParam("id") long id) {
		// TODO Auto-generated method stub
		return DriverUtil.get(id);
	}
}
