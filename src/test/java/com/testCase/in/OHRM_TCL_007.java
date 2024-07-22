package com.testCase.in;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fileUtils.in.ReadExcelData;
import com.pageObject.in.LoginWebpage;
import com.relevantcodes.extentreports.LogStatus;
import com.standardClass.in.BaseTest;

public class OHRM_TCL_007 extends BaseTest {
	@Test(dataProvider="login6",dataProviderClass=ReadExcelData.class)
	public void valUsempPw(String user,String pw) throws InterruptedException {
		LoginWebpage login=new LoginWebpage(driver);
		login.userNameField(user);
		login.passWordField(pw);
		login.login();
		
		String ActualPw=driver.findElement(By.xpath("//*[contains(@class,'row')][2]/div/span")).getText();
		String ExpectedPw="Required";
		Assert.assertEquals(ActualPw, ExpectedPw);
		
		String Actual=driver.findElement(By.xpath("//*[@role='alert']/div/p")).getText();
		String Expected="Invalid credentials";
		Assert.assertEquals(Actual, Expected);
		
		
		test.log(LogStatus.PASS,"Test is passed");
	}

}
