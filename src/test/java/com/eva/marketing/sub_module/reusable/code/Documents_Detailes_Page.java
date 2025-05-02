package com.eva.marketing.sub_module.reusable.code;

import com.eva.webutil.WebUtil;

public class Documents_Detailes_Page extends Documents_Detailes_Or {
	private WebUtil util;

	public Documents_Detailes_Page(WebUtil util) {
		super(util);
		this.util = util;

	}

	public void title(String titleName) {
		util.inputValue(getTitleTB(), titleName, titleName);
	}

	public void assignedToGroup() {
		util.click(getAssignedToGroupCB(), "Group Check Box");
	}

	public void group(String selByValue) {
		util.selectByValue(getGroupDD(), selByValue, "Group Dropdown");
	}

	public void assignedToUser() {
		util.click(getAssignedToUserCB(), "User Check Box");
	}

	public void dowloadType(String selByValue) {
		util.selectByValue(getDownloadTypeDD(), selByValue, "Download Type Dropdown");
	}

	public void active(String yesOrNO) {
		if (yesOrNO.equalsIgnoreCase("Yes")) {
			util.click(getActiveCB(), "Active CheckBox");
		}
	}

	public void version(String version) {
		util.inputValue(getVersionTB(), version, "Version Text Box");

	}

	public void lowerSaveButton() {
		util.click(getLowerSaveBT(), "Lower Save Button");
	}

	public void lowerCancelButton() {
		util.click(getLowerCancelsBT(), "Lower Cancel Button");
	}

	public void uperSaveButton() {
		util.click(getUpperSaveBT(), "Upper Save Button");

	}

	public void uperCancelButton() {
		util.click(getUpperCancelBT(), "Upper Cancel Button");
	}

}
