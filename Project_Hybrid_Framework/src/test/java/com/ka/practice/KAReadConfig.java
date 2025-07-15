package com.ka.practice;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KAReadConfig {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Project_Hybrid_Framework\\src\\main\\resources\\Config.properties");
		Properties pro = new Properties();
		pro.load(file);
		String browser = pro.getProperty("browser");
		String url = pro.getProperty("url");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
	}

}
