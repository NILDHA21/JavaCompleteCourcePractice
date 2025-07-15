package com.ka.practice;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KA14WindowHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com/");
//		String window = driver.getWindowHandle();
//		System.out.print(window);
//		System.out.println();
		driver.findElement(By.linkText("Shopsy")).click();
		driver.findElement(By.linkText("Myntra")).click();
		
		Set<String> multipleWindows = driver.getWindowHandles();
		System.out.println(multipleWindows);

		String flipkartWindow = "", shopsyWindow = "", myntraWindow = "";
		
		Iterator<String> it = multipleWindows.iterator();
		
		String parentWindow = it.next();
		String shopsyShopsy = it.next();
//		String myntraWindow = it.next();
		
		System.out.println("This is flipkart id: " + parentWindow);
		System.out.println("This is Shopsy id: " + shopsyShopsy);
		System.out.println("This is Myntra id: " + myntraWindow);
		
		driver.switchTo().window(shopsyShopsy);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/div/div[1]/form/div[1]/label/div/input")).sendKeys("Hi Nilesh");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.quit();
		}
}
