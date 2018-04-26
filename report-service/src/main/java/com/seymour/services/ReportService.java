package com.seymour.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seymour.dtos.ReportDto;
import com.seymour.dtos.ReportRequestDto;
import com.seymour.entities.Item;
import com.seymour.entities.ReportTemplate;
import com.seymour.repositories.ItemRepository;
import com.seymour.repositories.ReportTemplateRepository;

@Service
public class ReportService {
	
	@Autowired
	ReportTemplateRepository rtr;
	
	@Autowired
	ItemRepository ir;
	
	
	@Autowired
	GenerateService generateService;
	

	public ReportDto generateReportById(ReportRequestDto req) {
		
		generateService.generate();
		
		return new ReportDto("Some Report Name", null);
	}
	
	public ReportTemplate getTemplate() {
		
		return rtr.findAll().get(0);
	}
	
	public ReportTemplate createTemplate() {
		
		ReportTemplate reportTemplate = new ReportTemplate();
		reportTemplate.setTemplateId(10);
		reportTemplate.setTemplateName("added template");
		return rtr.save(reportTemplate);
	}
	
	public Item getItem() {
		return ir.findAll().get(0);
	}
	
	

}
