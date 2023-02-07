package com.ds.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ds.testBase.TestBase;

public class ListenersSetup extends TestBase implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("test case execution started - " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("test case execution completed- " +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("test case execution failed- " +result.getName());
		UtilClass.TakeSS(result.getName()+" - "+System.currentTimeMillis());
		logger.info("Takes Screenshot");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("test case execution skipped - " +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
