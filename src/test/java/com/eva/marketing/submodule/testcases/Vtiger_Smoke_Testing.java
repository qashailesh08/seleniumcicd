package com.eva.marketing.submodule.testcases;

import org.testng.annotations.Test;

import com.eva.webutil.BaseTest;
import com.evs.app.reausablecode.VtigercommonCode;

public class Vtiger_Smoke_Testing extends BaseTest {

	@Test
	public void verifyVtigerSmokeTesting() {
		VtigercommonCode vtObj = new VtigercommonCode(util);
		vtObj.mouseOverOnMarketing();
		util.verifyIsEnabled(vtObj.getMarketingLT(), true, "Marketing Link");
		util.verifyInnerText(vtObj.getMarketingLT(), "Marketing", "Marketing Link");
//      Verify Enability and inner Text of the Marketing sub modules
		util.verifyIsEnabled(vtObj.getMarkCampaignSub_ModuleLT(), true, "Campaigns Link");
		util.verifyInnerText(vtObj.getMarkCampaignSub_ModuleLT(), "Campaigns", "Campaigns Link");

		util.verifyIsEnabled(vtObj.getMarkAccounts_Sub_ModuleLT(), true, "Accounts Link");
		util.verifyInnerText(vtObj.getMarkAccounts_Sub_ModuleLT(), "Accounts", "Accounts Link");

		util.verifyIsEnabled(vtObj.getMarkContacts_Sub_ModuleLT(), true, "Contacts Link");
		util.verifyInnerText(vtObj.getMarkContacts_Sub_ModuleLT(), "Contacts", "Contacts Link");

		util.verifyIsEnabled(vtObj.getMarkWebmails_Sub_ModuleLT(), true, "Webmail Link");
		util.verifyInnerText(vtObj.getMarkWebmails_Sub_ModuleLT(), "Webmail", "Webmail Link");

		util.verifyIsEnabled(vtObj.getMarkLeads_Sub_ModuleLT(), true, "Leads Link");
		util.verifyInnerText(vtObj.getMarkLeads_Sub_ModuleLT(), "Leads", "Leads Link");

		util.verifyIsEnabled(vtObj.getMarkCalendar_Sub_ModuleLT(), true, "Calendar Link");
		util.verifyInnerText(vtObj.getMarkCalendar_Sub_ModuleLT(), "Calendar", "Calendar Link");

		util.verifyIsEnabled(vtObj.getMarkDocuments_Sub_ModuleLT(), true, "Documents Link");
		util.verifyInnerText(vtObj.getMarkDocuments_Sub_ModuleLT(), "Documents", "Documents Link");
		// clicking on all marketing sub modules
		vtObj.gotoMarkCampaign();
		vtObj.mouseOverOnMarketing();
		vtObj.gotoMarkAccount();
		vtObj.mouseOverOnMarketing();
		vtObj.gotoMarkContacts();
		vtObj.mouseOverOnMarketing();
		vtObj.gotoMarkWebmails();
		vtObj.mouseOverOnMarketing();
		vtObj.gotoMarkLeads();
		vtObj.mouseOverOnMarketing();
		vtObj.gotoMarkCalendar();
		vtObj.mouseOverOnMarketing();
		vtObj.gotoMarkDocuments();
		// Sales
		vtObj.mouseOverOnSales();
		util.verifyIsEnabled(vtObj.getSalesLT(), true, "Sales Link");
		util.verifyInnerText(vtObj.getSalesLT(), "Sales", "Sales Link");
//      Verify Enability and inner Text of the Marketing sub modules
		util.verifyIsEnabled(vtObj.getSalesLeadsSub_ModuleLT(), true, "Leads Link");
		util.verifyInnerText(vtObj.getSalesLeadsSub_ModuleLT(), "Leads", "Leads Link");

		util.verifyIsEnabled(vtObj.getSalesAccountsSub_ModuleLT(), true, "Accounts Link");
		util.verifyInnerText(vtObj.getSalesAccountsSub_ModuleLT(), "Accounts", "Accounts Link");

		util.verifyIsEnabled(vtObj.getSalesContactsSub_ModuleLT(), true, "Contacts Link");
		util.verifyInnerText(vtObj.getSalesContactsSub_ModuleLT(), "Contacts", "Contacts Link");

		util.verifyIsEnabled(vtObj.getSalesPotentialsSub_ModuleLT(), true, "Potentials Link");
		util.verifyInnerText(vtObj.getSalesPotentialsSub_ModuleLT(), "Potentials", "Potentials Link");

		util.verifyIsEnabled(vtObj.getSalesQuotesSub_ModuleLT(), true, "Quotes Link");
		util.verifyInnerText(vtObj.getSalesQuotesSub_ModuleLT(), "Quotes", "Quotes Link");

		util.verifyIsEnabled(vtObj.getSalesOrderSub_ModuleLT(), true, "Sales Order Link");
		util.verifyInnerText(vtObj.getSalesOrderSub_ModuleLT(), "Sales Order", "Sales Order Link");

		util.verifyIsEnabled(vtObj.getSalesInvoiceSub_ModuleLT(), true, "Invoice Link");
		util.verifyInnerText(vtObj.getSalesInvoiceSub_ModuleLT(), "Invoice", "Invoice Link");

		util.verifyIsEnabled(vtObj.getSalesPriceBooksSub_ModuleLT(), true, "Price Books Link");
		util.verifyInnerText(vtObj.getSalesPriceBooksSub_ModuleLT(), "Price Books", "Price Books Link");

		util.verifyIsEnabled(vtObj.getSalesDocumentsSub_ModuleLT(), true, "Documents Link");
		util.verifyInnerText(vtObj.getSalesDocumentsSub_ModuleLT(), "Documents", "Documents Link");

		util.verifyIsEnabled(vtObj.getSalesCalendarSub_ModuleLT(), true, "Calendar Link");
		util.verifyInnerText(vtObj.getSalesCalendarSub_ModuleLT(), "Calendar", "Calendar Link");

		// click on the sub module of the sale header module

		vtObj.gotoSalesLeads();
		vtObj.mouseOverOnSales();
		vtObj.gotoSalesAccounts();
		vtObj.mouseOverOnSales();
		vtObj.gotoSalesContacts();
		vtObj.mouseOverOnSales();
		vtObj.gotoSalesSPotentials();
		vtObj.mouseOverOnSales();
		vtObj.gotoSalesQuotes();
		vtObj.mouseOverOnSales();
		vtObj.gotoSalesOrder();
		vtObj.mouseOverOnSales();
		vtObj.gotoSalesInvoice();
		vtObj.mouseOverOnSales();
		vtObj.gotoSalesPriceBooks();
		vtObj.mouseOverOnSales();
		vtObj.gotoSalesDocuments();
		vtObj.mouseOverOnSales();
		vtObj.gotoSalesCalendar();

	}

}
