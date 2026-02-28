package com.eva.web.automation.practice;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.eva.marketing.sub_module.reusable.code.Login_Page;
import com.eva.webutil.WebUtil;

public class AWSBaseTest {

	protected WebUtil util;

	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("ExtentReports initialized");
		WebUtil.generateReport();
	}

	@BeforeTest
	public void beforeTestMethod() {
		util = WebUtil.getInstance();
		System.out.println("I am before Test Method");
	}

	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("I am before Class Method");
	}

	@BeforeMethod
	public void beforeMethod(Method meth) {
		System.out.println("I am beforeMethod method");
		String tcName = meth.getName();
		util.createReport(tcName + " On " + "chromebrowser");
		util.launchBrowser("chromebrowser");
		util.maxWindow();
		util.openUrl(
				"https://aws.amazon.com/quick/flows/?trk=a1d4fbf5-e127-441d-9900-ec084e238fb6&sc_channel=ps&ef_id=Cj0KCQiAwYrNBhDcARIsAGo3u30KPXGxnMbSgYd8YQWC3MgmTPhhRVY7PXbPYYydgYY2UtBa3TazHccaAs90EALw_wcB:G:s&s_kwcid=AL!4422!3!795924654950!p!!g!!task%20automation!23523526761!198377621488&gad_campaignid=23523526761&gbraid=0AAAAADjHtp-amvvy6iu3AdLRue8bZpXtT&gclid=Cj0KCQiAwYrNBhDcARIsAGo3u30KPXGxnMbSgYd8YQWC3MgmTPhhRVY7PXbPYYydgYY2UtBa3TazHccaAs90EALw_wcB");
		// write your create account logic code here with class
	

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am After Method");
		util.quit(2000);
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am After Class Method");
		util.flushReport();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am After Test Method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println(" Destroyed ExtentReports initialized");
	}
}
