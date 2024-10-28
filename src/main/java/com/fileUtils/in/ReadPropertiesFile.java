package com.fileUtils.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;

public class ReadPropertiesFile {
	
	@DataProvider(name="login26")
	public Object[][] propertiesFile26() throws IOException {
		File file = new File("C:\\Users\\divya\\eclipse-workspace\\Orange-HRM\\TestData\\UserLogin.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return new Object[][]{
			{prop.getProperty("Username26"),prop.getProperty("Password26")}
			                  };
		}
	
	
	@DataProvider(name="login27")
	public Object[][] propertiesFile27() throws IOException {
		File file = new File("C:\\Users\\divya\\eclipse-workspace\\Orange-HRM\\TestData\\UserLogin.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return new Object[][]{
			{prop.getProperty("Username27"),prop.getProperty("Password27")}
			                  };
		}
	
	@DataProvider(name="login28")
	public Object[][] propertiesFile28() throws IOException {
		File file = new File("C:\\Users\\divya\\eclipse-workspace\\Orange-HRM\\TestData\\UserLogin.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return new Object[][]{
			{prop.getProperty("Username28"),prop.getProperty("Password28")}
			                  };
		}
	
	
	@DataProvider(name="login29")
	public Object[][] propertiesFile29() throws IOException {
		File file = new File("C:\\Users\\divya\\eclipse-workspace\\Orange-HRM\\TestData\\UserLogin.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return new Object[][]{
			{prop.getProperty("Username29"),prop.getProperty("Password29")}
			                  };
		}
	
	@DataProvider(name="login30")
	public Object[][] propertiesFile30() throws IOException {
		File file = new File("C:\\Users\\divya\\eclipse-workspace\\Orange-HRM\\TestData\\UserLogin.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return new Object[][]{
			{prop.getProperty("Username30"),prop.getProperty("Password30")}
			                  };
		}
	
	@DataProvider(name="login31")
	public Object[][] propertiesFile31() throws IOException {
		File file = new File("C:\\Users\\divya\\eclipse-workspace\\Orange-HRM\\TestData\\UserLogin.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return new Object[][]{
			{prop.getProperty("Username31"),prop.getProperty("Password31")}
			                  };
		}
	
	
	
	
}
