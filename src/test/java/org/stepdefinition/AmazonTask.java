package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.cls.BaseClass;
import org.pojo.cls.AmazonPOJO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonTask extends BaseClass {
	
	AmazonPOJO a;
	
	@Given("User has to launch the browser and maximize the browser")
	public void user_has_to_launch_the_browser_and_maximize_the_browser() {
	    
		browserLaunch("Chrome");
		maxWindow();
	}
	
	@When("User has to launch the amazon url")
	public void userHasToLaunchTheAmazonUrl() {
	    
		launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	@When("User has to pass the invalid username in email field")
	public void userHasToPassTheInvalidUsernameInEmailField(DataTable d) {
	    
		a = new AmazonPOJO(); 
		Map<String, String> m = d.asMap(String.class, String.class);
		passTheTxt(a.getUserName(), m.get("emailtwo"));
	}

	@When("User has to click the continue button")
	public void userHasToClickTheContinueButton() {
	    
		clickWebElement(a.getContinueBtn());
	}

	@When("User has to pass the invalid password in password field")
	public void userHasToPassTheInvalidPasswordInPasswordField(DataTable d) {
	    
		List<Map<String, String>> m = d.asMaps();
		passTheTxt(a.getPassField(), m.get(1).get("passwordtwo"));
	}

	@When("User has to click the signin button")
	public void userHasToClickTheSigninButton() {
	   
		clickWebElement(a.getSignIn());
	}
	
	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	    
		closeBrowser(); 
	}

}
