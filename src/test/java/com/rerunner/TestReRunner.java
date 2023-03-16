package com.rerunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@failed\\failedscenarios.txt" ,
                 glue = "org.stepdefinition" ,
                 monochrome = true)
public class TestReRunner {

}
