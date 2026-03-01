package com.eva.marketing.submodule.testcases;

import org.testng.annotations.Test;

import com.eva.marketing.sub_module.reusable.code.Leads_Detailes_Page;
import com.eva.webutil.BaseTest;
import com.evs.app.reausablecode.VtigercommonCode;

import listeners.RetryFailedTestCases;

public class MarketingLeads extends BaseTest {
//(priority=1,groups = { "smoke" })
	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void verifyCreateLeads() {
		VtigercommonCode vtObj = new VtigercommonCode(util);
		vtObj.mouseOverOnMarketing();
		vtObj.gotoMarkLeads();
		util.verifyIsEnabled(vtObj.getCreatePlusBT(), true, "Create Plus Button");
		vtObj.createPlusButton();
		Leads_Detailes_Page leadsObj = new Leads_Detailes_Page(util);
		leadsObj.firstNameDD("Mr.");
		leadsObj.firstName("Vikash");
		util.verifyAttribute(leadsObj.getFirstNameTB(), "Vikash", "value", "First Name Text Box");
		leadsObj.lastName("Kumar");
		util.verifyAttribute(leadsObj.getLastNameTB(), "Kumar", "value", "Last Name Text Box");
		leadsObj.company("SM Web Solutions");
		util.verifyAttribute(leadsObj.getCompanyTB(), "SM Web Solutions", "value", "Company Text Box");
		leadsObj.title("Good Vtiger CRM");
		util.verifyAttribute(leadsObj.getTitleTB(), "Good Vtiger CRM", "value", "Title Text Box");
		leadsObj.leadSourceDD("Cold Call");
		util.verifyFirstSelectedOption(leadsObj.getLeadSourceDD(), "Cold Call", "Lead Source Drop down");
		leadsObj.leadStatusDD("Hot");
		util.verifyFirstSelectedOption(leadsObj.getLeadStatusDD(), "Hot", "Lead Status Drop down");
		leadsObj.phone("+91 7654 8900 34");
		util.verifyAttribute(leadsObj.getPhoneTB(), "+91 7654 8900 34", "value", "Phone Text Box");
		leadsObj.mobile("846593755");
		util.verifyAttribute(leadsObj.getMobileTB(), "846593755", "value", "Mobile Text Box");
		leadsObj.fax("MailBox");
		util.verifyAttribute(leadsObj.getFaxTB(), "MailBox", "value", "Fax Text Box");
		leadsObj.email("vikashkumar867@gmail.com");
		util.verifyAttribute(leadsObj.getEmailTB(), "vikashkumar867@gmail.com", "value", "Email Text Box");
		vtObj.groupDD("4");
		util.verifyFirstSelectedOption(vtObj.getGroupDD(), "Support Group", "Group Drop down");
		leadsObj.street("Mondh");
		util.verifyAttribute(leadsObj.getStreetTA(), "Mondh", "value", "Street Text Box");
		leadsObj.postoleCode("221401");
		util.verifyAttribute(leadsObj.getPostoleCodeTB(), "221401", "value", "Postole Code Text Box");
		leadsObj.country("India");
		util.verifyAttribute(leadsObj.getCountryTB(), "India", "value", "Country Text Box");
		leadsObj.poBox("Suriawa");
		util.verifyAttribute(leadsObj.getPoBoxTB(), "Suriawa", "value", "PO Box Text Box");
		leadsObj.city("Bhadohi");
		util.verifyAttribute(leadsObj.getCityTB(), "Bhadohi", "value", "City Text Box");
		leadsObj.state("Utter Pradesh");
		util.verifyAttribute(leadsObj.getStateTB(), "Utter Pradesh", "value", "State Text Box");
		vtObj.description("Always remember the things you like more that you won't achieve");
//		util.verifyAttribute(leadsObj.getFirstNameTB(), "Shailesh", "value", "First Name Text Box");
//		util.verifyAttribute(leadsObj.getLastNameTB(), "Kumar", "value", "Last Name Text Box");
//		util.verifyAttribute(leadsObj.getCompanyTB(), "SM Web Solutions", "value", "Company Text Box");
//		util.verifyAttribute(leadsObj.getTitleTB(), "Good Vtiger CRM", "value", "Title Text Box");
//		util.verifyAttribute(leadsObj.getPhoneTB(), "+91 7654 8900 34", "value", "Phone Text Box");
//		util.verifyAttribute(leadsObj.getMobileTB(), "846593755", "value", "Mobile Text Box");
//		util.verifyAttribute(leadsObj.getFaxTB(), "Yahoo", "value", "Fax Text Box");
//		util.verifyAttribute(leadsObj.getEmailTB(), "shaileshkumar867@gmail.com", "value", "Email Text Box");
//		util.verifyAttribute(leadsObj.getStreetTA(), "Mondh", "value", "Street Text Box");
//		util.verifyAttribute(leadsObj.getPostoleCodeTB(), "221401", "value", "Postole Code Text Box");
//		util.verifyAttribute(leadsObj.getCountryTB(), "India", "value", "Country Text Box");
//		util.verifyAttribute(leadsObj.getPoBoxTB(), "Suriawa", "value", "PO Box Text Box");
//		util.verifyAttribute(leadsObj.getCityTB(), "Bhadohi", "value", "City Text Box");
//		util.verifyAttribute(leadsObj.getStateTB(), "Utter Pradesh", "value", "State Text Box");
		util.verifyAttribute(vtObj.getDescriptionTA(),
				"Always remember the things you like more that you won't achieve", "value", "Description Text Box");
	}
}
