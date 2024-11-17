package org.sdstep;

import org.sd.SdMet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SdStep extends SdMet{

	
	@Given("Open the Snapdeal website")
	public void openTheSnapdealWebsite() throws InterruptedException {
	
		Thread.sleep(2000);
		openBrow();
		getURl("https://www.amazon.com/");
	}

	@Given("Enter the productnaem and hit the searchbox")
	public void enterTheProductnaemAndHitTheSearchbox() {
		
		System.out.println("hi");
		
	}

	@When("Hit the men option")
	public void hitTheMenOption() {
		
	}

	@When("Click the Casual shoes")
	public void clickTheCasualShoes() {
		
	}

	@When("Select the product and size add to the bag")
	public void selectTheProductAndSizeAddToTheBag() {
		
	}

	@Then("Click the bag option")
	public void clickTheBagOption() {
		
	}

	@Then("Click Place the Order button")
	public void clickPlaceTheOrderButton() {
		
	}
}
