package org.amazostep;

import java.util.List;

import org.amazon.AmazonLocat;
import org.amazon.AmazonMethod;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStep extends AmazonMethod{
	
	AmazonLocat al;
	Assert a;
	
	@Given("Open Chrome browser and Amazon Application")
	public void openChromeBrowserAndAmazonApplication() {
		
		openBrows();
		maxi();
		getUrl("https://www.amazon.com/");
	}

	@When("User have to click create new account")
	public void userHaveToClickCreateNewAccount() {
		
		al = new AmazonLocat();
		al.getSlect().click();
		al.getCliacc().click();
		al.getCli().click();
	}

	@When("passing the first name")
	public void passingTheFirstName(io.cucumber.datatable.DataTable dataTable) {
	
	}

	@When("passing the mobile number")
	public void passingTheMobileNumber(io.cucumber.datatable.DataTable dataTable) {
	
	}

	@When("creating password and reconfimation password")
	public void creatingPasswordAndReconfimationPassword() {
				
	}

	@Then("User have to click continue")
	public void userHaveToClickContinue() {
		
	}

}
