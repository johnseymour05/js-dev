package com.seymour.dtos;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class ReportDto {
	
	private String reportName;
	private byte[] reportContents;
	
	public ReportDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReportDto(String reportName, byte[] reportContents) {
		super();
		this.reportName = reportName;
		this.reportContents = reportContents;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public byte[] getReportContents() {
		return reportContents;
	}
	public void setReportContents(byte[] reportContents) {
		this.reportContents = reportContents;
	}
	
}