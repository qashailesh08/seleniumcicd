package com.eva.marketing.sub_module.reusable.code;

import com.eva.webutil.WebUtil;

public class Login_Page extends Login_Or {

	private WebUtil util;

	public Login_Page(WebUtil util) {
		super(util);
		this.util = util;
	}

	public void userCredential(String userName, String password, String selThemeByValue) {
		util.inputValue(getUserNameTB(), userName, "User Name TB");
		util.inputValue(getUserPasswordTB(), password, "Password TB");
		util.selectByValue(getColorThemeDD(), selThemeByValue, "Color Theme Dropdown");

	}

	public void verifyColorThemeByDefaultSofted() {
		util.verifyFirstSelectedOption(getColorThemeDD(), "softed", "Color Theme Dropdown");
	}

	public void verifyColorThemeAfterSelectOption(String expectedTheme) {
		util.verifyFirstSelectedOption(getColorThemeDD(), expectedTheme, "Color Theme Dropdown");
	}

	public void verifyUserNameAndPasswordByDefaultBlank() {
		util.verifyAttribute(getUserNameTB(), "", "value", "user name textbox");
		util.verifyAttribute(getUserPasswordTB(), "", "value", "passowrd textbox");
	}

	public void verifyUserNamePassword(String excUserName, String exPassword) {
		util.verifyAttribute(getUserNameTB(), excUserName, "value", "user name textbox");
		util.verifyAttribute(getUserPasswordTB(), exPassword, "value", "passowrd textbox");

	}

	public void loginButton() {
		util.click(getLoginBT(), "Login BT");
	}

	public void verifyInvalidLoginSMS(String expectedErrorSMS) {
		boolean actualValue = util.getPageSource().contains("You must specify a valid username and password.");
		if (actualValue == true) {
			util.stringValidation("You must specify a valid username and password.", expectedErrorSMS, "Page Source");
		} else {
			util.stringValidation("You Enterd Valid Cradential for login page", expectedErrorSMS, "Page Source");
		}
	}
}
