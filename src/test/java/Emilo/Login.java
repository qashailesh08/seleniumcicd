package Emilo;

import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void login() throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://emilo-live-stream-front.vercel.app/login");

		// Login
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("qa.shailesh08@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shailesh", Keys.ENTER);

		// Enter text in textarea
		WebElement weTextArea = driver.findElement(By.xpath("//textarea[contains(@placeholder,'on your mind')]"));
		weTextArea.clear();
		weTextArea.sendKeys("Testing");
		Thread.sleep(3000);

		// Click upload button (this opens OS dialog)
		driver.findElement(By.xpath("//div[@class='flex flex-wrap gap-4']/button")).click();

		// File path to upload
		String filePath = "C:\\Users\\91933\\OneDrive\\Desktop\\emilo\\Nature.jpg";
		uploadFile(filePath);
//		// Handle OS dialog with Robot class
//		StringSelection selection = new StringSelection(filePath);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//
//		Robot robot = new Robot();
//		robot.delay(2000);
//
//		// Press CTRL+V
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//
//		// Press Enter
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//
//		System.out.println("Image uploaded successfully!");

		checkPosts(driver, "Testing");
		// Check Networking of Image
//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		// Post
//		driver.findElement(By.xpath("//button[text()='Post']")).click();

	}

	public void checkPosts(WebDriver driver, String text) {

		if (driver.getPageSource().contains(text)) {
			System.out.println("Page Contains- " + text);
		} else {
			System.out.println("Post not avalable");
		}

	}

	public static void uploadFile(String filePath) throws AWTException {
		// Handle OS dialog with Robot class
		StringSelection selection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.delay(2000);

		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Image uploaded successfully!");
	}

}
