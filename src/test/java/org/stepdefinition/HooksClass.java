package org.stepdefinition;

import org.base.cls.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before(order = 10)
	public void preCondition1() {
		System.out.println("2. Window Maximize");
		maxWindow();
	}

	@Before(order = 5)
	public void preCondition2() {
		browserLaunch("Chrome");
		System.out.println("1. Browser Launch");
	}

	// each scenarios before once after once it will execute for all feature files

	@After(order = 3)
	public void postCondition1() {
		System.out.println("5. Close the browser");
		closeBrowser();
	}
	
	@After(order = 10)
	public void postCondition2(Scenario s) { 

		if (s.isFailed()) {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] sc = ts.getScreenshotAs(OutputType.BYTES); 
			s.embed(sc, "image/png");
		}
	}

}
