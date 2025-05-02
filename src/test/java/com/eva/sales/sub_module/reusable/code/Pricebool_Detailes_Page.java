package com.eva.sales.sub_module.reusable.code;

import com.eva.webutil.WebUtil;

public class Pricebool_Detailes_Page extends Pricebook_Detailes_Or {
	private WebUtil util;

	public Pricebool_Detailes_Page(WebUtil util) {
		super(util);
		this.util = util;
	}

	public void upperSaveButton() {
		util.click(getUpperSaveBT(), "Upper Save Button");
	}

	public void upperCancelButton() {
		util.click(getUppercancelBT(), "Upper Cancel Button");
	}

	public void lowerSaveButton() {
		util.click(getLowerSaveBT(), "Lower Save Button");
	}

	public void lowerCancelButton() {
		util.click(getLowercancelBT(), "Lower Cancel Button");
	}

	public void pricebookName(String bookName) {
		util.inputValue(getPricebookNameTB(), bookName, "Price Book Name Text Box");
	}

	public void active(String yesORNo) {
		if (yesORNo.contains("y")) {
			util.click(getActiveCB(), "Active Check Box");
		}
	}

	public void currency(String selByValue) {
		util.selectByValue(getCurrnecyDD(), selByValue, "Currency Dropdown");
	}

	public void description(String description) {
		util.inputValue(getDescriptionTA(), description, "Description Text Area");
	}

}
