package com.eva.marketing.sub_module.reusable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.eva.webutil.WebUtil;
import lombok.Getter;

@Getter
public class AccountsDetailesOR {

	public AccountsDetailesOR(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}

	@Getter
	@FindBy(name = "accountname")
	private WebElement accountNameTB;

	@FindBy(name = "website")
	private WebElement webSiteTB;

	@FindBy(name = "tickersymbol")
	private WebElement ticketSymboleTB;

	@FindBy(id = "phone")
	private WebElement phoneTB;

	@FindBy(xpath = "//td[contains(text(),'ACC')]")
	private WebElement accNoIT;

	@FindBy(xpath = "//input[@id='fax']")
	private WebElement faxTB;

	@FindBy(xpath = "//input[@id='email1']")
	private WebElement emailTB;

	@FindBy(name = "bill_street")
	private WebElement billAddressTB;

	@FindBy(id = "bill_pobox")
	private WebElement billPoxTB;

	@FindBy(id = "bill_city")
	private WebElement billCityTB;

	@FindBy(id = "bill_state")
	private WebElement billStateTB;

	@FindBy(id = "bill_code")
	private WebElement billPostoleCodeTB;

	@FindBy(id = "bill_country")
	private WebElement billCountryTB;

	@FindBy(name = "ship_street")
	private WebElement shippAddressTB;

	@FindBy(id = "ship_pobox")
	private WebElement shippPoxTB;

	@FindBy(id = "ship_city")
	private WebElement shippCityTB;

	@FindBy(id = "ship_state")
	private WebElement shippStateTB;

	@FindBy(id = "ship_code")
	private WebElement shippPostoleCodeTB;

	@FindBy(id = "ship_country")
	private WebElement shippCountryTB;

	@FindBy(xpath = "//b[text()='Copy Shipping address']/parent::td/child::input[@name='cpy']")
	private WebElement copyShippingAddressCB;

	@FindBy(xpath = "//b[text()='Copy Billing address']/parent::td/child::input[@name='cpy']")
	private WebElement copyBillingAddressCB;

	@FindBy(xpath = "description")
	private WebElement descriptionTA;

}
