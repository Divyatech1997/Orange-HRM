package com.testCase.in;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fileUtils.in.ReadExcelData;
import com.listener.in.ClassListener;
import com.pageObject.in.LoginWebpage;
import com.relevantcodes.extentreports.LogStatus;
import com.standardClass.in.BaseTest;


@Listeners(ClassListener.class)
public class OHRM_TCL_001 extends BaseTest {
	
	@Test(dataProvider="login0",dataProviderClass=ReadExcelData.class)
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
		log.info("Checking whether Dashboard page is Opening..");
		Assert.assertEquals(Actual, Expected);
		log.info("Dashboard page is opened & vUsvPw test is passed");
		test.log(LogStatus.PASS,"vUsvPw Test is passed");
	}
}
