package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name = "username") WebElement txtEmail;
	@FindBy(name = "password") WebElement txtPassword;
	@FindBy(id = "login-remember") WebElement checkRemember;
	@FindBy(name = "submit") WebElement btnLoginIn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	public void email(String Email) {
		txtEmail.sendKeys(Email);
	}
	public void password(String pass) {
		txtPassword.sendKeys(pass);
	}
	public void remember() {
		checkRemember.click();
	}
	public void loginIn() {
		btnLoginIn.click();
	}
}
