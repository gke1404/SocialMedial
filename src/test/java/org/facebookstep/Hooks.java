package org.facebookstep;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.facebook.FacebookMethod;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends FacebookMethod {

	@Before
	public void open() {
		
		openBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
//	@Before()
//	public void screen() throws IOException {
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		
//		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//		
//		File f = new File("C:\\Users\\gkr01\\OneDrive\\Desktop\\SM_code\\SocialMedia\\Report\\ScreenShot");
//		
//		FileUtils.copyFile(screenshotAs, f);
//	}
	
	@After
	public void close() {
		
		closebrowser();
	}
}
