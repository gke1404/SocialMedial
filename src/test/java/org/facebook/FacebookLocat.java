package org.facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLocat extends FacebookMethod {

	public FacebookLocat() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//a[text()='Create new account']"))
	private WebElement cretbut;

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement first;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement last;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement mob;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement pass;

	@FindBy(xpath = "//select[@id='day']")
	private WebElement dat;

	@FindBy(xpath = "//select[@id='month']")
	private WebElement mon;

	@FindBy(xpath = "//select[@id='year']")
	private WebElement yer;

	@FindBy(xpath = "(//input[@type=\"radio\"])[2]")
	private WebElement gend;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement sub;

	@FindBy(id = "email")
	private WebElement user;

	@FindBy(name = "pass")
	private WebElement passw;

	@FindBy(name = "login")
	private WebElement log;

	public WebElement getCretbut() {
		return cretbut;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getMob() {
		return mob;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getDat() {
		return dat;
	}

	public WebElement getMon() {
		return mon;
	}

	public WebElement getYer() {
		return yer;
	}

	public WebElement getGend() {
		return gend;
	}

	public WebElement getSub() {
		return sub;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassw() {
		return passw;
	}

	public WebElement getLog() {
		return log;
	}
}
