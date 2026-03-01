package heruko;

import com.eva.webutil.WebUtil;

public class herukoSignInPage extends HerukoSignInOr {

	private WebUtil util;

	// Constructor Injection (Correct Way)
	public herukoSignInPage(WebUtil util) {
		super(util);
		this.util = util;
	}

	public String clickOnCreateAccount() {

		// Store parent window
		String parentWindow = util.getWindowHandle();

		// Click create account
		util.click(getCreateAccountBT(), "Create Account Button");

		// Switch to new tab (Signup Page)
		util.switchToNewWindow("AWS Console - Signup");

		return parentWindow; // return parent for later use
	}

	public void switchBackToParent(String parentWindow) {
		util.switchToParentWindow(parentWindow, "AWS Parent Page");
	}

	public void sendEmail(String email, String elementName) {
		util.inputValue(getEmailTB(), email, elementName);
	}

	public void sendAccountName(String accountName, String elementName) {
		util.inputValue(getAccountNameTB(), accountName, elementName);
	}
	public void clickOnverifyemail(String emailVerify) {
		util.click(getVerifyEmailTB(), emailVerify);
	}
}