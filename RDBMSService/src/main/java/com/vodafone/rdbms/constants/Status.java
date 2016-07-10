package com.vodafone.rdbms.constants;

public enum Status {
	
	CRON("CRON"),
	OOZIE("OOZIE")
	;
	
	
	private String processType;
	private Status(String processType) {
		this.processType=processType;
	}
	public String getStringValue(){
		return this.processType.toUpperCase();
	}

}
