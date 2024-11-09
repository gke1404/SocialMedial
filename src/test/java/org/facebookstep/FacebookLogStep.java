package org.facebookstep;

import org.facebook.FacebookLocat;
import org.facebook.FacebookMethod;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLogStep extends FacebookMethod{

	FacebookLocat fb;

	@When("User have to pass the username {string} data")
	public void userHaveToPassTheUsernameData(String string) {
		
		fb = new FacebookLocat();
		WebElement user = fb.getUser();
		sendValue(user, string);
	}

	@When("User have to pass the password {string} data")
	public void userHaveToPassThePasswordData(String string) {
		
		fb = new FacebookLocat();
		WebElement passw = fb.getPassw();
		sendValue(passw, string);
	}

	@When("To click the login button")
	public void toClickTheLoginButton() {
		
		fb = new FacebookLocat();
		fb.getLog().click();
		System.out.println("Wrong Credential");
	}

	@Then("to close the browser")
	public void toCloseTheBrowser() {
		
//		closebrowser();
	}

}
