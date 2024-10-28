package com.pageObject.in;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.inject.Key;
import com.standardClass.in.CommonClass;

public class LoginWebpage extends CommonClass {
	
	public LoginWebpage(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//p[contains(@class,'forgot')]")
	WebElement forgotBtn;
	
	public void userNameField(String user) throws InterruptedException {
		//username.sendKeys(Keys.CONTROL+Keys.chord("A")+Keys.DELETE);
		username.clear();
		username.sendKeys(user);
		sleep(2000);
	}
	
	public void passWordField(String pw) throws InterruptedException {
		password.clear();
		password.sendKeys(pw);
		sleep(2000);
	}
	
	public void login() throws InterruptedException {
		loginBtn.click();
		sleep(5000);
	}
	
	
	public void keyboardUserField(String user) throws InterruptedException {
		username.sendKeys(Keys.TAB);
		username.clear();
		sleep(2000);
		username.sendKeys(user);
		sleep(2000);
	}
	
	public void keyboardPw(String pw) throws InterruptedException {
		password.sendKeys(Keys.TAB);
		password.clear();
		sleep(2000);
		password.sendKeys(pw);
		sleep(2000);
	}
	
	public void keyboardLogin() throws InterruptedException {
		loginBtn.sendKeys(Keys.TAB);
		loginBtn.sendKeys(Keys.ENTER);
		sleep(4000);
	}
	
	public void forgotPwLink() {
		forgotBtn.click();
	}
	
	public String defaultuserfieldtext() {
		return username.getText();
		
	}

	public String defaultpassfieldtext() {
		return username.getText();
	}

}
