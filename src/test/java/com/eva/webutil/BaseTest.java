package com.eva.webutil;

import java.lang.reflect.Method;

import org.testng.annotations.*;
import com.eva.marketing.sub_module.reusable.code.Login_Page;

public class BaseTest {

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

	@Parameters({ "browser", "username", "password", "colortheme" })
	@BeforeMethod
	public void beforeMethod(String browser, String username, String password, String colortheme, Method meth) {
		System.out.println("I am beforeMethod method");
		String tcName = meth.getName();
		util.createReport(tcName + " On " + browser);
		util.launchBrowser(browser);
		util.maxWindow();
		util.openUrl("http:/localhost:8888");
		Login_Page logObj = new Login_Page(util);
		logObj.userCredential(username, password, colortheme);
		util.verifyFirstSelectedOption(logObj.getColorThemeDD(), colortheme, "Color Theme Dropdown");
		logObj.loginButton();

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
