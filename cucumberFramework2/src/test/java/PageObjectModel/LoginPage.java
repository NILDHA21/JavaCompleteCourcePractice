package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(name = "username") WebElement txtusername;
	@FindBy(name = "password") WebElement txtpassword;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement btnlogin;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	public void username(String uname) {
		wait.until(ExpectedConditions.elementToBeClickable(txtusername));
		txtusername.sendKeys(uname);
	}
	public void password(String pass) {
		wait.until(ExpectedConditions.elementToBeClickable(txtpassword));
		txtpassword.sendKeys(pass);
	}
	public void login() {
	    wait.until(ExpectedConditions.elementToBeClickable(btnlogin));
		btnlogin.click();
	}
}
