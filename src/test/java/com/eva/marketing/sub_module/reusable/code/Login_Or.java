package com.eva.marketing.sub_module.reusable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;

@Getter
public class Login_Or {

	public Login_Or(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}

	@CacheLookup
	@FindBy(name = "user_name")
	private WebElement userNameTB;

	@CacheLookup
	@FindBy(name = "user_password")
	private WebElement userPasswordTB;

	@CacheLookup
	@FindBy(name = "login_theme")
	private WebElement colorThemeDD;

	@CacheLookup
	@FindBy(name = "login_language")
	private WebElement languageDD;

	@CacheLookup
	@FindBy(name = "Login")
	private WebElement loginBT;
}
