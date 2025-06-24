package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pages.LoginPage;
import com.utilities.configFile;

public class BaseClass {

	public static WebDriver driver;
	public LoginPage lp;
	@BeforeMethod
	public void setUp() throws Exception
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
		String URL = configFile.readConfig("url");
		driver.get(URL);
		lp = new LoginPage(driver);
	}
	@AfterMethod
	void tearDown()
	{
		driver.quit();
	}
}
