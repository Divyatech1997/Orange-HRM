package com.listener.in;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.standardClass.in.BaseTest;

public class ClassListener extends BaseTest implements ITestListener {
	
	 public void onTestStart(ITestResult result) {
			
		 System.out.println("This test started : "+result.getMethod().getMethodName());
	 }


	 public void onTestSuccess(ITestResult result) {
		System.out.println("This test is successed : "+result.getMethod().getMethodName());
		 
		  }

	 
	 public void onTestFailure(ITestResult result) {
		   System.out.println(result.getMethod().getMethodName()+" is failed");
		   	
			}
			
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("This test is skipped : "+result.getMethod().getMethodName());
	 }

	 
	 public void onFinish(ITestResult result) {
		System.out.println("This test is finished : "+result.getMethod().getMethodName());
			 }



}
