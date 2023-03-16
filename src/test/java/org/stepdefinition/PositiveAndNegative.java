package org.stepdefinition;

import org.base.cls.BaseClass;
import org.pojo.cls.LoginPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveAndNegative extends BaseClass{
	
	LoginPOJO l;
	
	@Given("To launch the chrome browser and max the window")
	public void to_launch_the_chrome_browser_and_max_the_window() {
	    
		browserLaunch("Firefox");
		maxWindow();
	}

	@When("To launch the application url")
	public void to_launch_the_application_url() {
	   
		launchUrl("https://www.facebook.com/");
	}

	@When("To pass the positive or negative data {string} to email field")
	public void to_pass_the_positive_or_negative_data_to_email_field(String em) {
	    
		l = new LoginPOJO(); 
		passTheTxt(l.getEmailTxt(), em);
	}

	@When("To pass the positive or {string} negative data to password field")
	public void to_pass_the_positive_or_negative_data_to_password_field(String pass) {
	    
		passTheTxt(l.getPassword(), pass);
	}

	@When("To click the login")
	public void to_click_the_login() {
	    
		clickWebElement(l.getLoginBtn());
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    
		closeBrowser();
	}

}
