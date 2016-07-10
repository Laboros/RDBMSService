package com.vodafone.rdbms.constants;

public enum Status {
	
	MOVED("MOVED"),
	READY("READY"),
	PROCESSED("PROCESSED"),
	FAILED("FAILED"),
	INPROGRESS("INPROGRESS")
	;
	
	
	private String status;
	private Status(String status) {
		this.status=status;
	}
	public String getStringValue(){
		return this.status.toUpperCase();
	}

}
