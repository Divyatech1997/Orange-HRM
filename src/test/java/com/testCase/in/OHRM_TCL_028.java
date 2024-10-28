package com.testCase.in;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fileUtils.in.ReadExcelData;
import com.fileUtils.in.ReadPropertiesFile;
import com.pageObject.in.LoginWebpage;
import com.relevantcodes.extentreports.LogStatus;
import com.standardClass.in.BaseTest;

public class OHRM_TCL_028 extends BaseTest {
	@Test(dataProvider="login28",dataProviderClass=ReadPropertiesFile.class)
	public void verifyMaxCharUser(String user,String pw) throws InterruptedException {
		LoginWebpage login=new LoginWebpage(driver);
		log.info("Entering the username");
		login.userNameField(user);
		log.info("Entering the password");
		login.passWordField(pw);
		login.login();
		log.info("Login field is clicked");
		String Actual=driver.findElement(By.xpath("//*[@role='alert']/div/p")).getText();
		String Expected="Invalid credentials";
		Assert.assertEquals(Actual, Expected);
		test.log(LogStatus.PASS,"verifyMaxCharUser Test is passed");
}

}