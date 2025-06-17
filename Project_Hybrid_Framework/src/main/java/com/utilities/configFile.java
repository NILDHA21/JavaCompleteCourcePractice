package com.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class configFile {

	public static String readConfig(String key) throws Exception {
		String path = System.getProperty("user.dir") + "/src/main/resources/Config.properties";
		FileInputStream file = new FileInputStream(path);
		Properties pro = new Properties();
		pro.load(file);
		return pro.getProperty(key);
	}
}
