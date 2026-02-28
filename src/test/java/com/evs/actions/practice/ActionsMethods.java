package com.evs.actions.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsMethods {
	WebDriver driver;

	@Test(enabled = false)
	public void moveElement() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("http://localhost:8888");
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		WebElement weLogin = driver.findElement(By.name("Login"));
//		 click and hold method
		act.clickAndHold(weLogin).perform();
		act.doubleClick(weLogin).perform();
		// Rigth click method
//		act.contextClick(weLogin).perform();

		// move
//		WebElement weProduct = driver.findElement(By.xpath("//b[text()='Product Name']"));
		/*
		 * Dimension dim = weAnalytics.getSize(); int heigth = dim.getHeight(); int
		 * width = dim.getWidth(); act.moveByOffset(heigth, width).build().perform();
		 * act.moveToElement(weAnalytics).build().perform(); this is scroll method to
		 * for up and down Point p = weAnalytics.getLocation();
		 * act.moveToLocation(p.getX(), p.getY()).build().perform();
		 * act.scrollToElement(weProduct).build().perform();
		 */

	}

	@Test
	public void dragelement() {
		driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		// ==============LOGIN MODULE=================
		// User Name
		WebElement weUserName = driver.findElement(By.name("user_name"));
		weUserName.clear();
		weUserName.sendKeys("admin");
		String strActualUserName = weUserName.getAttribute("value");
		if (strActualUserName.equals("admin")) {
			System.out.println("Pass- User Name");
		} else {
			System.out.println("Fail- User Name");
		}
		// Password 
		WebElement wePassword = driver.findElement(By.name("user_password"));
		wePassword.clear();
		wePassword.sendKeys("admin");
		String strActualPassword = wePassword.getAttribute("value");
		if (strActualPassword.equals("admin")) {
			System.out.println("Pass- User Password");
		} else {
			System.out.println("Fail- User Password");
		}
		
		// Color Theme
		WebElement weColorTheme=driver.findElement(By.name("login_theme"));
		String actualTheme=weColorTheme.getAttribute("value");
		if(actualTheme.equals("Softed")) {
			System.out.println("Softed");
		}else {
			System.out.println("Not Softed");
		}
	}

}
