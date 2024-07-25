package com.testCase.in;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fileUtils.in.ReadExcelData;
import com.listener.in.ClassListener;
import com.pageObject.in.LoginWebpage;
import com.relevantcodes.extentreports.LogStatus;
import com.standardClass.in.BaseTest;


@Listeners(ClassListener.class)
public class OHRM_TCL_014 extends BaseTest{
	
	
	
	@Test(dataProvider="login0",dataProviderClass=ReadExcelData.class)
	public void loginByKeyboardkeys(String user, String pw) throws InterruptedException {
		LoginWebpage login = new LoginWebpage(driver);
		log.info("Username is entering");
		login.keyboardUserField(user);
		log.info("Password is entering");
		login.keyboardPw(pw);
		login.keyboardLogin();
		log.info("Login button is Clicked");
		String Actual=driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
		String Expected="Dashboard";
		Assert.assertEquals(Actual, Expected);
		test.log(LogStatus.PASS,"loginByKeyboardkeys Test is passed successfully");

	}

}
