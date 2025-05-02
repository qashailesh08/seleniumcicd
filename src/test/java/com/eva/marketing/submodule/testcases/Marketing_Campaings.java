package com.eva.marketing.submodule.testcases;

import org.testng.annotations.*;

import com.eva.marketing.sub_module.reusable.code.Campaign_Detailes_Page;
import com.eva.testng.listner.RetryFailedTestCases;
import com.eva.webutil.BaseTest;
import com.eva.webutil.WebUtil;
import com.evs.app.reausablecode.VtigercommonCode;

public class Marketing_Campaings extends BaseTest {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void verifyCreateNewCampaings() {
		VtigercommonCode vtObj = new VtigercommonCode(util);
		Campaign_Detailes_Page campObj = new Campaign_Detailes_Page(util);
		vtObj.mouseOverOnMarketing();
		vtObj.gotoMarkCampaign();
		util.verifyIsEnabled(vtObj.getCreatePlusBT(), true, "Create Plus Button");
		vtObj.createPlusButton();
		util.verifyIsEnabled(campObj.getCampNameTB(), true, "Campaings Name Text Box");
		util.verifyIsEnabled(vtObj.getUserCB(), true, "User Check Box");
		util.verifyIsEnabled(vtObj.getGroupCB(), true, "Group Check Box");
		util.verifyIsEnabled(campObj.getCampTypeCB(), true, "Campaigns Type Check Box");
		util.verifyIsEnabled(campObj.getCampTargetAudienceTB(), true, "Target Audience Text Box");
		util.verifyIsEnabled(campObj.getCampSponcorTB(), true, "Sponsor Text Box");
		util.verifyIsEnabled(campObj.getCampNumSetTB(), true, "Num Set Text Box");
		util.verifyIsEnabled(campObj.getCampStatusDD(), true, "Campaigns Status Drop Down");
		util.verifyIsEnabled(campObj.getCampExpectedCloseDateTB(), true, "Expected Close Date Text Box");
		util.verifyIsEnabled(campObj.getCampTargetSizeTB(), true, "Target Size Text Box");
		util.verifyIsEnabled(campObj.getCampNumSetTB(), true, "Num Set Text Box");
		util.verifyIsEnabled(campObj.getCampStatusDD(), true, "Campaigns Status Drop Down");
	}

}
