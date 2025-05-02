package com.eva.marketing.sub_module.reusable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.eva.webutil.WebUtil;

import lombok.Getter;

@Getter
public class Contacts_Or {
	public Contacts_Or(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}

	@CacheLookup
	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement firstNameDD;

	@CacheLookup
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstNameTB;

	@CacheLookup
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastNameTB;

	@CacheLookup
	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadSourceDD;

	@CacheLookup
	@FindBy(xpath = "//input[@id='fax']")
	private WebElement faxTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement officePhoneTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='mobile']")
	private WebElement mobileTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='title']")
	private WebElement titleTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTB;

	@CacheLookup
	@FindBy(xpath = "//input[contains(@onclick,'copyAddressLeft')]")
	private WebElement copyOtherAddressCB;

	@CacheLookup
	@FindBy(xpath = "//input[contains(@onclick,'copyAddressRight')]")
	private WebElement copyMailingAddressCB;

	@CacheLookup
	@FindBy(xpath = "//textarea[@name='mailingstreet']")
	private WebElement mailingStreetTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='mailingpobox']")
	private WebElement mailingPOTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='mailingcity']")
	private WebElement mailingCityTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='mailingstate']")
	private WebElement mailingStateTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='mailingzip']")
	private WebElement mailingPostoleCodeTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='mailingcountry']")
	private WebElement mailingCountryTB;

	////////////////////////
	@CacheLookup
	@FindBy(xpath = "//textarea[@name='otherstreet']")
	private WebElement otherStreetTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='otherpobox']")
	private WebElement otherPOTB;

	@CacheLookup
	@FindBy(xpath = "othercity")
	private WebElement otherCityTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='otherstate']")
	private WebElement otherStateTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='otherzip']")
	private WebElement otherPostoleCodeTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='othercountry']")
	private WebElement otherCountryTB;

}
