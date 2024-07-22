package com.testCase.in;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fileUtils.in.ReadExcelData;
import com.pageObject.in.LoginWebpage;
import com.relevantcodes.extentreports.LogStatus;
import com.standardClass.in.BaseTest;

public class OHRM_TCL_006 extends BaseTest {
	@Test(dataProvider="login5",dataProviderClass=ReadExcelData.class)
	public void empUsValPw(String user,String pw) throws InterruptedException {
		LoginWebpage login=new LoginWebpage(driver);
		login.userNameField(user);
		login.passWordField(pw);
		login.login();
		String ActualUs=driver.findElement(By.xpath("//*[contains(@class,'row')][1]/div/span")).getText();
		String ExpectedUs="Required";
		Assert.assertEquals(ActualUs, ExpectedUs);
		
		String Actual=driver.findElement(By.xpath("//*[@role='alert']/div/p")).getText();
		String Expected="Invalid credentials";
		Assert.assertEquals(Actual, Expected);
		

		test.log(LogStatus.PASS,"Test is passed");
	}

}
