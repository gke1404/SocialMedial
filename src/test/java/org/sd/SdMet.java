package org.sd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdMet {
	
	public static WebDriver driver;
		
	public void openBrow() {
		
		WebDriver driver = new ChromeDriver();

	}
	
	public void getURl(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	public void click(WebElement we) {
		we.click();
	}

}
