package com.eva.myhomepage.reuseable.code;

import com.eva.webutil.WebUtil;

public class Notebook_Detailes_Page extends Notebook_Detailes_Or {
	private WebUtil util;

	public Notebook_Detailes_Page(WebUtil util) {
		super(util);
		this.util = util;
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
	public void windowTitle(String windowTitleName) {
		util.inputValue(getWindowTitleTB(), windowTitleName, "Window Title Text Box");
	}
}
