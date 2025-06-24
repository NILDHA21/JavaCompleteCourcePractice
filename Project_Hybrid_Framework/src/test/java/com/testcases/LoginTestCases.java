package com.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class LoginTestCases extends BaseClass{

	@Test
	void testValidCredentials() 
	{
		lp.email("abc@gmail.com");
		lp.password("abc@123");
		lp.remember();
		lp.loginIn();
		Assert.assertEquals(driver.getTitle(),"Loggin");
	}
}
