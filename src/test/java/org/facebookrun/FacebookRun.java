package org.facebookrun;

import org.facebook.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\gkr01\\OneDrive\\Desktop\\SM_code\\SocialMedia\\src\\test\\resources\\Facebook"
				, snippets=SnippetType.CAMELCASE
				, glue="org.facebookstep"
				, dryRun=false
				, strict=true
				, plugin= {"html:C:\\Users\\gkr01\\OneDrive\\Desktop\\SM_code\\SocialMedia\\Report\\HTML"
				, "junit:C:\\Users\\gkr01\\OneDrive\\Desktop\\SM_code\\SocialMedia\\Report\\Junit\\junitreport.xml"
				, "json:C:\\Users\\gkr01\\OneDrive\\Desktop\\SM_code\\SocialMedia\\Report\\Json\\jsonreport.json"}
				)

public class FacebookRun {

	@AfterClass
	public static void result() {
		
		JvmReport.report("C:\\Users\\gkr01\\OneDrive\\Desktop\\SM_code\\SocialMedia\\Report\\Json\\jsonreport.json");
	}
}
