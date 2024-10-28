package com.testCase.in;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fileUtils.in.ReadExcelData;
import com.pageObject.in.LoginWebpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.standardClass.in.BaseTest;

public class OHRM_TCL_025 extends BaseTest  {
	public static Logger log = LogManager.getLogger(BaseTest.class);

	@Test(priority=0,dataProvider="login0",dataProviderClass=ReadExcelData.class)
	public void vUsvPw(String user,String pw) throws InterruptedException {
	/*	WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));*/
		LoginWebpage login=new LoginWebpage(driver);
		log.info("Entering the username");
		login.userNameField(user);
		log.info("Entering the password");
		login.passWordField(pw);
		login.login();
		log.info("Login field is clicked");
		String Actual=driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
		String Expected="Dashboard";
		Assert.assertEquals(Actual, Expected);
		//driver.close();
	}
	
	
	
	@Test(priority=1)
	public void OpeningBrowserwithoutLoggedOut() throws InterruptedException {
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));*/
		LoginWebpage login = new LoginWebpage(driver);
		Thread.sleep(3000);
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/img"));
		log.info("Checking login page");
		Assert.assertTrue(logo.isDisplayed());
		log.info("Checking username and password fields are empty");
		String expected=""; 
		Assert.assertEquals(login.defaultuserfieldtext(), expected);
		Assert.assertEquals(login.defaultpassfieldtext(), expected);
		//driver.close();
	}

}
