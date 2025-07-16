package com.ka.practice;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utilities.ReadExcel;

public class KA17DtataProvider {

	public static WebDriver driver;
	@BeforeMethod
	void setUp() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
	
	@Test(dataProvider ="td")
	
	void testValidInvalid(String username, String password) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@DataProvider(name = "td")
	public String[][] testData() throws IOException
	{
//		String arr[][] = new String[4][2];
//		arr[0][0] = "Admin";
//		arr[0][1] = "admin123";
//		arr[0][0] = "Adminn";
//		arr[0][1] = "admin123s";
//		arr[0][0] = "@#$%";
//		arr[0][1] = "%^&*";
//		arr[0][0] = " ";
//		arr[0][1] = " ";
//		return arr;
		
		//logic for excelsheet data
		String[][] rd = ReadExcel.readExcel();
		return rd;
		}
	
	public static void main(String[] args) {
		
	}

}
