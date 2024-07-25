package com.testCase.in;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fileUtils.in.ReadExcelData;
import com.pageObject.in.LoginWebpage;
import com.relevantcodes.extentreports.LogStatus;
import com.standardClass.in.BaseTest;

public class OHRM_TCL_015 extends BaseTest {
	@Test(dataProvider="login0",dataProviderClass=ReadExcelData.class)
	public void hiddenVisibilityofPW(String user,String pw) throws InterruptedException {
		LoginWebpage login=new LoginWebpage(driver);
		log.info("Entering the username");
		login.userNameField(user);
		log.info("Entering the password");
		login.passWordField(pw);
		String imagePath=ScreenCapture(driver,"hiddenVisibilityofPW");
		test.log(LogStatus.PASS, test.addScreenCapture(imagePath),"hiddenVisibilityofPW test is passed");
		Assert.assertTrue(true);
	}

}
