package com.pageObject.in;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.standardClass.in.CommonClass;

public class DashboardPage extends CommonClass {
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//*[contains(@class,'userarea')]/ul/li")
	WebElement TestNamendaUser;
	
	@FindBy(xpath="//*[contains(@class,'dropdown-menu')]/li[4]")
	WebElement logOutBtn;
	
	@FindBy(xpath="//*[contains(@class,'dropdown-menu')]/li[1]")
	WebElement about;
	
	@FindBy(xpath="//*[contains(@class,'dropdown-menu')]/li[2]")
	WebElement support;
	
	@FindBy(xpath="//*[contains(@class,'dropdown-menu')]/li[]")
	WebElement changePw;



	
	public void TestNamendaUser() throws InterruptedException {
		TestNamendaUser.click();
		sleep(3000);
	}
	
	public void logOutBtn() throws InterruptedException {
		logOutBtn.click();
		sleep(2000);
	}
	
	public void about() throws InterruptedException {
		about.click();
		sleep(2000);
	}
	
	public void support() throws InterruptedException {
		about.click();
		sleep(2000);
	}
	
	public void changePw() throws InterruptedException {
		about.click();
		sleep(2000);
	}
	
	
}
