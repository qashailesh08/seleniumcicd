package com.eva.myhomepage.reuseable.code;

import com.eva.webutil.WebUtil;

public class Dashboard_Detailes_Page extends dashboard_Detailes_Or {

	private WebUtil util;

	public Dashboard_Detailes_Page(WebUtil util) {
		super(util);
		this.util = util;
	}

	public void cutButton() {
		util.click(getCutBT(), "Cut Button");

	}

	public void windowTitle(String windowTitleName) {
		util.inputValue(getWindowTitleTB(), windowTitleName, "Window Title Text Box");
	}

	public void dashboardName(String selByValue) {
		util.selectByValue(getDashboardNameDD(), selByValue, "Dashboard Name Dropdown");

	}

	public void dashboardType(String selByValue) {
		util.selectByValue(getDashboardTypeDD(), selByValue, "Dashboard Type Dropdown");

	}

	public void saveButton() {
		util.click(getSaveBT(), "Save Button");
	}

	public void cancelButton() {
		util.click(getCancelBT(), "Cancel Button");
	}
}
