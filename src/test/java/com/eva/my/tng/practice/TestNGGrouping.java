package com.eva.my.tng.practice;

import org.testng.annotations.*;

public class TestNGGrouping {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am BeforeSuite method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am BeforeTest Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am BeforeClass Method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am BeforeMethod Method");
	}
	@Parameters({"myname"})
	@Test(priority = 1, groups = { "smoke" ,"reggresion"})
	public void verifyFirstName(String name) {
		System.out.println(name);
	}

	@Test(priority = 2, groups = "reggresion")
	public void verifyLastName() {
		System.out.println("Kumar");
	}

	@Test(priority = 3, groups = "system")
	public void verifyClass() {
		System.out.println("Bsc");
	}

	@Test(priority = 4, groups = { "smoke" })
	public void verifyAge() {
		System.out.println("20");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am AfterMethod Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am AfterClass method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am AfterTest Method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am AfterSuite method");
	}

}
