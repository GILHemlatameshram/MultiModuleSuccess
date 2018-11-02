package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;

public class StartPage extends TestBase{
	@FindBy(xpath ="//*[@id='jriTop_signin9']")
	WebElement signInLink;
	
	@FindBy(xpath="//*[@id='signup-link9']")
	WebElement createNewAcctLink;
	
	public StartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public SignInPage clickSignIn()
	{
		SignInPage signInPage = new SignInPage(); 
		signInLink.click();
		return signInPage;
	}
	
	public String validateTitle()
	{
		return driver.getTitle();
	}
}
