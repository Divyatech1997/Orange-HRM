package com.testCase.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fileUtils.in.ReadExcelData;
import com.fileUtils.in.ReadPropertiesFile;
import com.pageObject.in.DashboardPage;
import com.pageObject.in.LoginWebpage;
import com.relevantcodes.extentreports.LogStatus;
import com.standardClass.in.BaseTest;

public class OHRM_TCL_031 extends BaseTest {
	
	@Test(priority=0,dataProvider="login0",dataProviderClass=ReadExcelData.class)
	public void vUsvPw(String user,String pw) throws InterruptedException {
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
		driver.navigate().back();
		Thread.sleep(3000);
		String expected_UserFieldText="";
		Assert.assertEquals(login.defaultuserfieldtext(), expected_UserFieldText);
		String expected_PasswordText="";
		Assert.assertEquals(login.defaultpassfieldtext(), expected_PasswordText);
		test.log(LogStatus.PASS,"VerifyLoginAftLoggedOut test is passed" );
	}
	
	
	
}
