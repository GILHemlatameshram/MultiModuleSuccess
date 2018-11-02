package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;

public class SignInPage extends TestBase{

	@FindBy(xpath = "//*[@id='txtUserName']")
	WebElement email;
	
	@FindBy(css = "#txtPasswd")
	WebElement password;
	
	@FindBy(css = "#imgbtnSignin")
	WebElement secureSignBtn;
	
	public SignInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public MyAcctPage clickSecureSignIn()
	{
		MyAcctPage myAcctPage = new MyAcctPage();
		secureSignBtn.click();
		return myAcctPage;
	}
	
	public SignInPage enterCredentials()
	{
		email.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		return this;
	}
}
