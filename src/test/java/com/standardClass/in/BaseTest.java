package com.standardClass.in;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testCase.in.OHRM_TCL_001;



public class BaseTest {

	public static WebDriver driver;
	static ExtentReports extent;
	public static ExtentTest test;
	public static Logger log = LogManager.getLogger(BaseTest.class);

	
 	
	/*@Parameters("Browser")
	@BeforeClass
	public void initialSetup(String Browser) {
		
		if(Browser.equalsIgnoreCase("chrome") ) {
			 driver = new ChromeDriver();
		log.info("Chrome browser is opened");
		}
			else if(Browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
		log.info("Chrome browser is opened");
			}
		
			else if(Browser.equalsIgnoreCase("microsoft")) {
				 driver = new EdgeDriver();
			log.info("Microsoft browser is opened");
				}
			
		
	}*/
	
	
	

	
	@Parameters({"Browser","URL"})
	@BeforeMethod
	public void openBrowserURL(String Browser,String url) {
		if(Browser.equalsIgnoreCase("chrome") ) {
			 driver = new ChromeDriver();
		log.info("Chrome browser is opened");
		}
			else if(Browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
		log.info("Chrome browser is opened");
			}
		
			else if(Browser.equalsIgnoreCase("microsoft")) {
				 driver = new EdgeDriver();
			log.info("Microsoft browser is opened");
				}
		
		 driver.manage().window().maximize();
		 driver.get(url);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		log.info("Application Url is opened"); 
	}
	
	
	@BeforeTest
	public void extentReportSetup() {
		extent = new ExtentReports("./ExtentReport/MyReport.html",true);
		test = extent.startTest("OrangeHRM Report");
		test.assignAuthor("Divya").assignCategory("Sanity testing");
		
	}
	
	
	@AfterTest
	public void extentClose() {
		extent.endTest(test);
		extent.flush();
		
	}
	

	 @AfterMethod
		public void Failed(ITestResult result) throws IOException {
		 
			if(result.getStatus()==result.FAILURE) {
				log.error("Failure information is executing");
				String imgPath=ScreenCapture(driver,result.getMethod().getMethodName());
				
				 test.log(LogStatus.FAIL,result.getMethod().getMethodName()+ " is failed");
				 test.log(LogStatus.FAIL, test.addScreenCapture(imgPath));
				 test.log(LogStatus.FAIL, result.getThrowable());
				
			}
			driver.close();
			log.info("Application url is closed");
			}
	

	
	 public String ScreenCapture(WebDriver driver,String filePath) {
		 String dateName=new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		 File src=( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String destPath=System.getProperty("user.dir")+"\\ScreenShot\\"+dateName+filePath+".jpg";				try {
			FileUtils.copyFile(src, new File(destPath));
			} catch (IOException e) {
						e.printStackTrace();
			}  
			return destPath;
	 }
	
}
