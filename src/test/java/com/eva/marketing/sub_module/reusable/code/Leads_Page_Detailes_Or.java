package com.eva.marketing.sub_module.reusable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.eva.webutil.WebUtil;
import lombok.Getter;

@Getter
public class Leads_Page_Detailes_Or {

	public Leads_Page_Detailes_Or(WebUtil util) {
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
	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='designation']")
	private WebElement titleTB;

	@CacheLookup
	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadSourceDD;

	@CacheLookup
	@FindBy(xpath = "//select[@name='leadstatus']")
	private WebElement leadStatusDD;

	@CacheLookup
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phoneTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='mobile']")
	private WebElement mobileTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='fax']")
	private WebElement faxTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTB;

	@CacheLookup
	@FindBy(xpath = "//textarea[@name='lane']")
	private WebElement streetTA;

	@CacheLookup
	@FindBy(xpath = "//input[@id='code']")
	private WebElement postoleCodeTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='country']")
	private WebElement countryTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='pobox']")
	private WebElement poBoxTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='city']")
	private WebElement cityTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='state']")
	private WebElement stateTB;

}
