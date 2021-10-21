package pageObjects;

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
	 *we will create PageFactory.initElements method inside the constructor 
	 */

	public LoginPageObject() {
PageFactory.initElements(driver, this);

	}
	//PageFactory class provides an annotation @Find UI elements 
	//@Find == driver.findElement()

}
