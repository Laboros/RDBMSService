package com.vodafone.rdbms.constants;

public enum ProcessType {
	
	CRON("CRON"),
	OOZIE("OOZIE")
	;
	
	
	private String processType;
	private ProcessType(String processType) {
		this.processType=processType;
	}
	public String getStringValue(){
		return this.processType;
	}

}
