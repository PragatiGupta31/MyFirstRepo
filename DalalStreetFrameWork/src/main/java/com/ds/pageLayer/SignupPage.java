package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase;

public class SignupPage extends TestBase {
	
	public SignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='formrow-firstname-Input']")
	private WebElement first_name_txtbox;
	
	@FindBy (xpath="//input[@id='formrow-lastname-Input']")
	private WebElement last_name_txtbox;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_id_textbx;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement password_txtbx;
	
	@FindBy(xpath="//input[@id='customControlInline']")
	private WebElement click_terms_condition;
	
	@FindBy(xpath="//button[@class='btn btn-success btn-block']")
	private WebElement get_journey_start;
	
	public void EnterFirstName(String firstname)
	{
		first_name_txtbox.sendKeys(firstname);
	}
	public void EnterLastName(String lastname)
	{
		last_name_txtbox.sendKeys(lastname);
	}
	public void EnterEmail(String email)
	{
		email_id_textbx.sendKeys(email);
	}
	public void EnterPassword(String password)
	{
		password_txtbx.sendKeys(password);
	}
	public void ClickOnTermsCondition()
	{
		click_terms_condition.click();
	}
	public void clickonSignUp()
	{
		get_journey_start.click();
	}
	

}
