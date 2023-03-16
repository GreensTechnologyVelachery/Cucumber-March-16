package org.stepdefinition;

import org.base.cls.BaseClass;
import org.junit.Assert;
import org.pojo.cls.LoginPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin extends BaseClass {
	
	LoginPOJO l;
	
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	    
		browserLaunch("Edge");
		maxWindow();
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
	    
		launchUrl("https://www.facebook.com/");
	}
	
	@When("To click the login button")
	public void to_click_the_login_button() {
	    
		clickWebElement(l.getLoginBtn());
	}
 
	
	@When("To pass the ivalid password in password field")
	public void to_pass_the_ivalid_password_in_password_field() {
	    
		passTheTxt(l.getPassword(), "347654");
	}

	
	
	@When("To pass the invalid username in email field")
	public void to_pass_the_invalid_username_in_email_field() {
	    
		l = new LoginPOJO();
		passTheTxt(l.getEmailTxt(), dbDatas());
	}


	@Then("To close the browser")
	public void to_close_the_browser() {
	    
		closeBrowser();
	}

	
	
}
