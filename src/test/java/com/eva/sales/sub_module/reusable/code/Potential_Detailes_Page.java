package com.eva.sales.sub_module.reusable.code;

import com.eva.webutil.WebUtil;

public class Potential_Detailes_Page extends Potential_Detailes_Or {

	private WebUtil util;

	public Potential_Detailes_Page(WebUtil util) {
		super(util);
		this.util = util;
	}

	public void upperSaveButton() {
		util.click(getUpperSaveBT(), "Upper Save Button");
	}

	public void upperCancelButton() {
		util.click(getUpperCancelBT(), "Upper Cancel Button");

	}

	public void lowerSaveButton() {
		util.click(getLowerSaveBT(), "Lower Save Button");
	}

	public void lowerCancelButton() {
		util.click(getLowerCancelBT(), "Lower Cancel Button");
	}

	public void potentialName(String potentialName) {
		util.inputValue(getPotentialnameTB(), potentialName, "Potential Name Text Box");
	}

	public void relatedTo(String selByValue) {
		util.selectByValue(getRelated_to_typeDD(), selByValue, "Related To Dropdown");
	}

	public void amount(String amount) {
		util.inputValue(getAmountTB(), amount, "Amount Text Box");
	}

	public void ExCloseDate(String date) {
		util.inputValue(getExpectedClosingdateTB(), date, "Expected Close Date");
	}

	public void nextStep(String nextStage) {
		util.inputValue(getNextstepTB(), nextStage, "Next Step Text Box");
	}

	public void nextStage(String selByValue) {
		util.selectByValue(getSales_stageDD(), selByValue, "Sales Stage Dropdown");
	}

	public void probility(String probility) {
		util.inputValue(getProbabilityTB(), probility, "Probility Text Box");
	}

	public void description(String description) {
		util.inputValue(getDescriptionTA(), description, "Description Text Box");
	}

}
