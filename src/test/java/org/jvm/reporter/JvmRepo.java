package org.jvm.reporter;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmRepo {
	
	public static void jvmReportGeneration(String jsonReportFile) {

		// 1.Mention the target folder location - File
		File f = new File("src\\test\\resources\\Jvm Report");
		
		// 2.Add details to the report using Configuration class
		Configuration c = new Configuration(f, "Facebook & Amazon");
		
		// 2.1 - addClassifications()-m, by using this method we can add some details to report
		c.addClassifications("Browser Name", "Chrome");
		c.addClassifications("Browser Version", "89.0");
		c.addClassifications("OS", "Windows");
		c.addClassifications("OS Version", "10");
		c.addClassifications("Sprint No", "2");
		
		// 3.Add json file paths into List<String>
		List<String> l = new LinkedList<String>();
		l.add(jsonReportFile);
		
		// 4.Create object for ReportBuilder class
		ReportBuilder r = new ReportBuilder(l, c);
		// using the created object call generateReports() method
		r.generateReports();
		
	}

}
