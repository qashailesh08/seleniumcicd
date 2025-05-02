package com.eva.myhomepage.reuseable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;

@Getter
public class CalendarLandingOR {

	public CalendarLandingOR(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}

	@CacheLookup
	@FindBy(xpath = "//a[contains(@href,'ListView&module')]")
	private WebElement allEventsAndTodosLT;

	@CacheLookup
	@FindBy(xpath = "//a[contains(@href,'view=day&hour')]")
	private WebElement dayLT;

	@CacheLookup
	@FindBy(xpath = "//a[contains(@href,'view=week&hour')]")
	private WebElement weekLT;

	@CacheLookup
	@FindBy(xpath = "//a[contains(@href,'view=month&hour')]")
	private WebElement monthLT;

	@CacheLookup
	@FindBy(xpath = "//a[contains(@href,'view=year&hour')]")
	private WebElement yearLT;

	@CacheLookup
	@FindBy(xpath = "//a[contains(@href,'event&parenttab')]")
	private WebElement eventsLT;

	@CacheLookup
	@FindBy(xpath = "//a[contains(@href,'todo&parenttab')]")
	private WebElement to_DosLT;

	@CacheLookup
	@FindBy(xpath = "//td[contains(@onmouseover,'fnAddEvent')]")
	private WebElement addMenuLT;

	@CacheLookup
	@FindBy(id = "addcall")
	private WebElement callLT;

	@CacheLookup
	@FindBy(id = "addmeeting")
	private WebElement meetingLT;

	@CacheLookup
	@FindBy(id = "addtodo")
	private WebElement to_DoLT;

	@CacheLookup
	@FindBy(xpath = "//img[contains(@src,'cal_next_nav')]")
	private WebElement forwordSlideBT;

	@CacheLookup
	@FindBy(xpath = "//img[contains(@src,'cal_prev_nav')]")
	private WebElement backwordSlideBT;

	@CacheLookup
	@FindBy(id = "view_Option")
	private WebElement viewDD;
	
	@CacheLookup
	@FindBy(name = "onlyforuser")
	private WebElement ofDD;

}
