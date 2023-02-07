package com.ds.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ds.testBase.TestBase;

public class LogOutFunctionality extends TestBase{
	
	@Test
	public void ClickOnLogoff() throws IOException, InterruptedException
	{
		String expected_result = "https://apps.dalalstreet.ai/logout";
		Thread.sleep(4000);
		buy_obj.clickondropdown();
		buy_obj.clickonlogoff();
		
		Assert.assertEquals(util_obj.getdashboardurl(), expected_result);
	}
	

}
