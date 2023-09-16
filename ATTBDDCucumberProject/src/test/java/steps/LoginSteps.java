package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is at login screen")
	public void preconditions() {
		
		System.out.println("Preconditions for Given statement");
		
	}
	
	
	@When("user enters username")
	public void enteringusername() {
		
		System.out.println("Entering Username");
	}
	
	@When("user enters password")
	public void enteringpassword() {
		System.out.println("Entering password");
	}
	
	@When("user clicks on login button")
	public void clickOnLogin() {
		System.out.println("Clicking on Login");
	}
	
	@Then("user should get logged in")
	public void validateLogin() {
		
		System.out.println("User should be Logged in");
	}
	
	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() {
	    System.out.println("Given statement for title verification");
	}

	@Then("Title of page should be pagetitle")
	public void title_of_page_should_be_pagetitle() {
		System.out.println("Then statement for title verification");
	}


	
	
}
