package com.eva.marketing.sub_module.reusable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;

@Getter
public class Documents_Detailes_Or {

	public Documents_Detailes_Or(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}

	@CacheLookup
	@FindBy(name = "notes_title")
	private WebElement titleTB;

	@CacheLookup
	@FindBy(name = "assigntype")
	private WebElement assignedToGroupCB;

	@CacheLookup
	@FindBy(name = "assigned_group_id")
	private WebElement groupDD;

	@CacheLookup
	@FindBy(name = "assigntype")
	private WebElement assignedToUserCB;

	@CacheLookup
	@FindBy(name = "filelocationtype")
	private WebElement downloadTypeDD;

	@CacheLookup
	@FindBy(name = "filestatus")
	private WebElement activeCB;

	@CacheLookup
	@FindBy(id = "fileversion")
	private WebElement versionTB;

	@CacheLookup
	@FindBy(xpath = "//input[@id='filename_E__']/following::tr[2]//input[@title='Save [Alt+S]']")
	private WebElement lowerSaveBT;

	@CacheLookup
	@FindBy(xpath = "//input[@id='filename_E__']/following::tr[2]//input[@title='Cancel [Alt+X]']")
	private WebElement lowerCancelsBT;

	@CacheLookup
	@FindBy(xpath = "//b[text()='Basic Information']/preceding::input[@title='Cancel [Alt+X]']")
	private WebElement upperCancelBT;

	@CacheLookup
	@FindBy(xpath = "//b[text()='Basic Information']/preceding::input[@title='Save [Alt+S]']")
	private WebElement upperSaveBT;

}
