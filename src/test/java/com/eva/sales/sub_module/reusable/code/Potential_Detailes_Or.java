package com.eva.sales.sub_module.reusable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;

@Getter
public class Potential_Detailes_Or {
	public Potential_Detailes_Or(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}

	@CacheLookup
	@FindBy(name = "potentialname")
	private WebElement potentialnameTB;

	@CacheLookup
	@FindBy(id = "related_to_type")
	private WebElement related_to_typeDD;

	@CacheLookup
	@FindBy(name = "opportunity_type")
	private WebElement typeDD;

	@CacheLookup
	@FindBy(name = "leadsource")
	private WebElement leadsourceDD;

	@CacheLookup
	@FindBy(name = "amount")
	private WebElement amountTB;

	@CacheLookup
	@FindBy(name = "closingdate")
	private WebElement expectedClosingdateTB;

	@CacheLookup
	@FindBy(id = "nextstep")
	private WebElement nextstepTB;

	@CacheLookup
	@FindBy(name = "sales_stage")
	private WebElement sales_stageDD;

	@CacheLookup
	@FindBy(id = "probability")
	private WebElement probabilityTB;

	@CacheLookup
	@FindBy(name = "description")
	private WebElement descriptionTA;

	@CacheLookup
	@FindBy(xpath = "//textarea[@name='description']/parent::td/parent::tr/parent::tbody/tr[13]//input[@title='Save [Alt+S]']")
	private WebElement lowerSaveBT;

	@CacheLookup
	@FindBy(xpath = "//textarea[@name='description']/parent::td/parent::tr/parent::tbody/tr[13]//input[@title='Cancel [Alt+X]']")
	private WebElement lowerCancelBT;

	@CacheLookup
	@FindBy(xpath = "//td[text()='Basic Information']/following::div[2]/input[@title='Save [Alt+S]']")
	private WebElement upperSaveBT;

	@CacheLookup
	@FindBy(xpath = "//td[text()='Basic Information']/following::div[2]/input[@title='Cancel [Alt+X]']")
	private WebElement upperCancelBT;

}
