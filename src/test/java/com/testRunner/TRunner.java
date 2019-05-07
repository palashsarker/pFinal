package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\palsa\\eclipse-workspaceNew\\PleagueFinal\\src\\main\\resources\\League.feature",
		glue="com.stepsDef",
		dryRun=false,
		monochrome=true,
		strict=true
		
		
		
		)
public class TRunner extends AbstractTestNGCucumberTests {
	
	
	

}
