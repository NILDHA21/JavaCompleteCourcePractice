package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

public class TakeScreenshots extends BaseClass {

	public static String takesScreenshots(String name) 
	{
		String path = System.getProperty("user.dir")+"/Screenshot/" + name + ".png";
		TakesScreenshot tks = (TakesScreenshot)driver;
		File source = tks.getScreenshotAs(OutputType.FILE);
		File target = new File(path);
		
		try {
			FileUtils.copyFile(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return path;
}
}
