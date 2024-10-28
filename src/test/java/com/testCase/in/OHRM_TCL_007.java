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
	public void valUserEmptyPw(String user,String pw) throws InterruptedException {
		LoginWebpage login=new LoginWebpage(driver);
		log.info("Username is entering");
		login.userNameField(user);
		log.info("Password is entering");
		login.passWordField(pw);
		login.login();
		log.info("Login field is clicked");
		String ActualPw=driver.findElement(By.xpath("//*[contains(@class,'row')][2]/div/span")).getText();
		String ExpectedPw="Required";
		log.info("Checking whether 'required' message is displayed near password field");
		Assert.assertEquals(ActualPw, ExpectedPw);
		log.info("'required' message is displayed near password field & OHRM_TCL_007 Test is passed");
		test.log(LogStatus.PASS,"OHRM_TCL_007 Test is passed");
	}

}
