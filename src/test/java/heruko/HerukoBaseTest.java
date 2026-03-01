package heruko;

import java.lang.reflect.Method;

import org.testng.annotations.*;
import com.eva.webutil.WebUtil;
import factory.DriverFactory;

public class HerukoBaseTest {

//	protected WebUtil util;
//
//	@BeforeSuite
//	public void beforeSuite() {
//		System.out.println("After - ExtentReports initialized");
//		WebUtil.generateReport("Heruko");
//	}
//
//	@BeforeClass
//	public void beforeClass() {
//		System.out.println("I am before Test Method");
//	}
//
//	@BeforeMethod
//	public void setUp(Method method) {
//		DriverFactory.initDriver("chrome");
//		util.createReport(method.getName(), "Heruko");
//		util = new WebUtil(DriverFactory.getDriver());
//		util.maxWindow();
//		util.openUrl("https://www.orangehrm.com/");
//	}
//
//	@AfterMethod
//	public void tearDown() {
//		DriverFactory.quitDriver();
//	}
//
//	@AfterClass
//	public void afterClass() {
//		System.out.println("After class");
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("After Suite");
//	}

	protected WebUtil util;

	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("ExtentReports initialized");
		WebUtil.generateReport("Heruko");
	}

	@BeforeMethod
	public void setUp(Method method) {

		DriverFactory.initDriver("chrome");
		util = new WebUtil(DriverFactory.getDriver());
		util.createReport(method.getName(), "Heruko");
		util.maxWindow();
		util.openUrl("https://www.orangehrm.com/");
	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver();
	}
	@AfterClass
	public void afterClass() {
		util.flushReport();
		System.out.println("Report Flushed");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Destroyed ExtentReports initialized");
	}

}
