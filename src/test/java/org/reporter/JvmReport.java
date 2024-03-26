package org.reporter;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JvmReport {
	public static void generateJvmReport(String jsonPath) {
		//1.mention the file path
		File f=new File("C:\\Users\\Acviss\\eclipse-workspace\\Acviss\\CUCUMBER REPORT");
		
		//2.add the report details
	Configuration c=new Configuration(f, "LFMC ORIGIN ");
	c.addClassifications("Browser","Chrome");
	c.addClassifications("jdk version","21.0");	
	
	//3. Add the json path to list
	List<String> l=new ArrayList<String>();
	l.add(jsonPath);
	
	//4.genarate the jvm report
	ReportBuilder r=new ReportBuilder(l,c);
	r.generateReports();
	
				
	}
}
