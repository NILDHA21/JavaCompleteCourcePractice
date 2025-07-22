package com.ka.practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KA19LoginPageTestCase {
	WebDriver driver;
	KA19POM lp;
	
	@BeforeMethod
	void setUp()
	{
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		lp = new KA19POM(driver);
	}
	@Test
	void testValidCredentials()
	{
		lp.username("Admin");
		lp.password("admin123");
		lp.signin();
		Assert.assertEquals(lp.title(), "null");
	}
}
