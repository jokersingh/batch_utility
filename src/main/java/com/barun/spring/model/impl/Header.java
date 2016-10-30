/**
 * 
 */
package com.barun.spring.model.impl;

import com.barun.spring.model.Model;

/**
 * @author bibhu
 *
 */
public class Header implements Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fileType;

	/**
	 * @return the fileType
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * @param fileType the fileType to set
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
}
