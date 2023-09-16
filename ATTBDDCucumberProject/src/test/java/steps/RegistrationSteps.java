package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {

	@Given("User should be at the registration Page")
	public void user_should_be_at_the_registration_page() {
	    System.out.println("Given statement ");
	}

	@When("User enters following information")
	public void user_enters_following_information(DataTable dataTable) {
		
	List<List<String>> data = dataTable.asLists();
		
	
	for(List<String> listvalue:data) {
		System.out.println(listvalue);
		
	}
	    
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
		System.out.println("when statement for submit button");
	   
	}

	@Then("User gets Created")
	public void user_gets_created() {
		System.out.println(" Then Statement");
	    
	}

	
	
}
