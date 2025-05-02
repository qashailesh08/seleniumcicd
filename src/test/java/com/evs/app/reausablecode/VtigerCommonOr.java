package com.evs.app.reausablecode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;

@Getter

public class VtigerCommonOr {

	public VtigerCommonOr(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}

	@CacheLookup
	@FindBy(xpath = "//a[contains(@href,'Users&action=Logout')]")
	private WebElement signOutBT;

	@CacheLookup
	@FindBy(xpath = "//a[contains(@href,'GmailBookmarklet')]")
	private WebElement gmailBookMarkeletLT;

	@CacheLookup
	@FindBy(xpath = "//a[contains(@onclick,'vtiger_news')]")
	private WebElement vTigerNewsLT;

	@CacheLookup
	@FindBy(xpath = "//a[contains(@onclick,'feedback')]")
	private WebElement feedbackLT;

	@CacheLookup
	@FindBy(linkText = "My Preferences")
	private WebElement myPreferenceLT;

	@CacheLookup
	@FindBy(linkText = "Help")
	private WebElement helpLT;

	@CacheLookup
	@FindBy(linkText = "About Us")
	private WebElement aboutUsLT;

	@CacheLookup
	@FindBy(xpath = "//td[contains(@onmouseover,'fnDropDown')]//a[contains(@href,'My Home Page')]")
	private WebElement myHomePageLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='My Home Page_sub']//a[contains(@href,'Home&action')]")
	private WebElement homeSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='My Home Page_sub']//a[contains(@href,'Calendar&action')]")
	private WebElement homeCalendarSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='My Home Page_sub']//a[contains(@href,'Webmails&action')]")
	private WebElement homeWebmailsLT;

	@CacheLookup
	@FindBy(linkText = "Marketing")
	private WebElement marketingLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[contains(@href,'Campaigns&action')]")
	private WebElement markCampaignSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[contains(@href,'Accounts&action')]")
	private WebElement markAccounts_Sub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[contains(@href,'Contacts&action')]")
	private WebElement markContacts_Sub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[contains(@href,'Webmails&action')]")
	private WebElement markWebmails_Sub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[contains(@href,'Leads&action')]")
	private WebElement markLeads_Sub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[contains(@href,'Calendar&action')]")
	private WebElement markCalendar_Sub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[contains(@href,'Documents&action')]")
	private WebElement markDocuments_Sub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//td[contains(@onmouseover,'fnDropDown')]//a[contains(@href,'Sales')]")
	private WebElement salesLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Sales_sub']//a[contains(@href,'Leads&action')]")
	private WebElement salesLeadsSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Sales_sub']//a[contains(@href,'Accounts&action')]")
	private WebElement salesAccountsSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Sales_sub']//a[contains(@href,'Contacts&action')]")
	private WebElement salesContactsSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Sales_sub']//a[contains(@href,'Potentials&action')]")
	private WebElement salesPotentialsSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Sales_sub']//a[contains(@href,'Quotes&action')]")
	private WebElement salesQuotesSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Sales_sub']//a[contains(@href,'SalesOrder&action')]")
	private WebElement salesOrderSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Sales_sub']//a[contains(@href,'Invoice&action')]")
	private WebElement salesInvoiceSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Sales_sub']//a[contains(@href,'PriceBooks&action')]")
	private WebElement salesPriceBooksSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Sales_sub']//a[contains(@href,'Documents&action')]")
	private WebElement salesDocumentsSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Sales_sub']//a[contains(@href,'Calendar&action')]")
	private WebElement salesCalendarSub_ModuleLT;

	@CacheLookup
	@FindBy(xpath = "//img[contains(@title,'Create')]")
	private WebElement createPlusBT;

	@CacheLookup
	@FindBy(xpath = "//textarea[@name='description']/following::input[@title='Cancel [Alt+X]']")
	private WebElement formLowerCancelBT;

	@CacheLookup
	@FindBy(xpath = "//textarea[@name='description']/following::input[@title='Save [Alt+S]']")
	private WebElement formLowerSaveBT;

	@CacheLookup
	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement searchForBT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='basicsearchcolumns_real']/select[@id='bas_searchfield']")
	private WebElement selectAndSearchBT;

	@CacheLookup
	@FindBy(xpath = "//input[@name='submit']")
	private WebElement searchBT;

	@CacheLookup
	@FindBy(xpath = "//input[@name='selectall']/following::input[@name='selected_id']")
	private WebElement selectFormDeletionDD;

	@CacheLookup
	@FindBy(xpath = "//input[@name='selectall']//preceding::input[@value='Delete']")
	private WebElement tableUpperDeleteBT;

	@CacheLookup
	@FindBy(xpath = "//td[contains(@onmouseover,'fnDropDown')]//a[contains(@href,'parenttab=Support')]")
	private WebElement supportLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Support_sub']//a[contains(@href,'HelpDesk&action')]")
	private WebElement supportTroubleTicketsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Support_sub']//a[contains(@href,'Faq&action')]")
	private WebElement supportFAQLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Support_sub']//a[contains(@href,'Accounts&action')]")
	private WebElement supportAccountsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Support_sub']//a[contains(@href,'Contacts&action')]")
	private WebElement supportContactsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Support_sub']//a[contains(@href,'Documents&action')]")
	private WebElement supportDocumentsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Support_sub']//a[contains(@href,'Webmails&action')]")
	private WebElement supportWebmailsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Support_sub']//a[contains(@href,'Calendar&action')]")
	private WebElement supportCalendarLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Support_sub']//a[contains(@href,'ServiceContracts&action')]")
	private WebElement supportServiceContractLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Support_sub']//a[contains(@href,'ProjectMilestone&action')]")
	private WebElement supportProjectMilestonesLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Support_sub']//a[contains(@href,'ProjectTask&action')]")
	private WebElement supportProejectTaskLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Support_sub']//a[contains(@href,'Project&action')]Fs")
	private WebElement supportProjectLT;

	@CacheLookup
	@FindBy(xpath = "//td[contains(@onmouseover,'fnDropDown')]/a[contains(@href,'parenttab=Analytics')]")
	private WebElement analyticsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Analytics_sub']//a[contains(@href,'Reports&action')]")
	private WebElement analyticsReportsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Analytics_sub']//a[contains(@href,'Dashboard&action')]")
	private WebElement analyticsDashboardLT;

	@CacheLookup
	@FindBy(xpath = "//td[contains(@onmouseover,'fnDropDown')]/a[contains(@href,'parenttab=Setting')]")
	private WebElement settingLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Settings_sub']//a[contains(@href,'index&parenttab=Settings')]")
	private WebElement settingsSettingsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Settings_sub']//a[contains(@href,'ModuleManager&parenttab=Settings')]")
	private WebElement settingsModulesManagerLT;

	@CacheLookup
	@FindBy(xpath = "//td[contains(@onmouseover,'fnDropDown')]//a[contains(@href,'parenttab=Inventory')]")
	private WebElement inventoryLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[contains(@href,'Products&action')]")
	private WebElement inventoryProductsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[contains(@href,'Vendors&action')]")
	private WebElement inventoryVendorsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[contains(@href,'PriceBooks&action')]")
	private WebElement inventoryPriceBooksLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[contains(@href,'PurchaseOrder&action')]")
	private WebElement inventoryPurchaseOrderLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[contains(@href,'SalesOrder&action')]")
	private WebElement inventorySalesOrderLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[contains(@href,'Quotes&action')]")
	private WebElement inventoryQuotesLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[contains(@href,'Invoice&action')]")
	private WebElement inventoryInvoiceLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[contains(@href,'Services&action')]")
	private WebElement inventoryServicesLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[contains(@href,'Assets&action')]")
	private WebElement inventoryAssetsLT;

	@CacheLookup
	@FindBy(xpath = "//td[contains(@onmouseover,'fnDropDown')]//a[contains(@href,'parenttab=Tools')]")
	private WebElement toolsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Tools_sub']//a[contains(@href,'Rss&action')]")
	private WebElement toolsRSSLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Tools_sub']//a[contains(@href,'Portal&action')]")
	private WebElement toolsOurSitesLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Tools_sub']//a[contains(@href,'Documents&action')]")
	private WebElement toolsDocumentsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Tools_sub']//a[contains(@href,'PBXManager&action')]")
	private WebElement toolsPBXManagerLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Tools_sub']//a[contains(@href,'Comments&action')]")
	private WebElement toolsCommentsLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Tools_sub']//a[contains(@href,'RecycleBin&action')]")
	private WebElement toolsRecycleBinLT;

	@CacheLookup
	@FindBy(xpath = "//div[@id='Tools_sub']//a[contains(@href,'SMSNotifier&action')]")
	private WebElement toolsSMSNotifierLT;

	@CacheLookup
	@FindBy(name = "query_string")
	private WebElement querySearchTB;

	@CacheLookup
	@FindBy(name = "//input[@value='Find']")
	private WebElement querySearchBT;

	@CacheLookup
	@FindBy(xpath = "//input[@value='T']")
	private WebElement groupCB;

	@CacheLookup
	@FindBy(xpath = "//input[@value='U']")
	private WebElement userCB;

	@CacheLookup
	@FindBy(name = "assigned_group_id")
	private WebElement groupDD;

	@FindBy(xpath = "//td[text()='Actions']/preceding::input[@title='Edit [Alt+E]']")
	private WebElement upperEditBT;

	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement descriptionTA;
}
