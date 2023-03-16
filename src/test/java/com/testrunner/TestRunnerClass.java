package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.reporter.JvmRepo;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources" , 
                 glue = "org.stepdefinition" ,
                 monochrome = true ,
                 dryRun = false ,
                 strict = true ,
                 snippets = SnippetType.CAMELCASE ,
                 plugin = {"html:target" , 
                		   "junit:Junit Reports\\junitrepo.xml" ,
                		   "json:Json Reports\\jsonrepo.json" ,
                		   "rerun:failed\\failedscenarios.txt"})
public class TestRunnerClass { 

	@AfterClass
	public static void report() {

		JvmRepo.jvmReportGeneration("C:\\Users\\VISHAL\\New\\Cucumber_11am\\Json Reports\\jsonrepo.json");
	}
}
