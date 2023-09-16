package appFeatures;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	

	HomePage homepage = new HomePage(DriverFactory.getDriver());
	@Given("User is at landing page")
	public void user_is_at_the_landing_page() {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://amazon.com");
		
	    
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String titleString) {
	   
		String title = homepage.getTitleOfPage();
		boolean ispresent = title.contains(titleString);
		
		Assert.assertTrue(ispresent);
	}

	@Then("cart icon should get displayed")
	public void cart_icon_should_get_displayed() {
	   boolean isdisplay = homepage.verifycart();
		
	   Assert.assertTrue(isdisplay);
	}

	@When("User click on summer section deal")
	public void user_click_on_summer_section_deal() {
	   homepage.enterToSummerDeals();
	}

	@When("User clicks on signin button")
	public void user_clicks_on_signin_button() {
	   homepage.goToSigninPage();
	}
	@When("User enters username as {string}")
	public void user_enters_username_as(String uname) {
	  homepage.enterUsername(uname);
	}

	@When("User enters password as {string} with signin")
	public void user_enters_password_as_with_signin(String pwd) {
	  homepage.finalSignin(pwd);
	}

	


}
