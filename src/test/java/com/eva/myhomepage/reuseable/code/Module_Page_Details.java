package com.eva.myhomepage.reuseable.code;

import com.eva.webutil.WebUtil;

public class Module_Page_Details extends Module_Details_Or {
	private WebUtil util;

	public Module_Page_Details(WebUtil util) {
		super(util);
		this.util = util;

	}

	public void windowTitle(String windowTitle) {
		util.inputValue(getWindowTitileTB(), windowTitle, "Window Title Text Box");
	}

	public void show(int number) {
		util.selectByIndex(getShowItemsDD(), number, "Show Dropdown");
	}

	public void Module(String selSub_ModuleNameByValue) {
		util.selectByValue(getModuleDD(), selSub_ModuleNameByValue, "Module Dropdown");
	}

	public void filterBy(String selByValue) {
		util.selectByValue(getFilterByDD(), selByValue, "Filter By Dropdown");
	}

	public void feildTOShow(String selByValue1) {
		util.staticWait(3000);
		util.selectByValue(getFieltToShowDD(), selByValue1, "Feild To Show Dropdown");
//		util.selectByValue(getFieltToShowDD(), selByValue2, "Feild To Show Dropdown");
	}

	public void saveButton() {
		util.click(getSaveBT(), "Save Button");
	}

	public void cancelButton() {
		util.click(getCancelBT(), "Cancel Button");
	}

	public void cutButton() {
		util.click(getCutBT(), "Cut Button");
	}

}
