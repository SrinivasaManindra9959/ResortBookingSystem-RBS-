package com.rbs.common.exception;

import java.util.List;


public class ValidationException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1693853883238360990L;

	public ValidationException(String systemErrorCode, String typeId, String errorMessage) {
		super(systemErrorCode, typeId, errorMessage);
	}
	
	public ValidationException(List<Error> error) {
		
		super(error);
	}

}
