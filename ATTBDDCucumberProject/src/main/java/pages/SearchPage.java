package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;	

	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	private WebElement searchbox;

	@FindBy(xpath="//*[@id='nav-search-submit-button']")
	private WebElement searchicon;

	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchproduct(String text)
	{
		searchbox.sendKeys(text);
		searchicon.click();
	}
	public void clickonSearch()
	{
		searchicon.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
