/**
 * 
 */
package com.tfs.core.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author ayaz
 *
 */
public abstract class RestService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public abstract RestModel get(@PathParam("id") long id);
	
	@POST
	public abstract void add(RestModel model);
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public abstract RestModel update(RestModel model);
	
	@DELETE
	public abstract void delete(long id);
}
