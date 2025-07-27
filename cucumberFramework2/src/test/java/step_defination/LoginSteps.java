package step_defination;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	LoginPage loginpage;
	
	@Given("user should open chrome browser")
	public void user_should_open_chrome_browser() {
	   driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   loginpage = new LoginPage(driver);
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		loginpage.username("Admin");
		loginpage.password("admin123");
	}

	@And("click on login button")
	public void click_on_login_button() {
		loginpage.login();
	}

	@Then("page should be nevigated to the next page")
	public void page_should_be_nevigated_to_the_next_page() {
	Assert.assertEquals(driver.getTitle(), "Welcome");
	}

	@And("close the browser")
	public void close_the_browser() {
	  driver.close();
	}
}
