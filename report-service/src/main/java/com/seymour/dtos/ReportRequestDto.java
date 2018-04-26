package com.seymour.dtos;

public class ReportRequestDto {

	private int id;
	private String reportTemplateName;
	public ReportRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReportRequestDto(int id, String reportTemplateName) {
		super();
		this.id = id;
		this.reportTemplateName = reportTemplateName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReportTemplateName() {
		return reportTemplateName;
	}
	public void setReportTemplateName(String reportTemplateName) {
		this.reportTemplateName = reportTemplateName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((reportTemplateName == null) ? 0 : reportTemplateName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReportRequestDto other = (ReportRequestDto) obj;
		if (id != other.id)
			return false;
		if (reportTemplateName == null) {
			if (other.reportTemplateName != null)
				return false;
		} else if (!reportTemplateName.equals(other.reportTemplateName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ReportRequest [id=" + id + ", reportTemplateName=" + reportTemplateName + "]";
	}
	
	
}
