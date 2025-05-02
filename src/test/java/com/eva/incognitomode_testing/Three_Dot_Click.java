package com.eva.incognitomode_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Three_Dot_Click {
	public static void main(String[] args) {
		// Create a new instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();

		// Add arguments for incognito mode
		options.addArguments("--incognito");

		// Set a preference using ChromeOptions
		options.addArguments("prefs", "download.default_directory=/path/to/download/directory");

		// Initialize the ChromeDriver with ChromeOptions
		WebDriver driver = new ChromeDriver(options);
//		driver.get("http:/localhost:8888");
	}
}
