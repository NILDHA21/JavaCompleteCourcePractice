package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.utilities.configFile;

public class BaseClass {

	WebDriver driver;
	
	void setUp() throws Exception
	{
		String brName = configFile.readConfig("browser");
		if(brName.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}else if(brName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else if(brName.equalsIgnoreCase("ie")){
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("Invalid Browser");
		}
	}
}
