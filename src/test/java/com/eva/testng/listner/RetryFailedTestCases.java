package com.eva.testng.listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {
	int count = 0;
	int max = 3;

	@Override
	public boolean retry(ITestResult result) {
		if (count < max) {
			System.out.println(result.getName() + count);
			count++;
			return true;
		}
		return false;
	}

}
