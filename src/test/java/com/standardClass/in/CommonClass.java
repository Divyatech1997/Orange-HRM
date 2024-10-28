package com.standardClass.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonClass {

	public static WebDriver driver;
	
	public CommonClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public static void sleep(int miliSec) throws InterruptedException {
		Thread.sleep(miliSec);
	}
	
	
	
	
	

}
