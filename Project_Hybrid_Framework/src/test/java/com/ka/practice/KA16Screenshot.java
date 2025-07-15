package com.ka.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;  // ✅ import correct class
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class KA16Screenshot {

	public static void main(String[] args) {
		
		//Total page screenshot
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		TakesScreenshot tks = (TakesScreenshot) driver;
		File sourceFile = tks.getScreenshotAs(OutputType.FILE);
		File targetFile = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\google.png");
		
		try {
			FileHandler.copy(sourceFile, targetFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		//Element screenshot
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		File eleSourceFile = ele.getScreenshotAs(OutputType.FILE);
		File eleTargetFile = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\image.png");
		try {
			FileHandler.copy(eleSourceFile, eleTargetFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}