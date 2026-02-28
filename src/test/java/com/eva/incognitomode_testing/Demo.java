package com.eva.incognitomode_testing;

public class Demo {
	/*
	 * we have 1 to 100 count where you will find 5 or multiple with 5 print foo and
	 * same for 7 pirnt baar,if value divide with 5 and 7 then print foobar
	 */

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println("foobar");
			}
			else if (i % 5 == 0) {
				System.out.println("foo");
			} else if (i % 7 == 0) {
				System.out.println("baar");
			} else {
				System.out.println(i);
			}
		}
	}

}
