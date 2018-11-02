package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import junit.framework.Assert;

public class MyAcctPage extends TestBase {
	@FindBy(id="jriTop_lblUserMsg")
	WebElement profileName;
	
	public MyAcctPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyUserAcctName()
	{
		//Verify if profile name is displayed and its value
		Assert.assertEquals(true, profileName.isDisplayed());
		Assert.assertEquals("Hello! Hemlata", profileName.getText());
	}
}
