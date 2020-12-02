package com.stepsdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
		"json:target/cucumber-reports/cucumber.json"}, 
		features = "src/test/resources/",
		glue = "com.stepsdefinitions",
		//tags = {"@Get1"},
		monochrome = false)
public class RunCakeTest {

}
