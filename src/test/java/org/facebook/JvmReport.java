package org.facebook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void report(String jsonpath) {
		
		File f = new File("C:\\Users\\gkr01\\OneDrive\\Desktop\\SM_code\\SocialMedia\\Report\\JVM");
		
		Configuration c = new Configuration(f, "Facebook");
		
		List<String> l = new ArrayList<String>();
		l.add(jsonpath);
		
		ReportBuilder r = new ReportBuilder( l, c);
		r.generateReports();
	}

}
