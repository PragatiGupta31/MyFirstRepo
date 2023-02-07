package com.ds.testBase;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashBoardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.SignIn;
import com.ds.pageLayer.TransactionPage;
import com.ds.utilities.ReadConfig;
import com.ds.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver;
	
	public SignIn sg_obj;
	public UtilClass util_obj;
	public DashBoardPage buy_obj;
	public ExchangePage xcg_obj;
	public TransactionPage tran_obj;
	public static Logger logger;
	
	@BeforeTest
	public void start()
	{
	logger=Logger.getLogger("DalalStreet Automation Framework");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Framework Execution Started");
	}
	
	@AfterTest
	public void end()
	{
		logger.info("Framework Execution Stopped");
	}
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String br) throws FileNotFoundException 
	{
		
		if(br.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser name");
		}
		
		ReadConfig read_config=new ReadConfig();
		
		driver.get(read_config.getApplicationUrl());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("Brwoser Launches url, maximize window");
		//----------------object creation------
		sg_obj= new SignIn(driver);
		util_obj=new UtilClass();
		buy_obj=new DashBoardPage(driver);
		xcg_obj= new ExchangePage(driver);
		tran_obj=new TransactionPage(driver);
		logger.info("object Creation");
		//login steps-------------
		
		try {
			String data = util_obj.readData(0,1,0);
			String data1=util_obj.readData(0, 1, 1);
			sg_obj.Enteremail(data);
			sg_obj.Enterpassword(data1);
			sg_obj.Clickonloginbtn();
			logger.info("Login the application");
		 } 
		catch (IOException e) 
		{
			logger.info("login is not successfull");
			e.printStackTrace();
		}
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
