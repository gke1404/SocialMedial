package org.flipkartstep;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.flipkart.FlipkartLocat;
import org.flipkart.FlipkartMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartStep extends FlipkartMethod {

	FlipkartLocat fl;

	@Given("To Open Flipkart through Chrome")
	public void toOpenFlipkartThroughChrome() {

		openBrowser();
		maxi();
		getUrl("https://www.flipkart.com/");
	}

	@When("User have to search iphone")
	public void userHaveToSearchIphone() throws AWTException {

		fl = new FlipkartLocat();
		Robot r = new Robot();
		WebElement txtSer = fl.getTxtSer();

		sendValue(txtSer, "iphone 15pro max");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("User have to click iphone model")
	public void userHaveToClickIphoneModel() {

		fl = new FlipkartLocat();
		WebElement mobImg = fl.getMobImg();

		Actions a = new Actions(driver);
		a.moveToElement(mobImg);
		mobImg.click();
	}

	@When("User have to add the idem into add cart")
	public void userHaveToAddTheIdemIntoAddCart() {

		fl = new FlipkartLocat();

		String winHand = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String eachId : windowHandles) {
			if (!eachId.equals(winHand)) {
				driver.switchTo().window(eachId);

				fl.getAddct().click();
			}
		}
	}

	@Then("to close the browser")
	public void toCloseTheBrowser() {

	}

}
