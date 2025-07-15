package com.ka.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KA13Frames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//By ID
//		driver.switchTo().frame(1);
//		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("iFrame by Nilesh");

		//By Name
//		driver.switchTo().frame("SingleFrame");
//		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("iFrame by Nilesh");
		
		//By Web Element
//		WebElement ele = driver.findElement(By.name("SingleFrame"));
//		driver.switchTo().frame(ele);
//		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("iFrame by Nilesh");

		//Nested frame
//		driver.switchTo().frame(innerFrame);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Nested iFrame by Nilesh");
		driver.quit();
	}
}
