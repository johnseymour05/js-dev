package com.seymour.services;

import java.io.File;
import java.net.URL;

import org.pentaho.reporting.engine.classic.core.ClassicEngineBoot;
import org.pentaho.reporting.engine.classic.core.MasterReport;
import org.pentaho.reporting.engine.classic.core.modules.output.pageable.pdf.PdfReportUtil;
import org.pentaho.reporting.libraries.resourceloader.Resource;
import org.pentaho.reporting.libraries.resourceloader.ResourceManager;
import org.springframework.stereotype.Service;



import com.seymour.dtos.ReportDto;

@Service
public class GenerateService {

	public ReportDto generate() {
		// start the reporting engine
		ClassicEngineBoot.getInstance().start();
		
		// create a resource manager and register the defaults
		ResourceManager manager = new ResourceManager();
		manager.registerDefaults();
		
		// specify path of prpt
		String reportPath = "/Users/Work/Documents/pentaho-reports/MY_REPORT.prpt";
		// create a resource object
		Resource resource = null;
		// create the master report object
		MasterReport report = null;
		
		try {
			// create the report
			resource = manager.createDirectly(new URL(reportPath), MasterReport.class);
			report = (MasterReport) resource.getResource();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		File file = new File("/Users/Work/Documents/pentaho-reports/download.pdf");
		
		// generate the report as a pdf
		PdfReportUtil.createPDF(report, file);
		
		return null;
	}
}
