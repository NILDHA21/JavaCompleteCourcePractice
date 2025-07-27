package stepdefinitions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.BaseTest;

public class LoginSteps {
	
	WebDriver driver = BaseTest.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	
	@Given("User is on OrangeHRM login page")
	public void user_is_on_login_page() {
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enters valid username and password")
	public void enters_credentials() throws InterruptedException {
	    Thread.sleep(2000);
	    loginPage.enterUsername("Admin");
	    loginPage.enterPassword("admin123");
	}

	@When("Clicks on login button")
	public void clicks_login() {
	    loginPage.clickLogin();
	}

	@Then("User should be navigated to the dashboard")
	public void verify_dashboard() throws InterruptedException {
	    Thread.sleep(3000);
//	    boolean isDashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
//	    Assert.assertTrue("Dashboard is not displayed", isDashboard);
//	}
	 LoginPage loginPage = new LoginPage(driver);
	    Assert.assertTrue("Dashboard is not visible", loginPage.isDashboardVisible());
	}
}
