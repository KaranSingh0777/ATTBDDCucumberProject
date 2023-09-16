package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePictureSteps {

	@Given("user should be at home page")
	public void user_should_be_at_home_page() {
	    System.out.println("Given Statemnt");
	}

	@When("user click on add profile button")
	public void user_click_on_add_profile_button() {
	   System.out.println("when statement for add profile");
	}

	@When("upload the image")
	public void upload_the_image() {
	    System.out.println("When statemnt for Upload image");
	}

	@Then("profile should get added")
	public void profile_should_get_added() {
	   System.out.println("then statement for add profile");
	}

	@When("user click on edit link")
	public void user_click_on_edit_link() {
	    System.out.println("when statement for edit link ");
	}

	@When("update the image")
	public void update_the_image() {
	    System.out.println("when statement for update image");
	}

	@Then("profile should get upated")
	public void profile_should_get_upated() {
	   System.out.println("then statement for update profile");
	}

	@When("user click on delete profile button")
	public void user_click_on_delete_profile_button() {
	    System.out.println("When statement for delete profile");
	}

	@Then("profile should get deleted")
	public void profile_should_get_deleted() {
	    System.out.println("then statement for delete profile");
	}

	
}
