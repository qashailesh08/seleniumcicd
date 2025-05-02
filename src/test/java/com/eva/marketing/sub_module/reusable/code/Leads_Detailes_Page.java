package com.eva.marketing.sub_module.reusable.code;

import com.eva.webutil.WebUtil;

public class Leads_Detailes_Page extends Leads_Page_Detailes_Or {
	private WebUtil util;

	public Leads_Detailes_Page(WebUtil wt) {
		super(wt);
		this.util = wt;
	}

	public void firstNameDD(String selByValue) {
		util.selectByValue(getFirstNameDD(), selByValue,"First Name Dropdown");
	}

	public void firstName(String firstname) {
		util.inputValue(getFirstNameTB(), firstname,"First Name Text Box");
	}

	public void lastName(String lastname) {
		util.inputValue(getLastNameTB(), lastname,"Last Name Text Box");
	}

	public void company(String companyname) {
		util.inputValue(getCompanyTB(), companyname,"Company Text Box");
	}

	public void title(String title) {
		util.inputValue(getTitleTB(), title,"Title Text Box");
	}

	public void leadSourceDD(String selByValue) {
		util.selectByValue(getLeadSourceDD(), selByValue,"Lead Source Dropdown");
	}

	public void leadStatusDD(String selByValue) {
		util.selectByValue(getLeadStatusDD(), selByValue,"Lead Status Dropdown");
	}

	public void phone(String phone) {
		util.inputValue(getPhoneTB(), phone,"Phone Text Box");
	}

	public void mobile(String mobile) {
		util.inputValue(getMobileTB(), mobile,"Mobile Text Box");
	}

	public void fax(String fax) {
		util.inputValue(getFaxTB(), fax,"Fax Text Box");
	}

	public void email(String email) {
		util.inputValue(getEmailTB(), email,"Email Text Box");
	}

	public void street(String street) {
		util.inputValue(getStreetTA(), street,"Street Text Box");
	}

	public void postoleCode(String postolecode) {
		util.inputValue(getPostoleCodeTB(), postolecode,"Psotole Code Text Box");
	}

	public void country(String country) {
		util.inputValue(getCountryTB(), country," Country Text Box");
	}

	public void poBox(String pobox) {
		util.inputValue(getPoBoxTB(), pobox,"PO Box Text Box");
	}

	public void city(String city) {
		util.inputValue(getCityTB(), city,"City Text Box");
	}

	public void state(String state) {
		util.inputValue(getStateTB(), state,"State Text Box");
	}

}
