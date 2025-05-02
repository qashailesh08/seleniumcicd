package com.eva.marketing.sub_module.reusable.code;

import com.eva.webutil.WebUtil;

public class Contacts_Common_Code extends Contacts_Or {
	private WebUtil util;

	public Contacts_Common_Code(WebUtil wt) {
		super(wt);
		this.util = wt;
	}

	public void firstNameDD(String selByVT) {
		util.selectByVisibleText(getFirstNameDD(), selByVT,"First Name Dropdown");
	}

	public void firstNameTB(String firstName) {
		util.inputValue(getFirstNameTB(), firstName,"First Name Text Box");
	}

	public void lastName(String lastname) {
		util.inputValue(getLastNameTB(), lastname,"Last Name Dropdown");
	}

	public void leadSourceDD(String selByValue) {
		util.selectByValue(getLeadSourceDD(), selByValue,"Lead Source Dropdown");
	}

	public void fax(String fax) {
		util.inputValue(getFaxTB(), fax,"Fax Text Box");
	}

	public void officePhone(String officephone) {
		util.inputValue(getOfficePhoneTB(), officephone,"Office Phone Text Box");

	}

	public void mobile(String mobile) {
		util.inputValue(getMobileTB(), mobile,"Mobile Text Box");
	}

	public void title(String title) {
		util.inputValue(getTitleTB(), title,"Title Text Box");
	}

	public void email(String email) {
		util.inputValue(getEmailTB(), email,"Email Text Box");
	}

	public void clickCopyOtherAddress() {
		util.click(getCopyOtherAddressCB(),"Copy Other Address");
	}

	public void clickCopyMailingAddress() {
		util.click(getCopyMailingAddressCB(),"Copy Mailing Address");
	}

	public void mailingStreet(String text) {
		util.inputValue(getMailingStreetTB(), text,"Mailing Street Text Box");
	}

	public void mailingPOBox(String pobox) {
		util.inputValue(getMailingPOTB(), pobox,"Mailing PO Box Text Box");
	}

	public void mailingCity(String city) {
		util.inputValue(getMailingCityTB(), city,"Mailing City Text Box");
	}

	public void mailingState(String state) {
		util.inputValue(getMailingStateTB(), state,"Mailing State Text Box");
	}

	public void mailingPostoleCode(String postolecode) {
		util.inputValue(getMailingPostoleCodeTB(), postolecode,"Mailing Postole Code Text Box");
	}

	public void mailingCountry(String country) {
		util.inputValue(getMailingCountryTB(), country,"Mailing Country Text Box");
	}

	public void otherStreet(String text) {
		util.inputValue(getOtherStreetTB(), text,"Other Street Text Box");
	}

	public void otherPOBox(String pobox) {
		util.inputValue(getOtherPOTB(), pobox,"Ohter PO Box Text Box");
	}

	public void otherCity(String city) {
		util.inputValue(getOtherCityTB(), city,"Other City Txt Box");
	}

	public void otherState(String state) {
		util.inputValue(getOtherStateTB(), state,"Other State Text Box");
	}

	public void otherPostoleCode(String postolecode) {
		util.inputValue(getOtherPostoleCodeTB(), postolecode,"Other Psotole Code Text Box");
	}

	public void otherCountry(String country) {
		util.inputValue(getOtherCountryTB(), country,"Other Country Text Box");
	}
}
