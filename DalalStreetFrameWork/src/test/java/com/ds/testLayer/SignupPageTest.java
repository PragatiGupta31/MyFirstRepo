package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.SignupPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class SignupPageTest extends TestBase {
	
	@Test
	public void SignUpwithCorrectID() throws InterruptedException
	{
		String expected_output="https://apps.dalalstreet.ai/dashboard";
		SignupPage signup_obj=new SignupPage(driver);
		UtilClass util_obj=new UtilClass();
		util_obj.ScrollDown();
		
		signup_obj.EnterFirstName("Pragati");
		signup_obj.EnterLastName("Gupta");
		signup_obj.EnterEmail("pragati.tafri@gmail.com");
		signup_obj.EnterPassword("Pragati@31");
		signup_obj.ClickOnTermsCondition();
		
		
		signup_obj.clickonSignUp();
		Thread.sleep(5000);
		
		Assert.assertEquals(util_obj.getdashboardurl(),expected_output);
	}
	
	

}
