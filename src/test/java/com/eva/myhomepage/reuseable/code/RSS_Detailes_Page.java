package com.eva.myhomepage.reuseable.code;

import com.eva.webutil.WebUtil;

public class RSS_Detailes_Page extends RSS_Detailes_Or {
	private WebUtil util;

	public RSS_Detailes_Page(WebUtil util) {
		super(util);
		this.util = util;
	}

	public void windowTitle(String windowTitle) {
		util.inputValue(getWindowTitleTB(), windowTitle, "Window Title Text Box");
	}

	public void show(int selByIndex) {
		util.selectByIndex(getShowDD(), selByIndex, "Show Dropdown");
	}

	public void RssUrl(String rssUrl) {
		util.inputValue(getRssUrlTB(), rssUrl, "RSS Url Text Box");
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
