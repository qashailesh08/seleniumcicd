package com.eva.marketing.sub_module.reusable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;

@Getter
public class Campaign_Detailes_Page_OR {

	public Campaign_Detailes_Page_OR(WebUtil util) {
		PageFactory.initElements(util.getDriver(),this);
	}

	@FindBy(xpath = "//input[@name='campaignname']//preceding::input[@value='  Cancel  ']")
	private WebElement campUpperCancelBT;

	@FindBy(xpath = "//input[@name='campaignname']//preceding::input[@value='  Save  ']")
	private WebElement campUpperSaveBT;

	@FindBy(xpath = "//img[@title='Import Accounts']")
	private WebElement campAccountLT;

	@FindBy(xpath = "//img[@title='Export Documents']")
	private WebElement campAccountExportLT;

	@FindBy(xpath = "//img[@title='Create Document...']")
	private WebElement docPlusBT;

	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement leadPlusBT;

	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement conPlusBT;

	@FindBy(xpath = "//input[@id='targetsize']")
	private WebElement campTargetSizeTB;

	@FindBy(xpath = "//img[@title='Create Account...']")
	private WebElement accPlusBT;

	@FindBy(xpath = "//input[@id='targetsize']")
	private WebElement campBudgetTB;

	@FindBy(xpath = "//input[@id='actualcost']")
	private WebElement campActualCostTB;

	@FindBy(xpath = "//select[@name='expectedresponse']")
	private WebElement campExpectedResponceTB;

	@FindBy(xpath = "//input[@id='expectedrevenue']")
	private WebElement campExpectedRevenueTB;

	@FindBy(xpath = "//input[@id='expectedsalescount']")
	private WebElement campExpectedSalesCountTB;

	@FindBy(xpath = "//input[@id='actualsalescount']")
	private WebElement campActualSalesCountTB;

	@FindBy(xpath = "//input[@id='expectedresponsecount']")
	private WebElement campExpectedResponceCountTB;

	@FindBy(xpath = "//input[@id='actualresponsecount']")
	private WebElement campActualResponceCountTB;

	@FindBy(xpath = "//input[@id='expectedroi']")
	private WebElement campExpectedRIOTB;

	@FindBy(xpath = "//input[@id='actualroi']")
	private WebElement campActualROITB;

	@FindBy(xpath = "//img[@title='Create Campaign...']")
	private WebElement campPlusBT;

	@FindBy(xpath = "//input[@id='jscal_field_closingdate']")
	private WebElement campExpectedCloseDateTB;

	@FindBy(xpath = "//select[@name='campaignstatus']")
	private WebElement campStatusDD;

	@FindBy(xpath = "//input[@id='numsent']")
	private WebElement campNumSetTB;

	@FindBy(xpath = "//input[@id='sponsor']")
	private WebElement campSponcorTB;

	@FindBy(xpath = "//input[@name='targetaudience']")
	private WebElement campTargetAudienceTB;

	@FindBy(xpath = "//select[@name='campaigntype']")
	private WebElement campTypeCB;

	@FindBy(xpath = "//input[@name='campaignname']")
	private WebElement campNameTB;

}
