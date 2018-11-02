package com.qa.runnerApi;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/MyStudy/BDD/JITAutomation/Api_Automation/src/main/resources/com/qa/featuresApi/OrgFeature.feature",
	glue = "com/qa/stepDefinitionsApi", 
	dryRun = false, strict = false, monochrome = true,	
	plugin = { "pretty", "html:target/cucumber"} 
)
public class ApiRunner {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("*************************************************");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("*************************************************");
	}
}