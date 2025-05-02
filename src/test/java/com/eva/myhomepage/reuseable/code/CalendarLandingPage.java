package com.eva.myhomepage.reuseable.code;

import com.eva.webutil.WebUtil;

public class CalendarLandingPage extends CalendarLandingOR {
	private WebUtil util = WebUtil.getInstance();

	public CalendarLandingPage(WebUtil util) {
		super(util);
		this.util = util;
	}

	public void clickOnAllEventsAndTodos() {
		util.click(getAllEventsAndTodosLT(), "All Events&Todos");
	}

	public void clickDay() {
		util.click(getDayLT(), "Day");
	}

	public void clickMonth() {
		util.click(getMonthLT(), "Month");
	}

	public void clickWeek() {
		util.click(getWeekLT(), "Week");
	}

	public void clickYear() {
		util.click(getYearLT(), "Year");
	}

	public void events() {
		util.click(getEventsLT(), "Events");
	}

	public void to_Dos() {
		util.click(getTo_DosLT(), "To Dos");
	}

	public void clickCall() {
		util.moveToElement(getAddMenuLT(), "Add");
		util.click(getCallLT(), "Call");
	}

	public void clickMeeting() {
		util.moveToElement(getAddMenuLT(), "Add");
		util.click(getMeetingLT(), "Meeting");
	}

	public void clickTO_Do() {
		util.moveToElement(getAddMenuLT(), "Add");
		util.click(getTo_DoLT(), "To Do");
	}

	public void clickForwordSlideButton() {
		util.click(getForwordSlideBT(), "Forword Slide Button");
	}

	public void clickBackwordSlideButton() {
		util.click(getBackwordSlideBT(), "Backword Slide Button");
	}

	public void veiw(String selByValue) {
		util.selectByValue(getViewDD(), selByValue, "View Dropdown");
	}

	public void of(String selByValue) {
		util.selectByValue(getOfDD(), selByValue, "Of Dropdown");
	}

}
