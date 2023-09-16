package appFeatures;

import io.cucumber.java.en.When;
import pages.SearchPage;
import qa.DriverFactory;

public class SearchSteps {
	
	SearchPage sp = new SearchPage(DriverFactory.getDriver());
	
	@When("User enter product name as {string}")
	public void user_enter_product_name_as(String prod) {
	   sp.searchproduct(prod);
	}
	@When("User enter on search button")
	public void user_enter_on_search_button() {
		sp.clickonSearch();
		
	}
}
