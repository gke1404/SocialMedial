package org.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLocat extends AmazonMethod {

	public AmazonLocat() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//span[text()='Account & Lists']"))
	private WebElement slect;

	@FindBy(xpath = ("//a[@id=\"createAccountSubmit\"]"))
	private WebElement cliacc;

	@FindBy(xpath = ("//input[@type=\"text\"]"))
	private WebElement firnam;

	@FindBy(xpath = ("//i[@class=\"a-icon a-icon-dropdown\"]"))
	private WebElement cli;

	@FindBy(xpath = ("//input[@name=\"password\"]"))
	private WebElement txtpass;

	@FindBy(id = "continue")
	private WebElement verifnu;

	public WebElement getSlect() {
		return slect;
	}

	public WebElement getCliacc() {
		return cliacc;
	}

	public WebElement getFirnam() {
		return firnam;
	}

	public WebElement getCli() {
		return cli;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getVerifnu() {
		return verifnu;
	}
}
