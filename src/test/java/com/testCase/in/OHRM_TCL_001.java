package com.testCase.in;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fileUtils.in.ReadExcelData;
import com.listener.in.ClassListener;
import com.pageObject.in.LoginWebpage;
import com.relevantcodes.extentreports.LogStatus;
import com.standardClass.in.BaseTest;


@Listeners(ClassListener.class)
public class OHRM_TCL_001 extends BaseTest {
	
	@Test(dataProvider="login",dataProviderClass=ReadExcelData.class)
	public void userLogin(String user,String pw) throws InterruptedException {
		LoginWebpage login=new LoginWebpage(driver);
		login.userNameField(user);
		login.passWordField(pw);
		login.login();
		String Actual=driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
		String Expected="Dashboard";
		Assert.assertEquals(Actual, Expected);
		test.log(LogStatus.PASS,"Test is passed");
	}
}
