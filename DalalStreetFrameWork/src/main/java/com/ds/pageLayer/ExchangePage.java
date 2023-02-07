package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExchangePage {
	
	public ExchangePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Buy']")
	private WebElement click_on_buy_btn;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement enter_quantity_txtbox ;
	
	@FindBy(xpath="//button[text()='Buy']")
	private WebElement click_buy_btn1 ;
	
	@FindBy(xpath="(//div[text()='Order Created successfully'])[1]")
	private WebElement get_text;
	
	public void ClickOnBuyButton()
	{
		click_on_buy_btn.click();
	}
	
	public void EnterQuantity(String quantity)
	{
		enter_quantity_txtbox.sendKeys(quantity);
		enter_quantity_txtbox.click();
	}
	
	public void ClickonBuyButton1()
	{
		click_buy_btn1.click();
	}
	
	public String GetText()
	{
		return get_text.getText();
	}

}
