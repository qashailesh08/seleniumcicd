package com.eva.myhomepage.reuseable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;

@Getter
public class RSS_Detailes_Or {

	public RSS_Detailes_Or(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}

	@CacheLookup
	@FindBy(id = "stufftitle_id")
	private WebElement windowTitleTB;

	@CacheLookup
	@FindBy(id = "maxentryid")
	private WebElement showDD;

	@CacheLookup
	@FindBy(id = "txtRss_id")
	private WebElement rssUrlTB;

	@CacheLookup
	@FindBy(xpath = "(//input[@id='savebtn'])[1]")
	private WebElement saveBT;

	@CacheLookup
	@FindBy(xpath = "(//input[@id='savebtn'])[1]/parent::td/parent::tr/child::td[2]//input[@name='cancel']")
	private WebElement cancelBT;

	@CacheLookup
	@FindBy(xpath = "//td[@id='divHeader']/parent::tr/child::td[2]/a/img[@src='themes/images/close.gif']")
	private WebElement cutBT;

}
