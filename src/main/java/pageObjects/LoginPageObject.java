package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class LoginPageObject extends Base {

	/**
	 * In this class we will store UI elements of Login page. we will implement
	 * PageFactory.initElement method to initialize the page elements we will
	 * use @FindBy annotations to sotre UI WebElements WE will store UI elements as
	 * Private WebElements and access them through public methods and we will write
	 * the funcction inside the public methods.
	 */

	/**
	 * This constructor will use to initialize the WebElements inside this POM class
	 * we will create PageFactory.initElements method inside the constructor
	 */

	public LoginPageObject() {
		PageFactory.initElements(driver, this);

	}

	// PageFactory class provides an annotation @Find UI elements
	// @Find == driver.findElement()
	@FindBy(xpath = "//span[text()= 'My Account' ]")
	private WebElement myAccount;
	@FindBy(xpath = "//a[text()= 'Login']")
	private WebElement login;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountText;

	public void clickOnMyAccount() {
		myAccount.click();

	}

	public void clickOnLogin() {
		login.click();
	}

	public void enterEmailAndPassword(String emailValue, String PasswordValue) {
		email.sendKeys(emailValue);
		password.sendKeys(PasswordValue);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public String myAccountTextisPresent() {
		String message = myAccountText.getText();
		return message;
		
//		if (myAccountText.isDisplayed())
//			return true;
//
//		else
//			return false;

	}

}
