package com.ds.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getdashboardurl()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	
	public void ScrollDown()
	{
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,120)");
	}
	
	public String readData(int sheet_index,int row_index,int cell_num) throws IOException
	{
		String path="C:\\Users\\AK\\OneDrive\\Desktop\\dalalstreet data.xlsx";
		
		File fl=new File(path);
		FileInputStream fis=new FileInputStream(fl);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		String username=wb.getSheetAt(sheet_index).getRow(row_index).getCell(cell_num).getStringCellValue();
		return username;
	}
	
	public static void TakeSS(String fileName) 
	{
		
	String path="C:\\Users\\AK\\eclipse-workspace\\DalalStreetFrameWork\\screenshots\\";
	
	try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(path+fileName +".png");
		FileHandler.copy(src, des);
	    }
	catch (IOException e) 
	{
		System.out.println("file path is not correct");
		e.printStackTrace();
	}
	
	}
	
}
