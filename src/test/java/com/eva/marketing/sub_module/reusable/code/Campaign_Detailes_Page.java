package com.eva.marketing.sub_module.reusable.code;

import com.eva.webutil.WebUtil;

import lombok.Getter;

@Getter

public class Campaign_Detailes_Page extends Campaign_Detailes_Page_OR {
	private WebUtil util;

	public Campaign_Detailes_Page(WebUtil wt) {
		super(wt);
		this.util = wt;
	}

	public void campName(String input) {

		util.inputValue(getCampNameTB(), input, "");
	}

	public void campType(String selectByValue) {

		util.selectByValue(getCampTypeCB(), selectByValue, "Type Dropdown");
	}

	public void campTargetAudience(String input) {

		util.inputValue(getCampTargetAudienceTB(), input, "Target Audience Text Box");
	}

	public void campSponcor(String input) {

		util.inputValue(getCampSponcorTB(), input, "Sponcor Text Box");
	}

	public void campNumSet(String number) {

		util.inputValue(getCampNumSetTB(), number, "Num Set Text Box");
	}

	public void campStatus(String selectByValue) {

		util.selectByValue(getCampStatusDD(), selectByValue, " Status Dropdown");

	}

	public void campExpectedCloseDate(String date) {

		util.inputValue(getCampExpectedCloseDateTB(), date, "ExpectedClosedate Text Box");

	}

	public void campTargetSize(String targetsize) {

		util.inputValue(getCampTargetSizeTB(), targetsize, "Target Size Text Box");
	}

	public void campBudgetCost(String budgetcost) {

		util.inputValue(getCampBudgetTB(), budgetcost, "Budget Cost Text Box");

	}

	public void campActualCost(String actualcost) {

		util.inputValue(getCampActualCostTB(), actualcost, "Actual Cost Text Box");
	}

	public void campExpectedResponce(String selectByvisibleT) {

		util.selectByVisibleText(getCampExpectedResponceTB(), selectByvisibleT, "Expected Response Dropdown");

	}

	public void campExpectedRevenue(String expectedrevenue) {

		util.inputValue(getCampExpectedRevenueTB(), expectedrevenue, "Expected Revenue Text Box");
	}

	public void campExpectedSalesCount(String expectedSalesCount) {

		util.inputValue(getCampExpectedSalesCountTB(), expectedSalesCount, "Expected Sales Count Text Box");

	}

	public void campActualSalesCount(String actualSalesCount) {

		util.inputValue(getCampActualSalesCountTB(), actualSalesCount, "Actual Sales Count Text Box");
	}

	public void campExpectedResponceCount(String expectedresponcecount) {

		util.inputValue(getCampExpectedResponceCountTB(), expectedresponcecount, "Expected Responce Count Text Box");
	}

	public void campActualResponceCount(String actialresponcecount) {

		util.inputValue(getCampActualResponceCountTB(), actialresponcecount, "Actual Response Count Text Box");

	}

	public void campExpectedROI(String expectedrio) {

		util.inputValue(getCampExpectedRIOTB(), expectedrio, "Expected ROI Text Box");

	}

	public void campActualRIO(String actularoi) {

		util.inputValue(getCampActualROITB(), actularoi, "Actual ROI Text Box");
	}

	public void campUpperSaveButton() {

		util.click(getCampUpperSaveBT(), "Upper Save Button");
	}

	public void campUpperCancelButton() {

		util.click(getCampUpperCancelBT(), "Upper Cancel Button");
	}
}
