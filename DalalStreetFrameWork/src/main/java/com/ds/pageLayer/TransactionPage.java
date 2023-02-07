package com.ds.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

public class TransactionPage {
	
	public WebDriver driver;
	public TransactionPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getData()
	{
		String data = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
		System.out.println(data);
	}
	
	public void getAllData()
	{
		for(int i = 1;i<=8;i++)
		{
			for(int j=1;j<=9;j++)
			{
				String data = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data);
			}
			System.out.println();
		}
	}
}


