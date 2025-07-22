package com.ka.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KA19POM {

	WebDriver driver;
	
	@FindBy (name = "username") WebElement txtusername;
	@FindBy (name = "password") WebElement txtpassword;
	@FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement txtsignin;
	
	public KA19POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);;
	}
	
	public void username(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void password(String pass)
	{
		txtpassword.sendKeys(pass);
	}
	
	public void signin()
	{
		txtsignin.click();;
	}
	
	public String title()
	{
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
}
