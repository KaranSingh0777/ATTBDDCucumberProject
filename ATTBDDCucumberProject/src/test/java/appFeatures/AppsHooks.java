package appFeatures;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class AppsHooks {
	WebDriver driver;
	DriverFactory df;
	@Before
	public void launchBrowser() throws IOException {
		Properties pro = new Properties();
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		pro.load(fis);
		String browsername = pro.getProperty("browser");
	
		df = new DriverFactory();
		 driver = df.initBrowser(browsername);
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		
		driver.quit();
	}
	
	

}
