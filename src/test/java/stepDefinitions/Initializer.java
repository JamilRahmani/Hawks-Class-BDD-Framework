package stepDefinitions;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {

	// In this class we will define Before Hooks and After Hooks of Cucumber
	// Before hooks will run before each senario
	// After hooks will run After each senario

	@Before
	public void beforeHooks(Scenario senario) {

		browser();// This method comes from Base class and will lunch browser
		openBrowser();// This method comes from Base class and will lunch url

	}

	@After
	public void afterHooks(Scenario scenario ) {
		tearDown();

	}

}
