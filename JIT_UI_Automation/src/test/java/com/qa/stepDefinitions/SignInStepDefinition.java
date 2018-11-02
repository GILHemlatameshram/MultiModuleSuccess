package com.qa.stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.qa.util.LoggerHelper;
import com.qa.pages.MyAcctPage;
import com.qa.pages.SignInPage;
import com.qa.pages.StartPage;
import com.qa.util.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SignInStepDefinition extends TestBase{
	SignInPage signInPage;
	StartPage startPage;
	MyAcctPage myAcctPage;
	Logger log;
	
	@Before
	public void beforeScenario()
	{
		TestBase.initialization();		
		startPage = new StartPage();	
		log = LoggerHelper.getLogger(LoggerHelper.class);
		//Reporter.assignAuthor("Hemlata");
	}
	
	@After(order =1)
	public void afterScenario(Scenario scenario)  {
		if(scenario.isFailed())
		{
			String screenshotName = scenario.getName().replaceAll(" ", "-");
			try
			{
				File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				log.info("Directory name : "+System.getProperty("user.dir"));
				System.out.println( "************************" + System.getProperty("user.dir"));
				File destination = new File(System.getProperty("user.dir")+"/target/cucumber-reports/screenshots/"+screenshotName+".jpg");
				Files.copy(source, destination);
				//Reporter.addScreenCaptureFromPath(destination.toString());
			}
			catch(Exception e)
			{
				log.info(e.getMessage());
				System.out.println( "************************" );
				System.out.println(e.getMessage());
			}
		}		
	}
	@After(order=0)
	public void close_browser()
	{
		driver.quit();
	}
	
	@Given( "^User is on start page of JIT website$")
	public void user_On_start_page()
	{
		String title = driver.getCurrentUrl();
		log.info("Title of page : "+title);
		Assert.assertEquals(true, title.contains("justrechargeit"));
		//Reporter.addStepLog("This step assert 1should result in true value");
	}
	
	@When("^User clicks on Sign in link$")
	public void user_clicks_on_Sign_in_link() throws Throwable {
		startPage.clickSignIn();
		String title = startPage.validateTitle();
		log.info("Title of the sign in page : "+title);
		System.out.println("Title : "+title);
		
	}

	@Then("^User enters username and password to Sign in$")
	public void user_enters_username_and_password_to_Sign_in() throws Throwable {
		signInPage = new SignInPage();
	    signInPage.enterCredentials();
	    //Reporter.addStepLog("Credentials entered from the properties file");
	}

	@Then("^User clicks on Secure Sign In button$")
	public void user_clicks_on_Secure_Sign_In_button() throws Throwable {
	    signInPage.clickSecureSignIn();
	    //Assert.assertEquals(true, false);
	}

	@Then("^User open my accounts page$")
	public void user_open_my_accounts_page() throws Throwable {
		myAcctPage = new MyAcctPage();
	    myAcctPage.verifyUserAcctName();
	    log.info("Last step finished");
	    
	    //Reporter.addStepLog("Test case executed");	    
	}	
	
}
