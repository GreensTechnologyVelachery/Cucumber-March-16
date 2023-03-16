package org.pojo.cls;

import org.base.cls.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPOJO extends BaseClass {
	
	public AmazonPOJO() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ap_email")
	private WebElement userName;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	@FindBy(id = "ap_password")
	private WebElement passField;
	
	@FindBy(id = "signInSubmit")
	private WebElement signIn;
 
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getPassField() {
		return passField;
	}

	public WebElement getSignIn() {
		return signIn;
	}
}
