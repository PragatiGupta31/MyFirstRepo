package com.ds.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() throws FileNotFoundException
	{
		String path="C:\\Users\\AK\\eclipse-workspace\\DalalStreetFrameWork\\src\\test\\resources\\config\\config.properties";
	
		
		try 
		{
			File file=new File(path);
			FileInputStream fis=new FileInputStream(file);
			pro=new Properties();
			pro.load(fis);
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}	
	public String getApplicationUrl()
	{
		return pro.getProperty("url");
	}
	
	
	
	}
	
