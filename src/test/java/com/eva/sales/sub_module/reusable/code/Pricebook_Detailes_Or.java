package com.eva.sales.sub_module.reusable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;
@Getter
public class Pricebook_Detailes_Or {

	public Pricebook_Detailes_Or(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}

	@CacheLookup
	@FindBy(name = "bookname")
	private WebElement pricebookNameTB;

	@CacheLookup
	@FindBy(name = "currency_id")
	private WebElement currnecyDD;

	@CacheLookup
	@FindBy(name = "active")
	private WebElement activeCB;

	@CacheLookup
	@FindBy(xpath = "description")
	private WebElement descriptionTA;

	@CacheLookup
	@FindBy(xpath = "//input[@name='bookname']/preceding::input[@title='Save [Alt+S]']")
	private WebElement upperSaveBT;

	@CacheLookup
	@FindBy(xpath = "//input[@name='bookname']/preceding::input[@title='Cancel [Alt+X]']")
	private WebElement uppercancelBT;

	@CacheLookup
	@FindBy(xpath = "//b[text()='Description Name:']/following::input[@title='Save [Alt+S]']")
	private WebElement lowerSaveBT;

	@CacheLookup
	@FindBy(xpath = "//b[text()='Description Name:']/following::input[@title='Cancel [Alt+X]']")
	private WebElement lowercancelBT;

}
