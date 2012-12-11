/**
 * 
 */
package com.tfs.core.service;

import java.util.Collections;

import com.tfs.core.model.Entity;

/**
 * @author ayaz
 *
 */
public interface EntityService {
	
	public abstract void add();
	public void delete();
	public Entity update(Entity entity);
	public Entity get(long id);
	public Collections findAll();

}
