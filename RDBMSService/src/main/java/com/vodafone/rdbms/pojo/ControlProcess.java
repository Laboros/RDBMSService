package com.vodafone.rdbms.pojo;

import java.sql.Timestamp;

import com.vodafone.rdbms.constants.ProcessType;
import com.vodafone.rdbms.constants.Status;

public class ControlProcess {
	
	private long id; //Database id
	private String controlProcessId;//CRON ID or oozie id
	private Timestamp startTimeStamp;
	private Timestamp endTimeStamp;
	private ProcessType processType;  //CRON or OOZIE or Other
	private Status status;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getControlProcessId() {
		return controlProcessId;
	}
	public void setControlProcessId(String controlProcessId) {
		this.controlProcessId = controlProcessId;
	}
	public Timestamp getStartTimeStamp() {
		return startTimeStamp;
	}
	public void setStartTimeStamp(Timestamp startTimeStamp) {
		this.startTimeStamp = startTimeStamp;
	}
	public Timestamp getEndTimeStamp() {
		return endTimeStamp;
	}
	public void setEndTimeStamp(Timestamp endTimeStamp) {
		this.endTimeStamp = endTimeStamp;
	}
	public ProcessType getProcessType() {
		return processType;
	}
	public void setProcessType(ProcessType processType) {
		this.processType = processType;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	

}
