package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObject;
import utilities.UtilityClass;

public class LoginStepDef extends Base {
	
	LoginPageObject login = new LoginPageObject();

	// each step in senario should have one java method associated with that step.
	// we can't have duplicate methods for steps in senario steps.
	@Given("^user is on Retail website$")
	public void user_is_on_Retail_website() {
		String actualPageTitile = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		// Assertion is to verify actual meets the expected
		// if actual does not equals to expected value then execution will stop
		// and test step will fail.
		Assert.assertEquals(expectedPageTitle, actualPageTitile);
		logger.info("Actual Title is matching with expected title");
		UtilityClass.takeScreenShot();

	}

	@When("^user click on Myaccount$")
	public void user_clic_on_Myaccount() {
		login.clickOnMyAccount();
		logger.info("user clicked on MyAccount");
	}

	@And("^user click on Login option$")
	public void user_click_on_Login_option() {
		login.clickOnLogin();
		logger.info("user clicked on Login Option");
		UtilityClass.takeScreenShot();

	}

	@And("^user enter userName '(.+)' and password '(.+)'$")
	public void user_enter_userNmae_and_password(String uName, String pass) {
		login.enterEmailAndPassword(uName, pass);
		logger.info("user Enter " + uName + "and password " + pass);
		UtilityClass.takeScreenShot();
	}

	@And("^user click on Login button$")
	public void user_click_on_Login_Button() {
		login.clickOnLoginButton();
		logger.info("user clicked on Login Button");

	}

	@Then("^user should be loged in to Myaccount dashboard$")
	public void user_should_be_loged_in_to_Myaccount_dashboard() {
		// if myAccountText is present it will pass
		// if myAccountText is not present it will fail
//		Assert.assertTrue(login.myAccountTextisPresent());
		String actual = "My Account";
		String expected = login.myAccountTextisPresent();
		Assert.assertEquals(expected, actual);
		
		logger.info("user is logged in to MyAccount Dashboard");
		UtilityClass.takeScreenShot();
	}

}
