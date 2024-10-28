package com.testCase.in;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fileUtils.in.ReadExcelData;
import com.pageObject.in.LoginWebpage;
import com.relevantcodes.extentreports.LogStatus;
import com.standardClass.in.BaseTest;

public class OHRM_TCL_009 extends BaseTest {
	@Test(dataProvider="login8",dataProviderClass=ReadExcelData.class)
	public void valUserSpecialCharPw(String user,String pw) throws InterruptedException {
		LoginWebpage login=new LoginWebpage(driver);
		log.info("Username is entering");
		login.userNameField(user);
		log.info("Password is entering");
		login.passWordField(pw);
		login.login();
		log.info("Login field is clicked");
		String Actual=driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
		String Expected="Dashboard";
		Assert.assertEquals(Actual, Expected);
		test.log(LogStatus.PASS,"valUserSpecialCharPw Test is passed");
	}

}
