package com.rbs.common.exception;

public class Error {

	private String systemErrorCode;
	private String typeId;
	private String errorMessage;
	public String getSystemErrorCode() {
		return systemErrorCode;
	}
	public void setSystemErrorCode(String systemErrorCode) {
		this.systemErrorCode = systemErrorCode;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Error(String systemErrorCode, String typeId, String errorMessage) {
		super();
		this.systemErrorCode = systemErrorCode;
		this.typeId = typeId;
		this.errorMessage = errorMessage;
	}
	
	
}
