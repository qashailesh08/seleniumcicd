package com.eva.marketing.submodule.testcases;

import org.testng.annotations.Test;

import com.eva.marketing.sub_module.reusable.code.AccountsDetailesPage;
import com.eva.marketing.sub_module.reusable.code.Campaign_Detailes_Page;
import com.eva.marketing.sub_module.reusable.code.Leads_Detailes_Page;
import com.eva.webutil.BaseTest;
import com.eva.webutil.WebUtil;
import com.evs.app.reausablecode.VtigercommonCode;

import listeners.RetryFailedTestCases;

public class MarketingAccounts extends BaseTest {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void verifyCreateNewAccount() {

		VtigercommonCode vtObj = new VtigercommonCode(util);
		AccountsDetailesPage accObj = new AccountsDetailesPage(util);
		vtObj.mouseOverOnMarketing();
		util.verifyIsEnabled(vtObj.getMarkAccounts_Sub_ModuleLT(), true, "Marketing Account Link");
		vtObj.gotoMarkAccount();
		util.verifyIsEnabled(vtObj.getCreatePlusBT(), true, "Create Plus Button");
		vtObj.createPlusButton();
		accObj.accountName("Anshu Maury");
		util.verifyAttribute(accObj.getAccountNameTB(), "Anshu Maury", "value", "Account Name");
		accObj.phone("8354938456");
		util.verifyAttribute(accObj.getPhoneTB(), "8354938456", "value", "Phone");
		accObj.fax("Yahoo");
		util.verifyAttribute(accObj.getFaxTB(), "Yahoo", "value", "Fax");
		accObj.email("riya9263@gmail.com");
		util.verifyAttribute(accObj.getEmailTB(), "riya9263@gmail.com", "value", "Email");
		accObj.billAddress("Bhadohi, Mondh , Utter Pradesh");
		util.verifyAttribute(accObj.getBillAddressTB(), "Bhadohi, Mondh , Utter Pradesh", "value", "Billing Address");
		accObj.billCity("Bhadohi");
		util.verifyAttribute(accObj.getBillCityTB(), "Bhadohi", "value", "Billing City");
		accObj.billState("Utter Pradesh");
		util.verifyAttribute(accObj.getBillStateTB(), "Utter Pradesh", "value", "Billing State");
		accObj.billCountry("India");
		util.verifyAttribute(accObj.getBillCountryTB(), "India", "value", "Billing Country");
		accObj.billPostoleCode("221401");
		util.verifyAttribute(accObj.getBillPostoleCodeTB(), "221401", "value", "Billing Postole Code");
		accObj.copyBillingAddress();
//		util.verifyAttribute(accObj.getAccountNameTB(), "Riya", "value", "Account Name");
//		util.verifyAttribute(accObj.getPhoneTB(), "8354938456", "value", "Phone");
//		util.verifyAttribute(accObj.getFaxTB(), "Yahoo", "value", "Fax");
//		util.verifyAttribute(accObj.getEmailTB(), "riya9263@gmail.com", "value", "Email");
//		util.verifyAttribute(accObj.getBillAddressTB(), "Bhadohi, Mondh , Utter Pradesh", "value", "Billing Address");
//		util.verifyAttribute(accObj.getBillCityTB(), "Bhadohi", "value", "Billing City");
//		util.verifyAttribute(accObj.getBillStateTB(), "Utter Pradesh", "value", "Billing State");
//		util.verifyAttribute(accObj.getBillCountryTB(), "India", "value", "Billing Country");
//		util.verifyAttribute(accObj.getBillPostoleCodeTB(), "221401", "value", "Billing Postole Code");
		util.verifyAttribute(accObj.getShippAddressTB(), "Bhadohi, Mondh , Utter Pradesh", "value", "Shipping Address");
		util.verifyAttribute(accObj.getShippCityTB(), "Bhadohi", "value", "Shipping City");
		util.verifyAttribute(accObj.getShippStateTB(), "Utter Pradesh", "value", "Shipping State");
		util.verifyAttribute(accObj.getShippCountryTB(), "India", "value", "Shipping Country");
		util.verifyAttribute(accObj.getShippPostoleCodeTB(), "221401", "value", "Shipping Postole Code");
//		vtObj.formLowerSaveButton();
//		util.verifyIsEnabled(vtObj.getUpperEditBT(), true, "Account Upper Edit Button");
//		util.verifyInnerText(accObj.getAccNoIT(), " ACC150", "Accounts No");

	}

//	@Test(priority = 1)
	public void verifyAccountDelete() {

		VtigercommonCode vtObj = new VtigercommonCode(util);
		vtObj.mouseOverOnMarketing();
		vtObj.gotoMarkAccount();
		vtObj.deleleSub_Module_Table_Information("Riya", "accountname", "Accounts Sub_Module");
		util.verifyIsEnabled(vtObj.getMarkAccounts_Sub_ModuleLT(), true, "Marketing Account Link");
	}

//	@Test
	public void verifyCreateNewCampaings() {
		VtigercommonCode vtObj = new VtigercommonCode(util);
		Campaign_Detailes_Page campObj = new Campaign_Detailes_Page(util);
		vtObj.mouseOverOnMarketing();
		vtObj.gotoMarkCampaign();
		util.verifyIsEnabled(vtObj.getCreatePlusBT(), true, "Create Plus Button");
		vtObj.createPlusButton();
		util.verifyIsEnabled(campObj.getCampNameTB(), true, "Campaings Name Text Box");
//		util.verifyIsEnabled(vtObj.getUserCB(), true, "User Check Box");
//		util.verifyIsEnabled(vtObj.getGroupCB(), true, "Group Check Box");
//		util.verifyIsEnabled(campObj.getCampTypeCB(), true, "Campaigns Type Check Box");
//		util.verifyIsEnabled(campObj.getCampTargetAudienceTB(), true, "Target Audience Text Box");
//		util.verifyIsEnabled(campObj.getCampSponcorTB(), true, "Sponsor Text Box");
//		util.verifyIsEnabled(campObj.getCampNumSetTB(), true, "Num Set Text Box");
//		util.verifyIsEnabled(campObj.getCampStatusDD(), true, "Campaigns Status Drop Down");
//		util.verifyIsEnabled(campObj.getCampExpectedCloseDateTB(), true, "Expected Close Date Text Box");
//		util.verifyIsEnabled(campObj.getCampTargetSizeTB(), true, "Target Size Text Box");
//		util.verifyIsEnabled(campObj.getCampNumSetTB(), true, "Num Set Text Box");
//		util.verifyIsEnabled(campObj.getCampStatusDD(), true, "Campaigns Status Drop Down");
	}

//	@Test
	public void verifyCreateLeads() {
		VtigercommonCode vtObj = new VtigercommonCode(util);
		vtObj.mouseOverOnMarketing();
		vtObj.gotoMarkLeads();
		util.verifyIsEnabled(vtObj.getCreatePlusBT(), true, "Create Plus Button");
		vtObj.createPlusButton();
		Leads_Detailes_Page leadsObj = new Leads_Detailes_Page(util);
		leadsObj.firstNameDD("Mr.");
		leadsObj.firstName("Shailesh");
		util.verifyAttribute(leadsObj.getFirstNameTB(), "Shailesh", "value", "First Name Text Box");
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
		leadsObj.fax("Yahoo");
		util.verifyAttribute(leadsObj.getFaxTB(), "Yahoo", "value", "Fax Text Box");
		leadsObj.email("shaileshkumar867@gmail.com");
		util.verifyAttribute(leadsObj.getEmailTB(), "shaileshkumar867@gmail.com", "value", "Email Text Box");
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
