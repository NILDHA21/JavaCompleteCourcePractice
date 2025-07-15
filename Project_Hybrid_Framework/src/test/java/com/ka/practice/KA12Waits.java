package com.ka.practice;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class KA12Waits {
	public static void main(String[] args) {
		System.out.println("1");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("2");
//		//Implicit Wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		//Explicit Wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("username")))).sendKeys("Admin");
//		OR
//		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("username"))));
//		username.sendKeys("Admin");
		
//		//Fluent Wait
		Wait<WebDriver> fluentWait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		WebElement username = fluentWait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.name("username"));
				}
		});
		
		username.sendKeys("Admin");
		System.out.println("3");
//		driver.findElement(By.name("username")).sendKeys("Admin");
		
		System.out.println("4");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		System.out.println("5");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		System.out.println("6");
		driver.quit();
	}
}