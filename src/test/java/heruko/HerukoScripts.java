package heruko;

import org.testng.annotations.Test;

import listeners.RetryFailedTestCases;

public class HerukoScripts   extends HerukoBaseTest{

	@Test(priority = 0)
	public void test_001_create_account() {
		
		System.out.println("Hello");
	}
}
