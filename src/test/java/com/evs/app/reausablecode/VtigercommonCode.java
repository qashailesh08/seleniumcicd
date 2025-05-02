package com.evs.app.reausablecode;

import com.eva.webutil.WebUtil;

public class VtigercommonCode extends VtigerCommonOr {
	private WebUtil util;

	public VtigercommonCode(WebUtil util) {
		super(util);
		this.util = util;
	}

	public void quit(long time) {
		util.quit(time);
	}

	public void signOut() {
		util.click(getSignOutBT(), "Sign out Button");
	}

	public void clickOnGmailBookMarkelet() {
		util.click(getGmailBookMarkeletLT(), "GmailBookMarkelet");
	}

	public void clickOnVtigerNews() {
		util.click(getVTigerNewsLT(), "Vtiger News");
	}

	public void clickOnFeedback() {
		util.click(getFeedbackLT(), "FeedBack");
	}

	public void clickOnMyPreferences() {
		util.click(getMyPreferenceLT(), "My Preferences");
	}

	public void clickOnHelp() {
		util.click(getHelpLT(), "Help");
	}

	public void clickOnAboutUs() {
		util.click(getAboutUsLT(), "About Us");
	}

	public void gotoHomePage() {
		util.moveToElement(getMyHomePageLT(), "My Home Page");
		util.click(getHomeSub_ModuleLT(), "Home sub_module");
	}

	public void gotoHomeCalender() {
		util.moveToElement(getMyHomePageLT(), "My Home Page");
		util.click(getHomeCalendarSub_ModuleLT(), "Calendar sub_module");
	}

	public void gotoHomeWebmails() {
		util.moveToElement(getMyHomePageLT(), "My Home Page");
		util.click(getHomeWebmailsLT(), "Webmails sub_module");
	}

	public void mouseOverOnMarketing() {
		util.moveToElement(getMarketingLT(), "Marketing Link");
	}

	public void mouseOverOnSales() {
		util.moveToElement(getSalesLT(), "Sales Link");
	}

	public void mouseOverOnAnalytics() {
		util.moveToElement(getAnalyticsLT(), "Analytics");
	}

	public void mouseOverOnSupport() {
		util.moveToElement(getSupportLT(), "Support Link");
	}

	public void mouseOverOnSettings() {
		util.moveToElement(getSettingLT(), "Settings");
	}

	public void gotoMarkCampaign() {
		util.click(getMarkCampaignSub_ModuleLT(), "Marketing Campaign");
	}

	public void gotoMarkAccount() {
		util.click(getMarkAccounts_Sub_ModuleLT(), "Marketing Account");
	}

	public void gotoMarkContacts() {

		util.click(getMarkContacts_Sub_ModuleLT(), "Marketing Contacts");
	}

	public void gotoMarkWebmails() {

		util.click(getMarkWebmails_Sub_ModuleLT(), "Marketing Webmails");
	}

	public void gotoMarkLeads() {
		util.click(getMarkLeads_Sub_ModuleLT(), "Marketing Leads");
	}

	public void gotoMarkCalendar() {
		util.click(getMarkCalendar_Sub_ModuleLT(), "Marketing Calendar");
	}

	public void gotoMarkDocuments() {
		util.click(getMarkDocuments_Sub_ModuleLT(), "Marketing Documents");
	}

	public void gotoSalesLeads() {
		util.click(getSalesLeadsSub_ModuleLT(), "Sales Leads");
	}

	public void gotoSalesAccounts() {
		util.click(getSalesAccountsSub_ModuleLT(), "Sales Accounts");

	}

	public void gotoSalesContacts() {

		util.click(getSalesContactsSub_ModuleLT(), "Sales Contacts");
	}

	public void gotoSalesSPotentials() {

		util.click(getSalesPotentialsSub_ModuleLT(), "Sales Potentials");
	}

	public void gotoSalesQuotes() {

		util.click(getSalesQuotesSub_ModuleLT(), "Sales Quotes");
	}

	public void gotoSalesOrder() {

		util.click(getSalesOrderSub_ModuleLT(), "Sales Order");
	}

	public void gotoSalesInvoice() {

		util.click(getSalesInvoiceSub_ModuleLT(), "Sales Invoice");
	}

	public void gotoSalesPriceBooks() {

		util.click(getSalesPriceBooksSub_ModuleLT(), "Sales Price Books");
	}

	public void gotoSalesDocuments() {

		util.click(getSalesDocumentsSub_ModuleLT(), "Sales Documents");
	}

	public void gotoSalesCalendar() {

		util.click(getSalesCalendarSub_ModuleLT(), "Sales Calendar");
	}

	public void createPlusButton() {
		util.click(getCreatePlusBT(), "Create Plus Button");

	}

	public void formlowerCancelButton() {
		util.click(getFormLowerCancelBT(), "Lower Cancel Button");
	}

	public void formLowerSaveButton() {
		util.click(getFormLowerSaveBT(), "Lower Save Button");
	}

	public void searchData(String searchData, String seleBasedOn, String elementName) {
		util.inputValue(getSearchForBT(), searchData, elementName);
		util.selectByValue(getSelectAndSearchBT(), seleBasedOn, elementName);
		util.click(getSearchBT(), elementName);
	}

