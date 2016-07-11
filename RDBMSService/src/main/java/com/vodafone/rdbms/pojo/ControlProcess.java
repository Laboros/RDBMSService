package com.vodafone.rdbms.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import com.vodafone.rdbms.constants.ProcessType;
import com.vodafone.rdbms.constants.Status;

public class ControlProcess {
	
	private long id; //Database id
	private String controlProcessId;//CRON ID or oozie id
	private Timestamp startTime;
	private Timestamp endTime;
	private ProcessType processType;  //CRON or OOZIE or Other
	private Status status;
	private String userName;
	
	

	//Reference to ControlProcessDetail
	private Set<ControlProcessDetail> detail=new HashSet<ControlProcessDetail>(0);
	
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
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
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
	
	public Set<ControlProcessDetail> getDetail() {
		return detail;
	}
	public void setDetail(Set<ControlProcessDetail> detail) {
		this.detail = detail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
