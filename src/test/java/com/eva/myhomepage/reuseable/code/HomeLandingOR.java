package com.eva.myhomepage.reuseable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;

@Getter

public class HomeLandingOR {
	public HomeLandingOR(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}
	
	@CacheLookup
	@FindBy(xpath = "//img[contains(@onclick,'fnAddWindow')]")
	private WebElement crearePlusBT;
	
	@CacheLookup
	@FindBy(id = "addmodule")
	private WebElement moduleLT;
	
	@CacheLookup
	@FindBy(id = "addrss")
	private WebElement rssLT;
	
	@CacheLookup
	@FindBy(id = "adddash")
	private WebElement dashboardLT;
	
	@CacheLookup
	@FindBy(id = "addNotebook")
	private WebElement notebookLT;
	
	
}
