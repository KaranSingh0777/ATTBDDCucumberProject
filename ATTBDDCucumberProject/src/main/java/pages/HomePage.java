package pages;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
WebDriver driver;	

@FindBy(xpath="//a[@class='a-link-normal']/child::img[@alt='Shop Computers and Accessories']")
private WebElement Summerdealcarosal;

@FindBy(xpath="//*[@id='nav-cart-count']")
private WebElement CardIcon;

@FindBy(xpath="//*[@id='nav-link-accountList']")
private WebElement AccountSignin;
	
@FindBy(xpath="//div[@id='nav-flyout-ya-signin']//*[@class='nav-action-inner']")
private WebElement Signinhoverbutton;

@FindBy(xpath="//input[@id='ap_email']")
private WebElement emailfield;

@FindBy(xpath="//input[@id='continue']")
private WebElement ContinueButton;

@FindBy(xpath="//input[@id='ap_password']")
private WebElement passwordfield;

@FindBy(xpath="//input[@id='signInSubmit']")
private WebElement finalsiginbutton;

WebDriverWait wait;
public HomePage(WebDriver driver) {
	this.driver = driver;
	
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(100));
}

public String getTitleOfPage() {
	
	String title = driver.getTitle();
	return title;
	
}

public boolean verifycart() {
	boolean isdispalyed = CardIcon.isDisplayed();
	return isdispalyed;
}

public void goToSigninPage() {
	
	Actions act = new Actions(driver);
	act.moveToElement(AccountSignin).build().perform();
	
	Signinhoverbutton.click();	
}

public void enterUsername(String uname) {
	emailfield.sendKeys(uname);
	ContinueButton.click();
	
}

public void finalSignin(String pwd) {
	passwordfield.sendKeys(pwd);
	finalsiginbutton.click();
}

public void enterToSummerDeals() {
	wait.until(ExpectedConditions.visibilityOf(Summerdealcarosal));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", Summerdealcarosal);
	
}


}
