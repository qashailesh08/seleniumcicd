package com.eva.incognitomode_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class Incognito_Mode_Testing {

	private Incognito_Mode_Testing() {
		
	}
	public static void main(String[] args) {
//		ChromeOptions chromeOpn = new ChromeOptions();
//		chromeOpn.addArguments("incognito");
//		DesiredCapabilities.c 
//		WebDriver driver = new ChromeDriver();
//		driver.get("http:/localhost:8888");

		// Create a new instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();

		// Add arguments for incognito mode
		options.addArguments("--incognito");

		// Initialize the ChromeDriver with ChromeOptions
		WebDriver driver = new ChromeDriver(options);

		// Your test code here
		driver.get("http:/localhost:8888");
		// Close the browser
//		driver.quit();
	}

}
