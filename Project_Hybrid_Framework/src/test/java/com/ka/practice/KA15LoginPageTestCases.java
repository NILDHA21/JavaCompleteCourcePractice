package com.ka.practice;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class KA15LoginPageTestCases {

	@Test
	void TestCase1() {
		Assert.assertEquals(2, 4);
	}
	
	@Test
	void TestCase2() {
		Assert.assertEquals(2, 3);
	}
	
	@Test
	void TestCase3() {
		Assert.assertEquals(2, 2);
	}
	
	@Test
	void TestCase4() {
		Assert.assertEquals(2, 2);
	}
	
	@Test
	void TestCase5() {
		throw new SkipException("");
	}
	
	@Test
	void TestCase6() {
		Assert.assertEquals(2, 2);
	}
}
