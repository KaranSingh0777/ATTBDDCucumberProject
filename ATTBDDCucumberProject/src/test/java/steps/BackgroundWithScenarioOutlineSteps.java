package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundWithScenarioOutlineSteps {
	
	@Given("user should be at profile page")
	public void user_should_be_at_profile_page() {
	   System.out.println("Given statement ");
	}

	@When("User enter first name as {string}")
	public void user_enter_first_name_as(String fname) {
	    System.out.println("When statement for Firstname "+fname);
	}

	@When("User enter last name as {string}")
	public void user_enter_last_name_as(String lname) {
	    System.out.println("When statement for lastname "+lname);
	}

	@When("user enter City name as {string}")
	public void user_enter_City_name_as(String cty) {
	    
		System.out.println("When statment for City "+cty);
	}

	@Then("profile get created")
	public void profile_get_created() {
	   System.out.println("Then Statement");
	}


}
