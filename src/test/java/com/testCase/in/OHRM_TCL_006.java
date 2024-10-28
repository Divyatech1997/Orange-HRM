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
		log.info("Username is entering");
		login.userNameField(user);
		log.info("Password is entering");
		login.passWordField(pw);
		login.login();
		log.info("Login field is clicked");
		String ActualUs=driver.findElement(By.xpath("//*[contains(@class,'row')][1]/div/span")).getText();
		String ExpectedUs="Required";
		log.info("Checking whether 'required' message is displayed near username field ");
		Assert.assertEquals(ActualUs, ExpectedUs);
		log.info("'required' message is displayed near username field & empUsValPw Test is passed");
		test.log(LogStatus.PASS,"empUsValPw Test is passed");
	}

}
