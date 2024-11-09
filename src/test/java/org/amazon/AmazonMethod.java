package org.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMethod {

	public static WebDriver driver;

	public static void openBrows() {

		driver = new ChromeDriver();
	}

	public static void maxi() {
		driver.manage().window().maximize();
	}

	public static void getUrl(String URL) {
		driver.get(URL);
	}

	public static void sendData(WebElement el, String value) {
		el.sendKeys(value);
	}

	public static void closeBrows() {
		driver.close();
	}

}
