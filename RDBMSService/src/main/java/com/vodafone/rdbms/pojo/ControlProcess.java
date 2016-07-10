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
	
	
	

}
