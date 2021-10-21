package stepDefinitions;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends Base{
	
	// each step in senario should have one java method associated with that step.
	// we can't have duplicate methods for steps in senario steps.
	@Given ("^user is on Retail website$")
	public void user_is_on_Retail_website() {
		
		
	}
	
	@ When("^user click on Myaccount$")
	public void user_clic_on_Myaccount() {
	}
	@And("^user click on Login option$")
	public void user_click_on_Login_option(){

	}@And("^user enter userName '(.+)' and password '(.+)'$")
	public void user_enter_userNmae_and_password(String uName, String pass){

	}
	@And("^user click on Login Button$")
public void user_click_on_Login_Button() {

	}
	@Then("^user should be loged in to Myaccount dashboard$")
	public void user_should_be_loged_in_to_Myaccount_dashboard() {

	}
	
	
}
