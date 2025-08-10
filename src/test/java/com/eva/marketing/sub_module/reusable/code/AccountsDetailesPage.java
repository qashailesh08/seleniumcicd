package com.eva.marketing.sub_module.reusable.code;

import com.eva.webutil.WebUtil;


public class AccountsDetailesPage extends AccountsDetailesOR {
	private WebUtil util;

	public AccountsDetailesPage(WebUtil util) {
		super(util);
		this.util = util;
	}

	public void accountName(String name) {

		util.inputValue(getAccountNameTB(), name, "Account Name Text Bo");
	}

	public void webSite(String websteName) {
		util.inputValue(getWebSiteTB(), websteName, "WebSite Text Box");
	}

	public void ticketSymbol(String ticketSymbole) {
		util.inputValue(getTicketSymboleTB(), ticketSymbole, "Ticket Symbole Text Box");
	}

	public void phone(String phone) {
		util.inputValue(getPhoneTB(), phone, "Phone Text Box");
	}

	public String getAccountNo() {
		String text = util.getText(getAccNoIT(), "Account No");
		return text;
	}

	public void fax(String fax) {
		util.inputValue(getFaxTB(), fax, "Fax Text Box");
	}

	public void email(String email) {
		util.inputValue(getEmailTB(), email, "Email Text Box");
	}

	public void billAddress(String billAddress) {
		util.inputValue(getBillAddressTB(), billAddress, "Billing Address Text Box");
	}

	public void billPOBox(String PoBox) {
		util.inputValue(getBillPoxTB(), PoBox, "Billing PO Box Text Box");
	}

	public void billCity(String city) {
		util.inputValue(getBillCityTB(), city, "Billing City Text Box");
	}

	public void billState(String state) {
		util.inputValue(getBillStateTB(), state, "Billing State Text Box");
	}

	public void billPostoleCode(String postoleCode) {
		util.inputValue(getBillPostoleCodeTB(), postoleCode, "Billing PostoleCode Text Box");
	}

	public void billCountry(String country) {
		util.inputValue(getBillCountryTB(), country, "Billing Country Text Box");

	}

	public void shippAddress(String address) {
		util.inputValue(getShippAddressTB(), address, "Shipping Address Text Box");

	}

	public void shippPOBox(String PoBox) {
		util.inputValue(getShippPoxTB(), PoBox, "Shipping PO Box Text Box");
	}

	public void shippCity(String city) {
		util.inputValue(getShippCityTB(), city, "Shipping City Text Box");
	}

	public void shippState(String state) {
		util.inputValue(getShippStateTB(), state, "Shipping State Text Box");
	}

	public void shippPostoleCode(String postoleCode) {
		util.inputValue(getShippPostoleCodeTB(), postoleCode, "Shipping PostoleCode Text Box");

	}

	public void shippCountry(String country) {
		util.inputValue(getShippCountryTB(), country, "Shipping Country Text Box");

	}

	public void description(String description) {
		util.inputValue(getDescriptionTA(), description, "Description Text Box");
	}

	public void copyShippingAddress() {
		util.click(getCopyShippingAddressCB(), "Copy Shipping address");
	}

	public void copyBillingAddress() {
		util.click(getCopyBillingAddressCB(), "Copy Billing address");
	}

}
