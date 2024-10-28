package com.testCase.in;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fileUtils.in.ReadExcelData;
import com.pageObject.in.LoginWebpage;
import com.relevantcodes.extentreports.LogStatus;
import com.standardClass.in.BaseTest;

public class OHRM_TCL_003 extends BaseTest {
	@Test(dataProvider="login2",dataProviderClass=ReadExcelData.class)
	public void InvUserValPw(String user,String pw) throws InterruptedException {
		LoginWebpage login=new LoginWebpage(driver);
		log.info("Username is entering");
		login.userNameField(user);
		log.info("Password is entering");
		login.passWordField(pw);
		login.login();
		log.info("Login field is clicked");
		String Actual=driver.findElement(By.xpath("//*[@role='alert']/div/p")).getText();
		String Expected="Invalid credentials";
		log.info("Checking 'Invalid credentials' message is displaying..");
		Assert.assertEquals(Actual, Expected);
		log.info("'Invalid credentials' message is displayed & InvUserValPw Test is passed");
		test.log(LogStatus.PASS,"InvUserValPw Test is passed");
	}

}
