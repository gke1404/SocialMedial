package org.sdrun;
import org.sdstep.*;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\gpala\\eclipse-workspace\\CucumberFamewrok\\SocialMedial\\src\\test\\resources\\Snapdeal\\SearchingtheProduct.feature"
			,glue="org.sdstep"
			,dryRun=false
			,snippets=SnippetType.CAMELCASE
		
		)
public class SnapDeal {

}
