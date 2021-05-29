package com.rbs.common.exception;

import java.util.ArrayList;
import java.util.List;


public class ApplicationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3946727069838533384L;

	
	protected static List<Error> error = new ArrayList<Error>();
	
	
	public ApplicationException(final String systemErrorCode,final String typeId,final String errorMessage,Throwable ex) {
		super(errorMessage,ex);
		error.add(new Error(systemErrorCode, typeId, errorMessage));
	}
	
	public ApplicationException(final String systemErrorCode,final String typeId,final String errorMessage) {
		super(errorMessage);
		error.add(new Error(systemErrorCode, typeId, errorMessage));
	}
	


	public ApplicationException(List<Error> error2) {

	super();
	}

	public static List<Error> getError() {
		return error;
	}


	public static void setError(List<Error> error) {
		ApplicationException.error = error;
	}
	
}
