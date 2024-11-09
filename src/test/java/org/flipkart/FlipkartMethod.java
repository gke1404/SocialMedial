package org.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMethod {
	
public static WebDriver driver;
	
	public static void openBrowser() {
		
		driver = new ChromeDriver();	
	}
	public static void maxi() {
		driver.manage().window().maximize();
	}
	public static void getUrl(String URL) {
		driver.get(URL);
	}
	public static void sendValue(WebElement el, String value) {
		el.sendKeys(value);
	}
	public static void closeBrowser() {
		driver.close();
	}

}
