package com.eva.myhomepage.reuseable.code;

import com.eva.webutil.WebUtil;

public class HomeLandingPage extends HomeLandingOR {
	private WebUtil util =WebUtil.getInstance();

	public HomeLandingPage(WebUtil util) {
		super(util);
		this.util = util;
	}

	public void clickOnModule() {
		util.click(getCrearePlusBT(), "Create Plus Button");
		util.click(getModuleLT(), "Module");

	}

	public void clickOnRSS() {
		util.click(getCrearePlusBT(), "Create Plus Button");
		util.click(getRssLT(), "RSS");
	}

	public void clickOnDashboard() {
		util.click(getCrearePlusBT(), "Create Plus Button");
		util.click(getDashboardLT(), "Dashboard");
	}

	public void clickOnNotebook() {
		util.click(getCrearePlusBT(), "Create Plus Button");
		util.click(getNotebookLT(), "Notebook");
	}

}
