package com.eva.incognitomode_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_ChromeBrowser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http:/localhost:8888");
	}

}
