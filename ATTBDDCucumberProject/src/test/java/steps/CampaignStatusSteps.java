package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignStatusSteps {
	
	@Given("user is at campaign page")
	public void user_is_at_campaign_page() {
	    System.out.println("Given statement for given page");
	}

	@When("user click on campaign button")
	public void user_click_on_campaign_button() {
		System.out.println("When Statement for campaign button");
	   
	}

	@When("User enters the information")
	public void user_enters_the_information() {
	    System.out.println("when Statement to enter information ");
	}

	@When("user click on save button")
	public void user_click_on_save_button() {
	   System.out.println("Statement to click on save");
	}

	@Then("Campaign should get created")
	public void campaign_should_get_created() {
	    System.out.println("then Staement to create campaign");
	}

	@When("user click on edit campaign")
	public void user_click_on_edit_campaign() {
	    System.out.println("when statement to edit campaign");
	}

	@When("User enters the sending information")
	public void user_enters_the_sending_information() {
	    System.out.println("when for sending information");
	}

	@When("user click on Schedule button")
	public void user_click_on_schedule_button() {
	   System.out.println("when for scheduling ");
	}

	@Then("Campaign should get Schedule")
	public void campaign_should_get_schedule() {
		System.out.println("then for scheduling");
	    
	}

	@When("user click on sent campaign")
	public void user_click_on_sent_campaign() {
	   System.out.println("when for sent ");
	}

	@Then("user should see the sent count")
	public void user_should_see_the_sent_count() {
		System.out.println("then for sent");
	   
	}

}
