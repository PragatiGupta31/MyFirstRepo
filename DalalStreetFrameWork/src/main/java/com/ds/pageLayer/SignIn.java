package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase;

public class SignIn extends TestBase {
	
	public SignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//h5[text()='Already have an account. Log In?']")
//	private WebElement log_in_btn;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement enter_email;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement enter_password;
	
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	private WebElement submit_btn;
	
//	public void ClickOnSignin()
//	{
//		log_in_btn.click();
//	}
	
	public void Enteremail(String email)
	{
		enter_email.sendKeys(email);
	}
	
	public void Enterpassword(String password)
	{
		enter_password.sendKeys(password);
	}
	
	public void Clickonloginbtn()
	{
		submit_btn.click();
	}
	

}
