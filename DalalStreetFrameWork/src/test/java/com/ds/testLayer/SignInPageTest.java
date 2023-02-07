package com.ds.testLayer;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ds.testBase.TestBase;

public class SignInPageTest extends TestBase {
	
	@Test
	public void loginwithcorrectID() throws IOException, InterruptedException
	{
	String expected_output="https://apps.dalalstreet.ai/dashboard";
	Thread.sleep(3000);
	util_obj.ScrollDown();
	Assert.assertEquals(util_obj.getdashboardurl(),expected_output);
	
	
	}
}
