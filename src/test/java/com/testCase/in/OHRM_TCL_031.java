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
	@Test
	public void VerifyLoginAftLoggedOut() throws InterruptedException {
		LoginWebpage login=new LoginWebpage(driver);
		String expected_UserFieldText="";
		Assert.assertEquals(login.defaultuserfieldtext(), expected_UserFieldText);
		String expected_PasswordText="";
		Assert.assertEquals(login.defaultpassfieldtext(), expected_PasswordText);
		test.log(LogStatus.PASS,"VerifyLoginAftLoggedOut test is passed" );
	}
	
}
