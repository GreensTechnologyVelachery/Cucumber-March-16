package org.pojo.cls;

import org.base.cls.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass {

	// Maintain login page webelements alone

	// 1. Non parametrized constructor
	public LoginPOJO() {

		PageFactory.initElements(driver, this);
	}

	// 2. Private WebElements
	// WebElement emailTxt = driver.findElement(By.id("attributeValue"));

	@CacheLookup
	@FindBy(id = "email")
	private WebElement emailTxt;

	@CacheLookup
	@FindBy(name = "pass")
	private WebElement password;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginBtn;

	// 3. Getters to access those private WebElements outside the class

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
