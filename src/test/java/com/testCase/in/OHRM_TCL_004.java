package com.testCase.in;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fileUtils.in.ReadExcelData;
import com.pageObject.in.LoginWebpage;
import com.relevantcodes.extentreports.LogStatus;
import com.standardClass.in.BaseTest;

public class OHRM_TCL_004 extends BaseTest {
	@Test(dataProvider="login3",dataProviderClass=ReadExcelData.class)
	public void ValUsInvPw(String user,String pw) throws InterruptedException {
		LoginWebpage login=new LoginWebpage(driver);
		login.userNameField(user);
		login.passWordField(pw);
		login.login();
		String Actual=driver.findElement(By.xpath("//*[@role='alert']/div/p")).getText();
		String Expected="Invalid credentials";
		Assert.assertEquals(Actual, Expected);
		test.log(LogStatus.PASS,"Test is passed");
	}

}
