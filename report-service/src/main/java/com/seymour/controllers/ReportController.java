package com.seymour.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seymour.dtos.ReportDto;
import com.seymour.dtos.ReportRequestDto;
import com.seymour.entities.Item;
import com.seymour.entities.ReportTemplate;
import com.seymour.services.ReportService;

@RestController
@RequestMapping("reports")
public class ReportController {
	
	@Autowired
	ReportService rs;

	@PostMapping("generateReport")
	public ReportDto getReportById(@RequestBody ReportRequestDto req) {
		return rs.generateReportById(req);
		
		
	}
	
	@PostMapping("create-template")
	public ReportTemplate createTemplate() {
		return rs.createTemplate();
	}
	
	@GetMapping("get-template")
	public ReportTemplate getTemplate() {
		return rs.getTemplate();
	}
	
	@GetMapping("get-item")
	public Item getItem() {
		return rs.getItem();
	}
	
}





