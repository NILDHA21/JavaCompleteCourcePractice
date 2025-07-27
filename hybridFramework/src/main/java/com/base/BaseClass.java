package com.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilities.configFile;

public class BaseClass {
	protected static WebDriver driver;
	public void setUp() throws Exception
	{
		String brName = configFile.readConfig("browser");
		
		if(brName.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		} else if(brName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		} else{
			System.out.println("Invalid Browser");
		}
		
		String URL = configFile.readConfig("url");
		driver.get(URL);
	}
}
