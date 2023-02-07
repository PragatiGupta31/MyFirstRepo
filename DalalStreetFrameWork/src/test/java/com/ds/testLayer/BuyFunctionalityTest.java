package com.ds.testLayer;

import java.io.IOException;

import org.testng.annotations.Test;
import com.ds.testBase.TestBase;


public class BuyFunctionalityTest extends TestBase {
	
	@Test
	public void BuynewStock() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		buy_obj.ClickonSearchBox("Wipro");
		Thread.sleep(2000);
		buy_obj.clickonOption();
		
		Thread.sleep(2000);
		xcg_obj.ClickOnBuyButton();
		xcg_obj.EnterQuantity("3");
		util_obj.ScrollDown();
		Thread.sleep(2000);
		xcg_obj.ClickonBuyButton1();
		Thread.sleep(2000);
		
		logger.info("Status is " + xcg_obj.GetText());
		
		
		
	
		
	}

}
