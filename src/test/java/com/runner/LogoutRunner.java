package com.runner;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(publish = true,plugin = { "pretty", "html:target/site/cucumber-pretty", "rerun:target/rerun.txt",
		"json:target/cucumber.json",
		},

		features = { "src/test/resources/logout.feature" }, 
		glue = { "com.stepdef" }, 
		monochrome = true, 
dryRun = true, 
strict = true
  )



public class LogoutRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void setup() {
		
	}
	

		 {

}}