	public void deleleSub_Module_Table_Information(String searchData, String seleBasedOn, String elementName) {
		searchData(searchData, seleBasedOn, "Marketing Sub_Module Search Box");
		util.staticWait(3000);
		util.click(getSelectFormDeletionDD(), "data selected");
		util.click(getTableUpperDeleteBT(), elementName);
		util.handleAlert("ok");
	}

	////////////////
	public void gotoSupportTroubleTickets() {

		util.click(getSupportTroubleTicketsLT(), "Sales Trouble Ticketss");
	}

	public void gotoSupportFAQ() {

		util.click(getSupportFAQLT(), "Sales FAQ");
	}

	public void gotoSupportAccounts() {

		util.click(getSupportAccountsLT(), "Sales Accounts");
	}

	public void gotoSupportContacts() {

		util.click(getSupportContactsLT(), "Sales Contacts");
	}

	public void gotoSupportDocuments() {

		util.click(getSupportDocumentsLT(), "Sales Documents");
	}

	public void gotoSupportWebmails() {

		util.click(getSupportWebmailsLT(), "Sales Webmails");
	}

	public void gotoSupportCalendar() {

		util.click(getSupportCalendarLT(), "Sales Calendar");
	}

	public void gotoSupportServiceContract() {

		util.click(getSupportServiceContractLT(), "Sales Service Contract");
	}

	public void gotoSupportProjectMilestones() {

		util.click(getSupportProjectMilestonesLT(), "Sales Project Milestones");
	}

	public void gotoSupportProjectTask() {
		util.click(getSupportProejectTaskLT(), "Sales Project Task");
	}

	public void gotoSupportProject() {

		util.click(getSupportProjectLT(), "Sales Project");
	}

	public void gotoAnalyticsReports() {

		util.click(getAnalyticsReportsLT(), "Analytics Reports");
	}

	public void gotoAnalyticsDashboard() {

		util.click(getAnalyticsDashboardLT(), "Analytics Dashboard");
	}

	public void gotoSettings_Settings() {
		util.click(getSettingsSettingsLT(), "Settings Settings");
	}

	public void gotoSettingsModulesManager() {

		util.click(getSettingsModulesManagerLT(), "Seetings Module Manager");

	}

	public void gotoInventoryProductes() {

		util.click(getInventoryProductsLT(), "Inventory Products");
	}

	public void gotoInventoryVendors() {

		util.click(getInventoryVendorsLT(), "Inventory Vendors");

	}

	public void gotoInventoryPriceBooks() {

		util.click(getInventoryPriceBooksLT(), "Inventory Price Books");
	}

	public void gotoInventoryPurchageOrder() {

		util.click(getInventoryPurchaseOrderLT(), "Inventory Purchase Order");
	}

	public void gotoInventorySalesOrder() {

		util.click(getInventorySalesOrderLT(), "Inventory Sales Order");
	}

	public void gotoInventoryQuotes() {

		util.click(getInventoryQuotesLT(), "Inventory Quotes");

	}

	public void gotoInventoryInvoice() {

		util.click(getInventoryInvoiceLT(), "Inventory Invoice");
	}

	public void gotoInventoryServices() {

		util.click(getInventoryServicesLT(), "Inventory Services");
	}

	public void mouseOverOnInventory() {
		util.moveToElement(getInventoryLT(), "Inventory");
	}

	public void gotoInventoryAssets() {

		util.click(getInventoryAssetsLT(), "Inventory Assets");
	}

	public void mouseOverOnTools() {
		util.moveToElement(getInventoryLT(), "Inventory");
	}

	public void gotoToolsRSS() {

		util.click(getToolsRSSLT(), "Tools RSS");
	}

	public void gotoToolsOurSites() {

		util.click(getToolsOurSitesLT(), "Tools Our Sites");
	}

	public void gotoToolsDocuments() {

		util.click(getToolsDocumentsLT(), "Tools Documents");
	}

	public void gotoToolsPBXManager() {

		util.click(getToolsPBXManagerLT(), "Tools PBX Manager");
	}

	public void gotoToolsComments() {

		util.click(getToolsCommentsLT(), "Tools Comments");
	}

	public void gotoToolsRecycleBin() {

		util.click(getToolsRecycleBinLT(), "Tools Recycle Bin");
	}

	public void gotoToolsSMSNotifier() {

		util.click(getToolsSMSNotifierLT(), "Tools SMS Notifier");
	}

	public void searchQuery(String queryName) {
		util.inputValue(getQuerySearchTB(), queryName, "Query Search Box");
		util.click(getQuerySearchBT(), "Query Find Button");
	}

	public void user() {
		util.click(getUserCB(), "User Check Box");
	}

	public void groupDD(String selByValue) {
		util.click(getGroupCB(), "Group Check Box");
		util.selectByValue(getGroupDD(), selByValue, "Group Dropdown");
	}

	public void editButton() {
		util.click(getUpperEditBT(), "Upper Edit Button");
	}

	public void description(String input) {
		util.inputValue(getDescriptionTA(), input, "Description Text Box");
	}

}
