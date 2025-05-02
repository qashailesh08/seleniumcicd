package com.eva.myhomepage.reuseable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;
@Getter
public class Module_Details_Or {

	public Module_Details_Or(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}
	@CacheLookup
	@FindBy(id="stufftitle_id")
	private WebElement windowTitileTB;
	
	@CacheLookup
	@FindBy(id="maxentryid")
	private WebElement showItemsDD;
	
	@CacheLookup
	@FindBy(id="selmodule_id")
	private WebElement ModuleDD;
	
	@CacheLookup
	@FindBy(id="selFilterid")
	private WebElement filterByDD;
	
	@CacheLookup
	@FindBy(id="selPrimeFldid")
	private WebElement fieltToShowDD;
	
	@CacheLookup
	@FindBy(xpath = "//input[@id='savebtn']")
	private WebElement saveBT;
	
	@CacheLookup
	@FindBy(xpath = "//input[@id='savebtn']/parent::td/parent::tr//td[2]//input[@name='cancel']")
	private WebElement cancelBT;
	
	@CacheLookup
	@FindBy(xpath = "//b[text()='Add Module']/parent::td/following::td[1]//img[contains(@src,'images/close')]")
	private WebElement cutBT;
	
	
	
	
	
	
	


}
