package com.evs.actions.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScrollElement {
// ===============================================
	@Test(priority = 1, enabled = false)
	public void up_down_element() {
		// ===============================================
		// launching browser
		WebDriver driver = new ChromeDriver();
		// ===============================================
		// maximizing window
		driver.manage().window().maximize();
		// ===============================================
		// openning URL's
		driver.navigate().to("http://localhost:8888");
		// Img Validation 'The honest Open Source CRM'
		// ===============================================
		System.out.println("Image 'The honest Open Source CRM' is displayed= "
				+ driver.findElement(By.xpath("//img[@title='The honest Open Source CRM']")).isDisplayed());
		// ===============================================
		// Img Validation 'vtiger CRM'
		System.out.println("Image 'vtiger CRM' is displayed= "
				+ driver.findElement(By.xpath("//img[@title='vtiger CRM']")).isDisplayed());
		// ===============================================
		// Working on User Name
		WebElement weUserName = driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");
		// ===============================================
		// Working on Password
		WebElement wePassword = driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin");
		// ===============================================
		// Working on Color Theme Drop-Down
		WebElement weColorTheme = driver.findElement(By.xpath("//select[@name='login_theme']"));
		// ===============================================
		// Created Select Class object to work on drop-down
		Select actColorTheme = new Select(weColorTheme);
		String actualDropdown = actColorTheme.getFirstSelectedOption().getText();
		if (actualDropdown.equals("softed")) {
			System.out.println("softed");
		} else {
			System.out.println("Not softed");
		}
		// ===============================================
		// Working on Langiage Dropdown
		WebElement weLanguage = driver.findElement(By.xpath("//select[@name='login_language']"));
		Select selLanguage = new Select(weLanguage);
		String actualLanguage = selLanguage.getFirstSelectedOption().getText();
		if (actualLanguage.equals("US English")) {
			System.out.println("US English");
		} else {
			System.out.println("Not US English");
		}
		// ===============================================
		// Login Button
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

	@Test(priority = 2)
	public void drag_drop() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin", Keys.ENTER);
		Actions act = new Actions(driver);
		WebElement weSource = driver.findElement(By.xpath("//tr[@id='headerrow_30']"));
		WebElement weTarget = driver.findElement(By.xpath("//tr[@id='headerrow_27']"));
		act.dragAndDrop(weSource, weTarget).perform();
	}

}
