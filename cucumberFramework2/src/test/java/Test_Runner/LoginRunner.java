package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features =  "C:\\Users\\Admin\\eclipse-workspace\\cucumberFramework2\\src\\test\\resources\\Login.feature",
	glue = "step_defination",
	dryRun = false,
	monochrome = true
)

public class LoginRunner {

}
