package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Applicationhooks {
	
	@Before
	public void beforeHook() {
		
		System.out.println("Before hook is executing");
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("Before Step is executing");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("after Step is executing");
	}

	@After
	public void afterHook() {
		System.out.println("After hook is executing");
	}
	
}
