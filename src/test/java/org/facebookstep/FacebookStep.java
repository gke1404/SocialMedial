package org.facebookstep;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.facebook.FacebookLocat;
import org.facebook.FacebookMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookStep extends FacebookMethod{
	
	FacebookLocat fb;
	
	@Given("To Open Facebook through Chrome")
	public void toOpenFacebookThroughChrome() {
		
//		openBrowser();
		getUrl("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("User have to click create new account button")
	public void userHaveToClickCreateNewAccountButton() {
		
		fb = new FacebookLocat();
		fb.getCretbut().click();
	}

	@When("User have to pass the first name")
	public void userHaveToPassTheFirstName(io.cucumber.datatable.DataTable dataTable) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		fb = new FacebookLocat();
		WebElement first = fb.getFirst();
		
		List<String> asList = dataTable.asList();
		sendValue(first, asList.get(2)); //GKE
	}

	@When("To user have to pass the last name")
	public void toUserHaveToPassTheLastName(io.cucumber.datatable.DataTable dataTable) {
		
		fb = new FacebookLocat();
		WebElement last = fb.getLast();
		
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		sendValue(last, asMap.get("no2")); //MSDVJ
	}

	@When("To user have to pass the mobile number")
	public void toUserHaveToPassTheMobileNumber(io.cucumber.datatable.DataTable dataTable) {
		
		fb = new FacebookLocat();
		WebElement mob = fb.getMob();
		
		List<Map<String,String>> asMaps = dataTable.asMaps();
		sendValue(mob, asMaps.get(1).get("mob4")); //9001090100
	}

	@When("To user have to enter the password")
	public void toUserHaveToEnterThePassword(io.cucumber.datatable.DataTable dataTable) {
		
		fb = new FacebookLocat();
		WebElement pass = fb.getPass();
		
		List<List<String>> asLists = dataTable.asLists();
		sendValue(pass, asLists.get(2).get(1)); //7010070100
	}

	@When("user have to enter birthday date")
	public void userHaveToEnterBirthdayDate() {
		
		fb = new FacebookLocat();
		
		Select s = new Select(fb.getDat());
		if (s.isMultiple()) {
			System.out.println("Date is Multiple Option");
		}else {
			System.out.println("Single Option");
		}
		s.selectByValue("22");
	}

	@When("user have to enter birthday month")
	public void userHaveToEnterBirthdayMonth() {
		
		fb = new FacebookLocat();
		
		Select s = new Select(fb.getMon());
		if (s.isMultiple()) {
			System.out.println("Month is Multiple Option");
		}else {
			System.out.println("Single Option");
		}
		s.selectByVisibleText("Nov");
	}

	@When("user have to enter birthday year")
	public void userHaveToEnterBirthdayYear() {
		
		fb = new FacebookLocat();
		
		Select s = new Select(fb.getYer());
		if (s.isMultiple()) {
			System.out.println("Year is Multiple Option");
		} else {
			System.out.println("Single Option");
		}
		s.selectByValue("1995");
	}

	@When("User have to click the gender  option")
	public void userHaveToClickTheGenderOption() {
		
		fb = new FacebookLocat();
		fb.getGend().click();
	}

	@When("click the sign up button")
	public void clickTheSignUpButton() {
		
		fb = new FacebookLocat();
		fb.getSub().click();
		
		System.out.println("Submit button has clicked but account not created");
	}

	@Then("Close the browser")
	public void closeTheBrowser() {
		
	}

}
