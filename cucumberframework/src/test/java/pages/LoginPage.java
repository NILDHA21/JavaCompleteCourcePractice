package pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//public class LoginPage {
//	WebDriver driver;
//	
//	private By username = By.name("username");
//	private By password = By.name("password");
//	private By loginButton = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
//	
//	public LoginPage(WebDriver driver) {
//		this.driver = driver;
//	}
//	
//	public void enterUsername(String user) {
////		driver.findElement(username).sendKeys(user);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
//	    usernameField.sendKeys(user);
//	}
//	public void enterPassword(String pass) {
////		driver.findElement(password).sendKeys(pass);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
//	    passwordField.sendKeys(pass);
//	}
//	public void clickLogin() {
////		driver.findElement(loginButton).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
//		loginBtn.click();
//	}
//}

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterUsername(String uname) {
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        usernameField.sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        passwordField.sendKeys(pwd);
    }

    public void clickLogin() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginBtn.click();
    }

    public boolean isDashboardVisible() {
        // Wait for dashboard element to load
        WebElement dashboardHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
        return dashboardHeader.isDisplayed();
    }
}
