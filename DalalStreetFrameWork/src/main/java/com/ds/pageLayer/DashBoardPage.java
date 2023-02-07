package com.ds.pageLayer;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	public DashBoardPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement search_btn;
	
	@FindBy(xpath="(//div[@class='m-4 card'])[2]")
	private WebElement click_on_option;
	
	@FindBy(xpath="//a[text()='Transactions']")
	private WebElement click_on_transaction;
	
	@FindBy(xpath="//span[text()='Pragati']")
	private WebElement click_on_dropdown;
	
	@FindBy(xpath="//span[text()='Power Off']")
	private WebElement click_on_logoff;
	
	public void ClickonSearchBox(String company)
	{
		search_btn.sendKeys(company);
	}
	
	public void clickonOption()
	{
		click_on_option.click();
	}
	
	public void clickonTransaction()
	{
		click_on_transaction.click();
	}
	public void clickondropdown()
	{
		click_on_dropdown.click();
	}
	
	public void clickonlogoff()
	{
		click_on_logoff.click();
	}

}
