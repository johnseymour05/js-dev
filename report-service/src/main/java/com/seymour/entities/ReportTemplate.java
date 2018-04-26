package com.seymour.entities;

import java.sql.Blob;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REPORT_TMPL")
public class ReportTemplate {

	@Id
	@Column(name="REPORT_TMPL_ID")
	private int templateId;
	@Column(name="REPORT_TMPL_NM")
	private String templateName;
	@Column(name="PRPT_FILE")
	private Blob templateContents;
	
	public ReportTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReportTemplate(int templateId, String templateName, Blob templateContents) {
		super();
		this.templateId = templateId;
		this.templateName = templateName;
		this.templateContents = templateContents;
	}

	public int getTemplateId() {
		return templateId;
	}

	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public Blob getTemplateContents() {
		return templateContents;
	}

	public void setTemplateContents(Blob templateContents) {
		this.templateContents = templateContents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((templateContents == null) ? 0 : templateContents.hashCode());
		result = prime * result + templateId;
		result = prime * result + ((templateName == null) ? 0 : templateName.hashCode());
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
		ReportTemplate other = (ReportTemplate) obj;
		if (templateContents == null) {
			if (other.templateContents != null)
				return false;
		} else if (!templateContents.equals(other.templateContents))
			return false;
		if (templateId != other.templateId)
			return false;
		if (templateName == null) {
			if (other.templateName != null)
				return false;
		} else if (!templateName.equals(other.templateName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReportTemplate [templateId=" + templateId + ", templateName=" + templateName + ", templateContents="
				+ templateContents + "]";
	}


}