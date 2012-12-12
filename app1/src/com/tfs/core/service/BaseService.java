/**
 * 
 */
package com.tfs.core.service;

import java.util.Collections;

import com.tfs.core.model.BaseModel;

/**
 * @author ayaz
 *
 */
public interface BaseService {
	
	public abstract void add();
	
	public void delete();
	
	public BaseModel update(BaseModel entity);
	
	public BaseModel get(long id);
	
	public Collections findAll();

}
