package org.flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLocat extends  FlipkartMethod{
	
	public FlipkartLocat() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//input[@type=\"text\"]"))
	private WebElement txtSer;
	
	@FindBy(xpath=("(//div[@class=\"CXW8mj\"])[3]"))
	private WebElement mobImg;
	
	@FindBy(xpath=("//button[text()='Add to cart']"))
	private WebElement addct;
	
	public WebElement getTxtSer() {
		return txtSer;
	}

	public WebElement getMobImg() {
		return mobImg;
	}

	public WebElement getAddct() {
		return addct;
	}	
}
