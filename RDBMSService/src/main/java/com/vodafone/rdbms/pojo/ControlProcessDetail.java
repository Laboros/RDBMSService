package com.vodafone.rdbms.pojo;

import java.sql.Timestamp;

import com.vodafone.rdbms.constants.RDBMSConstants;
import com.vodafone.rdbms.constants.Status;


public class ControlProcessDetail {
	
	private long controlProcessDetailId;//RDBMS generated id
	private long controlProcessId;//Foreign key
	
	private String controlFileName; //Control File Name
	private String datFileName;//Data file name
	private String metaFileName; //Meta File Name
	
	private String hdfsCtlFileLoc;
	private String hdfsMetaFileLoc;
	private String hdfsDatFileLoc;
	
	private Status status;
	
	private String schemaValidation=RDBMSConstants.NA.getStringValue(); //N/A,FAILED,SUCCESS
	private String rowCountValidation;//N/A,FAILED,SUCCESS
	private String crcValidation;//N/A,FAILED,SUCCESS
	
	private boolean ctlRowCountExist=Boolean.FALSE;
	private long ctlRowCount;
	private long computedRowCount;
	
	private String detailLogFileLoc;
	
	private Timestamp insertedDate;
	private Timestamp updatedDate;
	
	
	
	public long getControlProcessDetailId() {
		return controlProcessDetailId;
	}
	public void setControlProcessDetailId(long controlProcessDetailId) {
		this.controlProcessDetailId = controlProcessDetailId;
	}
	public long getControlProcessId() {
		return controlProcessId;
	}
	public void setControlProcessId(long controlProcessId) {
		this.controlProcessId = controlProcessId;
	}
	public String getControlFileName() {
		return controlFileName;
	}
	public void setControlFileName(String controlFileName) {
		this.controlFileName = controlFileName;
	}
	public String getDatFileName() {
		return datFileName;
	}
	public void setDatFileName(String datFileName) {
		this.datFileName = datFileName;
	}
	public String getMetaFileName() {
		return metaFileName;
	}
	public void setMetaFileName(String metaFileName) {
		this.metaFileName = metaFileName;
	}
	public String getHdfsCtlFileLoc() {
		return hdfsCtlFileLoc;
	}
	public void setHdfsCtlFileLoc(String hdfsCtlFileLoc) {
		this.hdfsCtlFileLoc = hdfsCtlFileLoc;
	}
	public String getHdfsMetaFileLoc() {
		return hdfsMetaFileLoc;
	}
	public void setHdfsMetaFileLoc(String hdfsMetaFileLoc) {
		this.hdfsMetaFileLoc = hdfsMetaFileLoc;
	}
	public String getHdfsDatFileLoc() {
		return hdfsDatFileLoc;
	}
	public void setHdfsDatFileLoc(String hdfsDatFileLoc) {
		this.hdfsDatFileLoc = hdfsDatFileLoc;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getSchemaValidation() {
		return schemaValidation;
	}
	public void setSchemaValidation(String schemaValidation) {
		this.schemaValidation = schemaValidation;
	}
	public String getRowCountValidation() {
		return rowCountValidation;
	}
	public void setRowCountValidation(String rowCountValidation) {
		this.rowCountValidation = rowCountValidation;
	}
	public String getCrcValidation() {
		return crcValidation;
	}
	public void setCrcValidation(String crcValidation) {
		this.crcValidation = crcValidation;
	}
	public boolean isCtlRowCountExist() {
		return ctlRowCountExist;
	}
	public void setCtlRowCountExist(boolean ctlRowCountExist) {
		this.ctlRowCountExist = ctlRowCountExist;
	}
	public long getCtlRowCount() {
		return ctlRowCount;
	}
	public void setCtlRowCount(long ctlRowCount) {
		this.ctlRowCount = ctlRowCount;
	}
	public long getComputedRowCount() {
		return computedRowCount;
	}
	public void setComputedRowCount(long computedRowCount) {
		this.computedRowCount = computedRowCount;
	}
	public String getDetailLogFileLoc() {
		return detailLogFileLoc;
	}
	public void setDetailLogFileLoc(String detailLogFileLoc) {
		this.detailLogFileLoc = detailLogFileLoc;
	}
	public Timestamp getInsertedDate() {
		return insertedDate;
	}
	public void setInsertedDate(Timestamp insertedDate) {
		this.insertedDate = insertedDate;
	}
	public Timestamp getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}
}
